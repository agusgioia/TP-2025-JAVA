package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesCancelaciones;

import lombok.Data;

@Data
public class Cancelaciones {
    private DescripcionCancelacion description;
    private String type;

    private String amount;
    private String deadline;
    private int numberOfNights;
}
