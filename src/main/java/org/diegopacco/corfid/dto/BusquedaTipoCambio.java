package org.diegopacco.corfid.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BusquedaTipoCambio {
    private String monedaOrigen;
    private String monedaDestino;
}
