package org.diegopacco.corfid.service;

import org.diegopacco.corfid.dto.ActualizarTipoCambio;
import org.diegopacco.corfid.dto.BusquedaTipoCambio;
import org.diegopacco.corfid.dto.CrearTipoCambio;
import org.diegopacco.corfid.entity.TipoCambio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoCambioService {
    Mono<TipoCambio> crearTipoCambio(TipoCambio tipoCambio);
    Mono<TipoCambio> actualizarTipoCambio(Integer id, ActualizarTipoCambio req);
    Mono<TipoCambio> buscarTipoCambio(BusquedaTipoCambio req);
    Flux<TipoCambio> obtenerTipoCambios();
}
