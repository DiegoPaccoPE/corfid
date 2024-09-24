CREATE TABLE IF NOT EXISTS tipo_cambio(
    id INT NOT NULL AUTO_INCREMENT,
    moneda_origen VARCHAR,
    moneda_destino VARCHAR,
    tipo_cambio DOUBLE,
    PRIMARY KEY (id)
);