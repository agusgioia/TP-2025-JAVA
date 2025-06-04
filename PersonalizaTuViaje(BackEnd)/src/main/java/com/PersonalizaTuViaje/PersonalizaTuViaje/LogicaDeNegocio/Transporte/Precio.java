package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte;

import lombok.Data;

@Data
public class Precio {
    private String base;
    private String currency;
    private String grandTotal;
}
