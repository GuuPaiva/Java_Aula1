package Erros;

public class StringVazia extends RuntimeException{

    private String nomeDoAtributo;

    public StringVazia(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMenssage(){

        return String.format("O atributo %s está vazio", nomeDoAtributo);
    }

}
