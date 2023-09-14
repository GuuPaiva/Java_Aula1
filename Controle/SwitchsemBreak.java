package Controle;

import java.util.Scanner;

public class SwitchsemBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digite sua faixa: ");
        //String faixa = entrada.nextLine();

        //switch (faixa.toLowerCase()){
           //case "preta":
                //System.out.println("sei o Bassai-dai");
            //case "marrom":
               // System.out.println("sei o tekki shodan");
            //case  "roxa"://
               // System.out.println("sei o heian godan");
            //case "verde":
               // System.out.println("sei o heian yodan");
            //case "laranja:":
                //System.out.println("sei o heian sadan");
            //case "vermelha":
                //System.out.println("sei o heian nidan");
            //case "amarelo":
                //System.out.println("sei o heian shodan");
                //break;
            //default:
                //System.out.println("nao sei de nada");

                int idade;
                System.out.println("Digite a idade: ");
                idade = entrada.nextInt();
                switch (idade){
                    case 3:
                        System.out.println("voce consegue andar");
                    case 2:
                        System.out.println("voce sabe escrever");
                    case 1:
                        System.out.println("voce acabou de acordar");
                        break;
                    default:
                        System.out.println("ainda esta dormindo");


                }
        }
    }

