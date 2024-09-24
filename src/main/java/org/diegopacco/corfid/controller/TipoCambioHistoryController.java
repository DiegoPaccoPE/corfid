package org.diegopacco.corfid.controller;

import lombok.RequiredArgsConstructor;
import org.diegopacco.corfid.dto.CalcularTipoCambio;
import org.diegopacco.corfid.entity.TipoCambioHistory;
import org.diegopacco.corfid.service.TipoCambioHistoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tipo-cambio-history")
@RequiredArgsConstructor
public class TipoCambioHistoryController {
    private final TipoCambioHistoryService tipoCambioHistoryService;

    @PostMapping("/calcular-monto-destino")
    public Mono<TipoCambioHistory> calcularMontoDestino(@RequestBody CalcularTipoCambio calcularTipoCambio) {
        return tipoCambioHistoryService.guardarTipoCambioHistory(calcularTipoCambio);
    }
}
