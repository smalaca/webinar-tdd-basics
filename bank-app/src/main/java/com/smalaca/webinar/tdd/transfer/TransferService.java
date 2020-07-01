package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class TransferService {
    private final ScheduledTransferRegistry registry;

    TransferService(ScheduledTransferRegistry registry) {
        this.registry = registry;
    }

    void schedule(String name, String accountFrom, String accountTo, BigDecimal amount) {
        String id = accountFrom + "-" + accountTo + "-" + name;
        ScheduledTransfer scheduledTransfer = new ScheduledTransfer(id, name, accountFrom, accountTo, amount);

        registry.register(scheduledTransfer);
    }
}
