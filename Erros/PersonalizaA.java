package Erros;

public class PersonalizaA extends RuntimeException{

    private String nomeDoAtributo;

    public PersonalizaA(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMenssage(){

        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }

}
