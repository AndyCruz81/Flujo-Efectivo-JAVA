/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Sistemas-12
 */
public class Proyecto {
    private double inversion;
    private int plazo;
    private double tasa;
    private double valorSalvamento;

    public Proyecto() {
    }

    public Proyecto(double inversion, int plazo, double tasa, double valorSalvamento) {
        this.inversion = inversion;
        this.plazo = plazo;
        this.tasa = tasa;
        this.valorSalvamento = valorSalvamento;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getValorSalvamento() {
        return valorSalvamento;
    }

    public void setValorSalvamento(double valorSalvamento) {
        this.valorSalvamento = valorSalvamento;
    }
    
}
