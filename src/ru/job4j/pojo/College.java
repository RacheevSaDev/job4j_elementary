package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Semyon Racheev");
        student.setGroup(1);
        student.setEntranceDay(LocalDate.of(2004, 9, 1));
        System.out.println("Студент " + student.getName() + " поступил в группу " + student.getGroup() + " в " + student.getEntranceDay());
    }
}
