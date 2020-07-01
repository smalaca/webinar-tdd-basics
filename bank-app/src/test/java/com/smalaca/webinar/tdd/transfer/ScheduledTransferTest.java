package com.smalaca.webinar.tdd.transfer;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class ScheduledTransferTest {
    /*
    REQUIREMENTS:
    1. Register scheduled transfer with information:
        - unique id of the transfer (<accountFrom>-<accountTo>-<name>)
        - name of the transfer
        - account from
        - account to
        - money to transfer
    2. Throw exception if there's no account for account number
     */
    private final AccountRepository accountRepository = mock(AccountRepository.class);
    private final ScheduledTransferRegistry registry = mock(ScheduledTransferRegistry.class);
    private final TransferService service = new TransferServiceFactory().create(registry);

    @Test
    void shouldRegisterScheduledTransfer() {
        given(accountRepository.exists("accountFrom")).willReturn(true);

        service.schedule("name", "accountFrom", "accountTo", BigDecimal.valueOf(13));

        ScheduledTransfer expected = new ScheduledTransfer(
                "accountFrom-accountTo-name", "name", "accountFrom", "accountTo", BigDecimal.valueOf(13));
        then(registry).should().register(expected);
    }

    @Test
    void shouldRaiseExceptionWhenNotExistingAccountFromGiven() {
        given(accountRepository.exists("accountFrom")).willReturn(false);

        NotExistingAccountException exception = assertThrows(
                NotExistingAccountException.class, () -> service.schedule("name", "accountFrom", "accountTo", BigDecimal.valueOf(13)));

        assertThat(exception).hasMessage("Account with number: \"accountFrom\" does not exist.");
    }
}
