package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("bonjour");

        Employe emp = new Employe("Hamidi","Johan","Mfd55", LocalDate.now(),2500.0);
        System.out.println(emp.getSalaire());

        Employe emp3 = new Employe();
        try {
            emp3.setDateEmbauche(new LocalDate(2018,10,5));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(emp.toString());

    }
}
