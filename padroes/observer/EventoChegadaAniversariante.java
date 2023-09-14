package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

    private final Date momento;

    public Date getMomento() {
        return momento;
    }

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }
}
