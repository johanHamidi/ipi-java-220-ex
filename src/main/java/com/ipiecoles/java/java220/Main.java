package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("bonjour");

        Employe emp = new Employe("Hamidi","Johan","Mfd55", LocalDate.now(),2500.0);
        Employe emp2 = new Employe("Hamidi","bertabd","Mfd55", LocalDate.now(),2500.0);
        System.out.println(emp.getSalaire());

        Employe emp3 = new Employe();
        try {
            emp3.setDateEmbauche(new LocalDate(2020,10,5));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Commercial c2 = new Commercial(100d,"Doe","john","mdkod5",LocalDate.now(),1000000.0);

        System.out.print(emp.toString());

        System.out.println(emp==emp2);
        System.out.println(emp.equals(emp2));

    }
}
