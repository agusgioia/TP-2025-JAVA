package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta;

import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.VariacionesPrecio.Variaciones;
import lombok.Data;

@Data
public class DetallesPrecio {
    private String currency;
    private String base;
    private String total;
    private Variaciones variations;
}
