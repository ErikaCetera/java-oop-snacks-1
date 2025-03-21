package org.lessons.java.snacks;

import java.math.BigDecimal;

public class BankAccount {

    // attributi
    private String accountNumber;
    private BigDecimal balance;

    // capacità

    // costruttore
    public BankAccount(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    // metodi di sola lettura

    public String getAccountNumber() {
        return this.accountNumber;
    }

    // saldo corrente
    public BigDecimal getBalance() {
        return this.balance;
    }

    // depositare denaro
    public String depositMoney(BigDecimal money) {
        if (money.compareTo(BigDecimal.ZERO) <= 0) {
            return "L'importo da depositare deve essere positivo";
        } else {
            balance = balance.add(money);
        }
        return "Abbiamo depositato € " + money + " al tuo saldo.";
    }

    // prelevare denaro
    public String withdrawMoney(BigDecimal money) {
        if (money.compareTo(BigDecimal.ZERO) <= 0) {
            return "L'importo da prelevare deve essere positivo";

        } else if (balance.compareTo(money) < 0) {
            return "Saldo insufficiente";
        } else {
            balance = balance.subtract(money);
        }
        return "Sono stati prelevati dal tuo conto € " + balance;
    }

}
