package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio;

import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte.Itinerario;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte.OpcionesDePrecio;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte.OpcionesUsuario;
import com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte.Precio;
import lombok.Data;

import java.util.List;

@Data
public class Vuelo {
    private String id;
    private List<Itinerario> itineraries;
    private Precio price;
    private OpcionesDePrecio pricingOptions;
    private List<OpcionesUsuario> travelerPricings;
    private List<String> validatingAirlineCodes;
    private String lastTicketingDate;
}
