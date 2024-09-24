package org.diegopacco.corfid.repository;

import org.diegopacco.corfid.entity.TipoCambio;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface TipoCambioRepository extends R2dbcRepository<TipoCambio, Integer> {
    Mono<TipoCambio> findByMonedaOrigenAndMonedaDestino(String origen, String destino);
}
