package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte;

import lombok.Data;

import java.util.List;

@Data
public class OpcionesUsuario {
    private PrecioUsuario price;
    private List<DetallesTarifa> fareDetailsBySegment;
}
