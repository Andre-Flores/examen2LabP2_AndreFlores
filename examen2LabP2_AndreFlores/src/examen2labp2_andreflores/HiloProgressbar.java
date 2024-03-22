/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_andreflores;

import javax.swing.JProgressBar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author andre
 */
public class HiloProgressbar extends Thread implements Runnable {

    private JProgressBar barra1;
    private JProgressBar barra2;
    private int velocidad1;
    private int velocidad2;
    private JLabel timer;

    public HiloProgressbar(JProgressBar barra1, JProgressBar barra2, int velocidad1, int velocidad2, JLabel timer) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.velocidad1 = velocidad1;
        this.velocidad2 = velocidad2;
        this.timer = timer;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public int getVelocidad1() {
        return velocidad1;
    }

    public void setVelocidad1(int velocidad1) {
        this.velocidad1 = velocidad1;
    }

    public int getVelocidad2() {
        return velocidad2;
    }

    public void setVelocidad2(int velocidad2) {
        this.velocidad2 = velocidad2;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        while (barra1.getValue() < 1000 && barra2.getValue() < 1000) {
            long tiempoPasado = System.currentTimeMillis() - comienzo;
            long minutos = (tiempoPasado / 60000) % 60;
            long segundos = (tiempoPasado / 1000) % 60;

            barra1.setValue(barra1.getValue() + velocidad1);
            barra2.setValue(barra2.getValue() + velocidad2);
            timer.setText(minutos + " minutos " + segundos + " segundos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ((barra1.getValue() == barra1.getMaximum()) && (barra2.getValue() == barra2.getMaximum())) {
                JOptionPane.showMessageDialog(barra2, "Los carros han empatado y tardaron: " + timer.getText());

            }else if (barra1.getValue() == 1000) {
                JOptionPane.showMessageDialog(barra1, "El carro 1 ha ganado con un tiempo de : " + timer.getText());
            } else if (barra2.getValue() == 1000) {
                JOptionPane.showMessageDialog(barra1, "El carro 2 ha ganado con un tiempo de : " + timer.getText());

            }

        }

    }
}
