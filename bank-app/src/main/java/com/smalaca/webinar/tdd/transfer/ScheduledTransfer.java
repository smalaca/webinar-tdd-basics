package com.smalaca.webinar.tdd.transfer;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ScheduledTransfer that = (ScheduledTransfer) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(name, that.name)
                .append(accountFrom, that.accountFrom)
                .append(accountTo, that.accountTo)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(accountFrom)
                .append(accountTo)
                .append(amount)
                .toHashCode();
    }
}
