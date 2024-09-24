package org.diegopacco.corfid.dto;

import lombok.Getter;

@Getter
public class CrearTipoCambio {
    private String monedaOrigen;
    private String monedaDestino;
    private double tipoCambio;
}
