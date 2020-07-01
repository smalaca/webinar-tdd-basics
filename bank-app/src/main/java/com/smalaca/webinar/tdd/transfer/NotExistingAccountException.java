package com.smalaca.webinar.tdd.transfer;

class NotExistingAccountException extends RuntimeException {
    public NotExistingAccountException(String accountNumber) {
        super("Account with number: \"" + accountNumber + "\" does not exist.");
    }
}
