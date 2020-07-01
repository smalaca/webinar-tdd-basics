package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class TransferService {
    private final ScheduledTransferRegistry registry;

    TransferService(ScheduledTransferRegistry registry) {
        this.registry = registry;
    }

    void schedule(String name, String accountFrom, String accountTo, BigDecimal amount) {
        ScheduledTransfer scheduledTransfer = new ScheduledTransferFactory()
                .create(name, accountFrom, accountTo, amount);

        registry.register(scheduledTransfer);
    }
}
