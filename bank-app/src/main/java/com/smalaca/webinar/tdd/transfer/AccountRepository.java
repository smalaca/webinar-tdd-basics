package com.smalaca.webinar.tdd.transfer;

public interface AccountRepository {
    boolean exists(String accountNumber);
}
