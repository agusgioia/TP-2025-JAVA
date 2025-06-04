package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte;

import lombok.Data;

import java.util.List;

@Data
public class DetallesTarifa {
    private String cabin;
    private List<Servicios> amenities;
}
