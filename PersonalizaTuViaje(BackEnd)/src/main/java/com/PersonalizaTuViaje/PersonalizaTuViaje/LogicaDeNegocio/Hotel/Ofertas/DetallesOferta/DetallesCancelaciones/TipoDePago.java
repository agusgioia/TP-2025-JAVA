package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesCancelaciones;

import lombok.Data;

import java.util.List;

@Data
public class TipoDePago {
    private List<PoliticasTarjetas> creditCardPolicies;
    private List<String> creditCards;
    private List<String> methods;
}
