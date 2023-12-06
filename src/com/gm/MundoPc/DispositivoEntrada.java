
package com.gm.MundoPc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // Getters y Setters para tipoDeEntrada
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoDeEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    // Getters y Setters para marca
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método toString para mostrar la información del dispositivo de entrada

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
   
    }

    