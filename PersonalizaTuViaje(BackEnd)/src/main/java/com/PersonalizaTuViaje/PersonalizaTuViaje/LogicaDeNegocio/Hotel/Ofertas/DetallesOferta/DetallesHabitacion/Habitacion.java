package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesHabitacion;

import lombok.Data;

@Data
public class Habitacion {
    private String type;
    private TipoEstimado typeEstimated;
    private Descripcion description;
}
