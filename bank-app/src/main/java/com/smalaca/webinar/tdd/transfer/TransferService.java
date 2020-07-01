package com.smalaca.webinar.tdd.transfer;

import java.math.BigDecimal;

class TransferService {
    private final ScheduledTransferRegistry registry;
    private final AccountRepository accountRepository;
    private final ScheduledTransferFactory scheduledTransferFactory;

    TransferService(ScheduledTransferRegistry registry, AccountRepository accountRepository, ScheduledTransferFactory scheduledTransferFactory) {
        this.registry = registry;
        this.accountRepository = accountRepository;
        this.scheduledTransferFactory = scheduledTransferFactory;
    }

    void schedule(String name, String accountFrom, String accountTo, BigDecimal amount) {
        if (!accountRepository.exists(accountFrom)) {
            throw new NotExistingAccountException(accountFrom);
        }

        ScheduledTransfer scheduledTransfer = scheduledTransferFactory.create(name, accountFrom, accountTo, amount);

        registry.register(scheduledTransfer);
    }
}
