package examen2labp2_andreflores;

import java.io.Serializable;


/**
 *
 * @author andre
 */
public class Carro implements Serializable{

    private String marca;
    private String modelo;
    private int velocidad;

    public Carro(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return marca + modelo + velocidad;
    }

}
