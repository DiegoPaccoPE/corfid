package org.diegopacco.corfid.service.impl;

import lombok.RequiredArgsConstructor;
import org.diegopacco.corfid.dto.ActualizarTipoCambio;
import org.diegopacco.corfid.dto.BusquedaTipoCambio;
import org.diegopacco.corfid.dto.CrearTipoCambio;
import org.diegopacco.corfid.entity.TipoCambio;
import org.diegopacco.corfid.repository.TipoCambioRepository;
import org.diegopacco.corfid.service.TipoCambioService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TipoCambioServiceImpl implements TipoCambioService {
    private final TipoCambioRepository tipoCambioRepository;
    @Override
    public Mono<TipoCambio> crearTipoCambio(TipoCambio tipoCambio) {
        return tipoCambioRepository.save(tipoCambio);
    }

    @Override
    public Mono<TipoCambio> actualizarTipoCambio(Integer id, ActualizarTipoCambio req) {
        return tipoCambioRepository.findById(id)
                .flatMap(existeTipoCambio -> {
                    existeTipoCambio.setMonedaOrigen(req.getMonedaOrigen());
                    existeTipoCambio.setMonedaDestino(req.getMonedaDestino());
                    existeTipoCambio.setTipoCambio(req.getTipoCambio());
                    return tipoCambioRepository.save(existeTipoCambio);
                });
    }

    @Override
    public Mono<TipoCambio> buscarTipoCambio(BusquedaTipoCambio req) {
        return tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(req.getMonedaOrigen(), req.getMonedaDestino());
    }

    @Override
    public Flux<TipoCambio> obtenerTipoCambios() {
        return tipoCambioRepository.findAll();
    }
}
