import excecao.ExplosaoExeption;
import modelo.Campo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {


    private Campo campo;

    @BeforeEach
    void IniciarCampo(){
        campo = new Campo(3,3);
    }

    @Test
    void testeVizinhoDistanciaEsquerda(){
        Campo vizinho = new Campo(3,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistanciaDireita(){
        Campo vizinho = new Campo(3,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistanciaEmCima(){
        Campo vizinho = new Campo(2,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistanciaEmbaixo(){
        Campo vizinho = new Campo(4,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void TesteValorAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    void alternarMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void alternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeNaoMinadoNaoMarcado(){
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado(){
        campo.minar();
        campo.alternarMarcacao();
    }
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();
        assertThrows(ExplosaoExeption.class, () ->{ campo.abrir();} );
    }

    @Test
    void testeAbrirComVizinhos1(){

        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertTrue(campo.isAberto() && campo11.isAberto());

    }
    @Test
    void testeAbrirComVizinhos2(){

        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,1);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertFalse(campo.isAberto() && campo11.isFechado());

    }


}
