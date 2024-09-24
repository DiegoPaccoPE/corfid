package org.diegopacco.corfid.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("tipo_cambio")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class TipoCambio {
    @Id
    private Integer id;

    @Column("moneda_origen")
    private String monedaOrigen;

    @Column("moneda_destino")
    private String monedaDestino;

    @Column("tipo_cambio")
    private double tipoCambio;
}
