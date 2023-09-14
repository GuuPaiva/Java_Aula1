package oo.composicao;

public class Carro {

    final Motor motor;
    Carro(){
        this.motor = new Motor(this);
    }
    void acelerar () {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar (){

        motor.ligado = true;
    }

   void porta () {
       if (!motor.ligado ) {
           System.out.println("A porta está aberta ");;
       } else {
           System.out.println("A porta está fechada");
       }
   }
    void desligar (){
        motor.ligado = false;
        System.out.println("o carro está desligado");
        ;
    }

    boolean estaLigado(){

        return motor.ligado;
    }

    boolean estaDesligado(){
        return motor.ligado = false;
    }
}