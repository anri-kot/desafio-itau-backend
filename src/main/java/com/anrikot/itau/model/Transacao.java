package com.anrikot.itau.model;

import java.time.OffsetTime;

public class Transacao {
    private double value;
    private OffsetTime dataHora;

    public Transacao(OffsetTime dataHora, double value) {
        this.dataHora = dataHora;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public OffsetTime getDataHora() {
        return dataHora;
    }
}
