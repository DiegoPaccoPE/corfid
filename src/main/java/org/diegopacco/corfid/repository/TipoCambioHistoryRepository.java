package org.diegopacco.corfid.repository;

import org.diegopacco.corfid.entity.TipoCambioHistory;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TipoCambioHistoryRepository extends R2dbcRepository<TipoCambioHistory, Integer> {
}
