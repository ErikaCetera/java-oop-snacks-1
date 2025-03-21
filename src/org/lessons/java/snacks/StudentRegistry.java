package org.lessons.java.snacks;

import java.util.ArrayList;

public class StudentRegistry {

    // array di oggetti privato
    private ArrayList<Student> students = new ArrayList<>();

    // costruttore vuoto senza parametri
    public StudentRegistry() {

    }

    // metodo per aggiungere studenti

    public String addStudent(Student student) {
        students.add(student);
        return "Studente " + student + " aggiunto al registro";
    }

    // metodo per ottenere la lista degli studenti
    public ArrayList<Student> getStudents() {

        return students;
    }

    // metodo per leggere lista studenti
    public void printRegistry() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }

    }
}
