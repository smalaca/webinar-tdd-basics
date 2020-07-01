package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class ScheduledTransferFactory {
    ScheduledTransfer create(String name, String accountFrom, String accountTo, BigDecimal amount) {
        String id = accountFrom + "-" + accountTo + "-" + name;
        return new ScheduledTransfer(id, name, accountFrom, accountTo, amount);
    }
}
