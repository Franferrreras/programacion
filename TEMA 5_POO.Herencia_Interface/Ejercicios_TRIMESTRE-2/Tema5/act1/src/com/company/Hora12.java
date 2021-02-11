package com.company;

public class Hora12 extends Hora{

    private String franja;

    public Hora12(Integer hora, Integer minuto, String franja) {
        super(hora, minuto);
        this.franja = franja;
    }

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }


    public void setFormato() {
        if (hora > 12) {
            hora-=12;
            franja="pm";
        }else {
            franja="am";
        }
    }

    @Override
    public void setHora(Integer hora) {
       if ( hora>=0 && hora <= 12){
           this.hora = hora;
       }
    }

    @Override
    public void inc() {
        minuto++;
        if (minuto>59) {
            hora++;
            minuto=0;

            if (hora > 11 && franja.equals("am")) {
                franja = "pm";

            }else if (hora > 11 && franja.equals("pm")) {
                franja = "am";
            }

            if (hora > 12 ) {
                hora-=12;
            }
        }
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", franja='" + franja + '\'' +
                '}';
    }
}
