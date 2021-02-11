package com.company;

public class Hora {

    protected Integer hora;
    protected Integer minuto;

    public Hora(Integer hora, Integer minuto) {
        if (hora <0 || hora >24 || minuto >59 || minuto <0) {
            this.hora=12;
            this.minuto=0;
        }
        this.hora = hora;
        this.minuto = minuto;
    }

    public Hora() {
        this(12,0);
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        if (hora >=0 && hora <=23) {
            this.hora = hora;
        }else {
            this.hora=12;
        }
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        if (minuto>=0 && minuto<=59) {
            this.minuto = minuto;
        }else {
            this.minuto = 0;
        }
    }

    public void inc() {
       minuto++;
       if (minuto > 59) {
           hora++;
           minuto = 0;

           if (hora>24) {
               hora=0;
           }
       }
    }

    @Override
    public String toString() {
        if (hora < 12 && minuto < 10) {
            return "0" + hora + ":" + "0" + minuto;
        }
        if (hora < 12 && minuto > 10) {
            return "0" + hora + ":" + minuto;
        }
        if (hora > 10 && minuto < 10) {
            return hora + ":" + "0" + minuto;
        }
        return null;
    }
}
