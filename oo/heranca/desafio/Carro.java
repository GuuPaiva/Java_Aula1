package oo.heranca.desafio;

public class Carro {

    final int  VELOCIDADE_MAXIMA;
    int  velocidadeAtual;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += delta;
        }
    }
    void frear(){
        if( velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}

