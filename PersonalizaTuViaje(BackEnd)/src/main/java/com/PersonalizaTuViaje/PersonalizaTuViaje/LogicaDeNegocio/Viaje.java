package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio;

import lombok.Data;

@Data
public class Viaje {
    private Integer idViaje;
    private Vuelo vuelo;
    private Alojamiento alojamiento;
}
