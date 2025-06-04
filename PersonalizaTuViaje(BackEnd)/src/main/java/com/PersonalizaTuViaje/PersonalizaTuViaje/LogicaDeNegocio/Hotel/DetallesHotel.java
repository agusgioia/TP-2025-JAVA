package com.PersonalizaTuViaje.PersonalizaTuViaje.LogicaDeNegocio.Hotel;

import lombok.Data;

@Data
public class DetallesHotel {
    private String name;
    private String hotelId;
    private String cityCode;
    private float latitude;
    private float longitude;
}
