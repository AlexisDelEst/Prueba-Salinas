package com.producto.entity;

public class Abono {
    double abonoPuntual;
    double abonoNormal;

    public Abono() {
    }

    public Abono(double abonoPuntual, double abonoNormal) {
        this.abonoPuntual = abonoPuntual;
        this.abonoNormal = abonoNormal;
    }

    public double getAbonoPuntual() {
        return abonoPuntual;
    }

    public void setAbonoPuntual(double abonoPuntual) {
        this.abonoPuntual = abonoPuntual;
    }

    public double getAbonoNormal() {
        return abonoNormal;
    }

    public void setAbonoNormal(double abonoNormal) {
        this.abonoNormal = abonoNormal;
    }

    @Override
    public String toString() {
        return "Abono{" +
                "abonoPuntual=" + abonoPuntual +
                ", abonoNormal=" + abonoNormal +
                '}';
    }
}
