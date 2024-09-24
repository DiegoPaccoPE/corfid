CREATE TABLE IF NOT EXISTS tipo_cambio(
    id INT NOT NULL AUTO_INCREMENT,
    moneda_origen VARCHAR,
    moneda_destino VARCHAR,
    tipo_cambio DOUBLE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tipo_cambio_history(
    id INT NOT NULL AUTO_INCREMENT,
    id_tipo_cambio INT NOT NULL,
    moneda_valor_origen DOUBLE NOT NULL,
    moneda_valor_destino DOUBLE NOT NULL,
    usuario_id INTEGER NOT NULL,
    CONSTRAINT fk_tipo_cambio FOREIGN KEY(id_tipo_cambio) REFERENCES tipo_cambio(id) ON DELETE CASCADE
);