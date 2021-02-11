package com.company;

public class Orcos extends Personajes implements Atacar{

    private double tonelaje;

    public Orcos(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado,double tonelaje) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tonelaje = tonelaje;
    }

    public Orcos(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tonelaje = 10;
    }

    public Orcos(String nombre) {
        super(nombre);
        this.tonelaje = 10;
    }


    @Override
    public void atacarPersonaje(Personajes p) {
        if (!p.getClass().equals(getClass())) {

            System.out.println("Soy"+getNombre()+" y estoy atacando");
            int damage = p.isEncantado() ? (getCapAtaque()-p.getCapacidadDefensa())*2 : (getCapAtaque()-p.getCapacidadDefensa());

            p.setEnergia(p.getEnergia()-damage);
        }else {
            System.out.println("No puedes atacar a personajes de tu misma clase");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Tonelaje"+tonelaje;
    }


}
