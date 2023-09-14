package visao;

import modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Paineltabuleiro extends JPanel {
    public Paineltabuleiro(Tabuleiro tabuleiro){

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

            tabuleiro.paraCada(campo -> add(new BotaoCampo(campo)));
            tabuleiro.registrarObservadores(e ->{

                SwingUtilities.invokeLater(() -> {
                if(e.isGanhou()){
                    JOptionPane.showMessageDialog(this, "Ganhouuu");
                } else {
                    JOptionPane.showMessageDialog(this, "Perdeuuuu");
                }
                tabuleiro.reiniciar();
            });
        });
    }
}
