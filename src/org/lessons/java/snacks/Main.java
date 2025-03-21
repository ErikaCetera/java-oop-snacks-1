package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // oggetti studente
        Student student1 = new Student("Erika", "Cetera", 31);
        Student student2 = new Student("Mario", "Rossi", 29);
        Student student3 = new Student("Luca", "Bianchi", 30);

        System.out.println(student1.getInfoStudent());

        // oggetto conto bancario
        BankAccount bank1 = new BankAccount("ABC123", new BigDecimal("0.00"));

        System.out.println(bank1.depositMoney(new BigDecimal("20.00")));
        System.out.println(bank1.withdrawMoney(new BigDecimal("10.00")));
        System.out.println(bank1.getBalance());

        // ogetto registro studenti
        StudentRegistry registry = new StudentRegistry();

        System.out.println(registry.addStudent(student1));
        System.out.println(registry.addStudent(student2));
        System.out.println(registry.addStudent(student3));
        System.out.println(registry.getStudents());
        registry.printRegistry();

    }
}
