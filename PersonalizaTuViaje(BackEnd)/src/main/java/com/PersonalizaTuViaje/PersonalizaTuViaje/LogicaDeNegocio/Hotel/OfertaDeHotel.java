package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel;

import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.Ofertas.Oferta;
import lombok.Data;

import java.util.List;

@Data
public class OfertaDeHotel {
    private DetallesHotel hotel;
    private Boolean available;
    private List<Oferta> offers;
}
