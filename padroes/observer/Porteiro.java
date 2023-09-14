package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();

    public void registrarObservador(ChegadaAniversarianteObservador observador){
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner scanner = new Scanner(System.in);


        String valor = "";
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.print("Aniversariante chegou???");
            valor = scanner.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                System.out.println("Avisar os convidados");
                observadores.stream().forEach(o -> o.chegou(evento));
                //notificar os obersavadores !!
            }else {
                System.out.println("Alarme falso");
            }
        }

    }
}
