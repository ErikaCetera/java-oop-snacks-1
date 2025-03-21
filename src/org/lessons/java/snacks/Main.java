package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // oggetto studente
        Student student1 = new Student("Erika", "Cetera", 31);

        System.out.println(student1.getInfoStudent());

        // oggetto conto bancario
        BankAccount bank1 = new BankAccount("ABC123", new BigDecimal("0.00"));

        
        System.out.println(bank1.depositMoney(new BigDecimal("20.00")));
        System.out.println(bank1.withdrawMoney(new BigDecimal("10.00")));
        System.out.println(bank1.getBalance());
    }
}
