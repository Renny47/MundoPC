package com.gm.MundoPc;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double Tamaño;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double Tamaño) {
        this();
        this.marca = marca;
        this.Tamaño = Tamaño;
    }

    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", Tama\u00f1o=" + Tamaño + '}';
    }

}
