package com.sudamericano.bank.application.usecase.structure.R21;

import com.sudamericano.bank.application.port.out.ExecuteR22StoredProcedurePort;
import com.sudamericano.bank.application.port.out.LoadR22DetallePort;
import com.sudamericano.bank.domain.event.R22GeneratedEvent;
import com.sudamericano.bank.domain.model.valueobject.R22Detalle;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class GenerateR22FromR21UseCase {

    private final ExecuteR22StoredProcedurePort executeR22StoredProcedurePort;
    private final LoadR22DetallePort loadR22DetallePort;
    private final ApplicationEventPublisher eventPublisher;

    public void execute(Long r21CabeceraId, Long r22CabeceraId) {

        executeR22StoredProcedurePort.execute(r21CabeceraId, r22CabeceraId);

        List<R22Detalle> detalles =
                loadR22DetallePort.loadByCabeceraId(r21CabeceraId);

        eventPublisher.publishEvent(
                new R22GeneratedEvent(r21CabeceraId, detalles)
        );
    }
}