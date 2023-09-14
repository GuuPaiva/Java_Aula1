package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println("O heroi tem " + heroi.vida + " de vida.");
        System.out.println("O monstro tem " + monstro.vida + " de vida.");

        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        heroi.atacar(monstro);


        System.out.println("O heroi tem " + heroi.vida + " de vida.");
        System.out.println("O monstro tem " + monstro.vida + " de vida.");

    }
}
