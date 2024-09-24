package org.diegopacco.corfid.controller;

import lombok.RequiredArgsConstructor;
import org.diegopacco.corfid.dto.ActualizarTipoCambio;
import org.diegopacco.corfid.dto.BusquedaTipoCambio;
import org.diegopacco.corfid.entity.TipoCambio;
import org.diegopacco.corfid.service.TipoCambioService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tipos-cambios")
@RequiredArgsConstructor
public class TipoCambioController {
    private final TipoCambioService tipoCambioService;

    @GetMapping
    public Flux<TipoCambio> getTipoCambios() {
        return tipoCambioService.obtenerTipoCambios();
    }

    @PutMapping("/{id}")
    public Mono<TipoCambio> actualizarTipoCambio(@PathVariable Integer id, @RequestBody ActualizarTipoCambio req) {
        return tipoCambioService.actualizarTipoCambio(id, req);
    }

    @PostMapping("/buscar-tipo-cambio")
    public Mono<TipoCambio> buscarTipoCambio(@RequestBody BusquedaTipoCambio req) {
        return tipoCambioService.buscarTipoCambio(req);
    }

    @PostMapping
    public Mono<TipoCambio> crearTipoCambio(@RequestBody TipoCambio tipoCambio) {
        return tipoCambioService.crearTipoCambio(tipoCambio);
    }
}
