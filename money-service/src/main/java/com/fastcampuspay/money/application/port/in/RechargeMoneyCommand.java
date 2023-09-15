package com.fastcampuspay.money.application.port.in;


import com.fastcampuspay.common.SelfValidating;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@Builder
@EqualsAndHashCode(callSuper = false)
public
class RechargeMoneyCommand extends SelfValidating<RechargeMoneyCommand> {

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    @NotNull
    private final String address;

    @NotNull
    private final boolean isValid;

    public RechargeMoneyCommand(String name, String email, String address, boolean isValid) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
    }
}
