package com.smalaca.webinar.tdd.transfer;

class TransferServiceFactory {
    TransferService create(ScheduledTransferRegistry registry) {
        return new TransferService(registry);
    }
}
