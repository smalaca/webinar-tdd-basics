package com.smalaca.webinar.tdd.transfer;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class ScheduledTransferTest {
    /*
    REQUIREMENTS:
    1. Register scheduled transfer with information:
        - unique id of the transfer (<accountFrom>-<accountTo>-<name>)
        - name of the transfer
        - account from
        - account to
        - money to transfer
    2. Throw exception if there's no account for account number
     */

    @Test
    void shouldRegisterScheduledTransfer() {
        ScheduledTransferRegistry registry = mock(ScheduledTransferRegistry.class);
        TransferService service = new TransferServiceFactory().create();

        service.schedule("name", "accountFrom", "accountTo", BigDecimal.valueOf(13));

        ScheduledTransfer expected = new ScheduledTransfer(
                "accountFrom-accountTo-name", "name", "accountFrom", "accountTo", BigDecimal.valueOf(13));
        then(registry).should().register(expected);
    }
}
