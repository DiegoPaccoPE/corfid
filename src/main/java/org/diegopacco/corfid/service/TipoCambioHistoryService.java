package org.diegopacco.corfid.service;

import org.diegopacco.corfid.dto.CalcularTipoCambio;
import org.diegopacco.corfid.entity.TipoCambioHistory;
import reactor.core.publisher.Mono;

public interface TipoCambioHistoryService {
    Mono<TipoCambioHistory> guardarTipoCambioHistory(CalcularTipoCambio req);
}
