package org.diegopacco.corfid.dto;

import lombok.Getter;

@Getter
public class CalcularTipoCambio {
    private String monedaOrigen;
    private String monedaDestino;
    private double monedaOrigenValor;
}
