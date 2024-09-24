package org.diegopacco.corfid.service.impl;

import lombok.RequiredArgsConstructor;
import org.diegopacco.corfid.dto.BusquedaTipoCambio;
import org.diegopacco.corfid.dto.CalcularTipoCambio;
import org.diegopacco.corfid.entity.TipoCambioHistory;
import org.diegopacco.corfid.repository.TipoCambioHistoryRepository;
import org.diegopacco.corfid.repository.TipoCambioRepository;
import org.diegopacco.corfid.service.TipoCambioHistoryService;
import org.diegopacco.corfid.service.TipoCambioService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class TipoCambioHistoryServiceImpl implements TipoCambioHistoryService {
    private final TipoCambioService tipoCambioService;
    private final TipoCambioHistoryRepository tipoCambioHistoryRepository;
    private final TipoCambioRepository tipoCambioRepository;

    @Override
    public Mono<TipoCambioHistory> guardarTipoCambioHistory(CalcularTipoCambio req) {
        BusquedaTipoCambio body = BusquedaTipoCambio
                .builder()
                .monedaOrigen(req.getMonedaOrigen())
                .monedaDestino(req.getMonedaDestino())
                .build();
        return tipoCambioService.buscarTipoCambio(body)
                .flatMap(tipoCambio -> {
                    double valorConvertido = req.getMonedaOrigenValor() * tipoCambio.getTipoCambio();
                    TipoCambioHistory tipoCambioHistory = TipoCambioHistory
                            .builder()
                            .idTipoCambio(tipoCambio.getId())
                            .monedaValorOrigen(req.getMonedaOrigenValor())
                            .monedaValorDestino(valorConvertido)
                            .usuarioId(1)
                            .build();
                    return tipoCambioHistoryRepository.save(tipoCambioHistory);
                });
    }
}
