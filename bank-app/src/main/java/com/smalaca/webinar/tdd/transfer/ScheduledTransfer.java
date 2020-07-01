package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class ScheduledTransfer {
    private final String id;
    private final String name;
    private final String accountFrom;
    private final String accountTo;
    private final BigDecimal amount;

    ScheduledTransfer(
            String id, String name, String accountFrom, String accountTo, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }
}
