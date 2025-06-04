package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel.OfertaDeHotel;
import lombok.Data;

import java.util.List;

@Data
public class Alojamiento {
    private List<OfertaDeHotel> data;
}
