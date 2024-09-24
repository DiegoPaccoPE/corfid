package org.diegopacco.corfid.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("tipo_cambio_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoCambioHistory {
    @Id
    private Integer id;

    @Column("id_tipo_cambio")
    private Integer idTipoCambio;

    @Column("moneda_valor_origen")
    private double monedaValorOrigen;

    @Column("moneda_valor_destino")
    private double monedaValorDestino;

    @Column("usuario_id")
    private Integer usuarioId;
}
