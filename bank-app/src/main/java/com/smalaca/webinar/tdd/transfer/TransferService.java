package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class TransferService {
    private final ScheduledTransferRegistry registry;
    private final ScheduledTransferFactory scheduledTransferFactory;

    TransferService(ScheduledTransferRegistry registry, ScheduledTransferFactory scheduledTransferFactory) {
        this.registry = registry;
        this.scheduledTransferFactory = scheduledTransferFactory;
    }

    void schedule(String name, String accountFrom, String accountTo, BigDecimal amount) {
        ScheduledTransfer scheduledTransfer = scheduledTransferFactory.create(name, accountFrom, accountTo, amount);

        registry.register(scheduledTransfer);
    }
}
