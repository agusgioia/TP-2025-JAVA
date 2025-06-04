package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte;

import lombok.Data;

@Data
public class Segmento {
    private Aircraft aircraft;
    private Localidad departure;
    private Localidad arrival;
    private String duration;
    private String carrierCode;
    private String number;
}

