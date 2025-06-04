package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas;

import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.Adultos;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesPrecio;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesHabitacion.Habitacion;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.DetallesOferta.DetallesCancelaciones.PoliticasCancelacion;
import lombok.Data;

@Data
public class Oferta {
    private String checkInDate;
    private String checkOutDate;
    private Habitacion room;
    private Adultos guests;
    private DetallesPrecio price;
    private PoliticasCancelacion policies;
}
