package br.com.dio.model;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.UUID;

public record MoneyAudit (
        UUID transactionId,
        BankService targetService,
        String description,
        OffsetDateTime createdAt)
{

}
