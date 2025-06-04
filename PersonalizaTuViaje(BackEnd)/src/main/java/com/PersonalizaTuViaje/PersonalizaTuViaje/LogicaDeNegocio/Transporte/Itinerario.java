package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Transporte;

import lombok.Data;

import java.util.List;

@Data
public class Itinerario {
    private String duration;
    private List<Segmento> segments;
}
