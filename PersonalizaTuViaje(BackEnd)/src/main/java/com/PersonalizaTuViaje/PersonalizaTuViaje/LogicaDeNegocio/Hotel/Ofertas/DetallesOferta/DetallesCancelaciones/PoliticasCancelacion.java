package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesCancelaciones;

import lombok.Data;

import java.util.List;

@Data
public class PoliticasCancelacion {
    private List<Cancelaciones> cancellations;
    private String paymentType;

    private Garantia guarantee;
}
