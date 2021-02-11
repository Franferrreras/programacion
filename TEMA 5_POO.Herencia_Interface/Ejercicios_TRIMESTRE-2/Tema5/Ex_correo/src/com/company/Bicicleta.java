package com.company;

public class Bicicleta extends Vehiculo implements Caballito {
    public Bicicleta(double vehiculoCreado, double kilometrosTotales, double kilometrosRecorridos) {
        super(vehiculoCreado, kilometrosTotales, kilometrosRecorridos);
    }

    public Bicicleta(double vehiculoCreado) {
        super(vehiculoCreado);
    }


    @Override
    public void hacerCaballito(Bicicleta b) {

    }
}
