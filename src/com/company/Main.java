package com.company;

public class Main {

    public static void main(String[] args) {
        //zadanie 1
        String firstName = "Иванов ";
        String middleName = "Семён ";
        String lastName = "Семёнович ";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        //zadanie 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //zadanie 3
        System.out.print("Данные ФИО сотрудника — ");
        String[] array = fullName.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("ё")) {
                array[i] = "е";
            }
            System.out.print(array[i]);
        }

    }
}
