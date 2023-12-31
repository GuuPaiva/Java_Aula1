package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObeservador {

    private final int linhas;

    private final int colunas;
    private final int minas;
    private List<Campo> campos = new ArrayList<>();

    private final List<Consumer<ResultadoEvento>> obseravadores = new ArrayList<>();
    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sorterMinas();

    }

    public void paraCada(Consumer<Campo> funcao){
        campos.forEach(funcao);

    }

    public void registrarObservadores(Consumer<ResultadoEvento> observador) {
        obseravadores.add(observador);
    }

    public void notificarObservadores(boolean resultado) {
        obseravadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
    }

    public void abrir(int linha, int coluna) {
        campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
                .ifPresent(c -> c.abrir());
    }

    public void alternarMarcacao(int linha, int coluna){
        campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
                .ifPresent(c -> c.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                Campo campo = new Campo(l,c);
                campo.registrarObservador(this);
                campos.add(campo);
            }
        }
    }

    private void associarOsVizinhos() {

        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sorterMinas() {
        long minasArmadas = 0;

        Predicate<Campo> minado = c -> c.isMinado();

        do {
            minasArmadas = campos.stream().filter(minado).count();
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sorterMinas();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for(int l = 0; l <linhas; l++){
            for(int c = 0; c < colunas; c++){
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        if(evento == CampoEvento.EXPLODIR){
            mostrarMinas();
            notificarObservadores(false);
        } else if (objetivoAlcancado()){
            notificarObservadores(true);
        }
    }
    private void mostrarMinas(){
        campos.stream().filter(campo -> campo.isMinado()).filter(campo -> !campo.isMinado()).forEach(campo -> campo.setAberto(true));
    }

}
