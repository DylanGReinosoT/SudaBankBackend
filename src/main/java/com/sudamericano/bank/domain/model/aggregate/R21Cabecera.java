package com.sudamericano.bank.domain.model.aggregate;



import com.sudamericano.bank.domain.event.R22CalculatedEvent;
import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R21Cabecera {

    private final Long id;
    private final List<R22Detalle> r22Detalles = new ArrayList<>();

    public R21Cabecera(Long id) {
        this.id = id;
    }

    public void addR22Detalle(R22Detalle detalle) {
        this.r22Detalles.add(detalle);
    }



    public List<R22Detalle> r22Detalles() {
        return Collections.unmodifiableList(r22Detalles);
    }
}

