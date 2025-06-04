package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.VariacionesPrecio;

import lombok.Data;

import java.util.List;

@Data
public class Variaciones {
    private BasePromedio average;
    private List<Cambio> changes;
}
