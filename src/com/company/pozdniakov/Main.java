package com.company.pozdniakov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter sal");
            int sal = in.nextInt();
            Employee emp1 = new Employee("Max",sal);
            // Employee emp2 = new Employee("Max",123);
        }catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        }catch (IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Unhandled exception:" + e.getMessage());
        }

        try {
            System.out.println("Enter Name");
            String name = in.next();
            //Employee emp1 = new Employee("Rembo",-223);
            Employee emp2 = new Employee(name,123);
        }catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        }catch (IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Unhandled exception:" + e.getMessage());
        }




//     Manager man1 = new Manager("King",999);
//     Manager man2 = new Manager("Balake",800);
//     man2.setManager(man1);

//        Manager man3 = new Manager("Nick",700);
//        Manager man4 = new Manager("CoCo",600);
//        man4.setManager(man3);
//        Manager man5 = new Manager("Baks",500);
//        man5.setManager(man4);
//        Manager man6 = new Manager("Wrake",400);
//        man6.setManager(man5);
//        Employee emp4 = new Employee("Buble");
//        emp4.setManager(man6);
//
//        emp4.getManagerName();
//        System.out.println(emp4.getTopManager(emp4.getManager()).toString());
    }
}

