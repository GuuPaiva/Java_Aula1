package visao;

import modelo.Tabuleiro;

import javax.swing.*;
    @SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
        public TelaPrincipal(){
            Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
            add(new Paineltabuleiro(tabuleiro));

            setTitle("Campo Minado");
            setSize(690,438);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            new TelaPrincipal();
        }

}
