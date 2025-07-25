package br.com.dio.model;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

import static br.com.dio.model.BankService.ACCOUNT;
@Getter
@ToString
public class AccountWallet extends Wallet {
    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
        addMoney(amount, "valor de criação de conta");
    }

    public void addMoney(final long amount, final String description) {
        var money = generateMoney(amount, description);
        this.money.addAll(money);
    }
}