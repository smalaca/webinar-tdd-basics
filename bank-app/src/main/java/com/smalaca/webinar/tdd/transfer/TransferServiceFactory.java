package com.smalaca.webinar.tdd.transfer;

class TransferServiceFactory {
    TransferService create(ScheduledTransferRegistry registry, AccountRepository accountRepository) {
        return new TransferService(registry, accountRepository, new ScheduledTransferFactory());
    }
}
