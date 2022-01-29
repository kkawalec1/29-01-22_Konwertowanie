package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Konwertowanie Integer na Int: ----------------------------------------");

        Integer liczba = 6;
        int liczba2 = liczba.intValue();
        System.out.println(liczba2);
//-----------------------------------------------------------------------------------
        System.out.println("Konwertowanie Stringa (liczby) na Int lub Integer: ----------------------------------------");
        String s= new String("1");
        Integer liczS = Integer.parseInt(s) + 10;
        //Integer liczS = Integer.getInteger(s);
        System.out.println(liczS);
//------------------------------------------------------------------------------------
        System.out.println("Konwertowanie Stringa (tekst) na Integer: ----------------------------------------");
        String s1= new String("Ala ma kota");
        Integer liczS1 = Integer.getInteger(s1);
        System.out.println(liczS1);
//------------------------------------------------------------------------------------
        System.out.println("Parsowanie Stringa na typ obiektowy: ----------------------------------------");
        Double d = Double.valueOf("1");
        Integer i = Integer.valueOf("1");
        System.out.println(d + 10);
        System.out.println(i + 10);
//------------------------------------------------------------------------------------
        System.out.println("Int na String: ----------------------------------------");
        int l = 10;
        String t = String.valueOf(l);
        System.out.println(t+10); //wynik: 1020 bo l zamienił na tekst i złączył z liczbą 20
//------------------------------------------------------------------------------------
        System.out.println("String  na long: ----------------------------------------");
        String t1 ="1111111222233333";
        long l1 =Long.parseLong(t1);
        System.out.println(l1 + 33);
        //------------------------------------------------------------------------------------
        System.out.println("Long na String: ----------------------------------------");
        long l4 =1111111222233333L;
        String t4 = String.valueOf(l4);
        System.out.println(t4);
//------------------------------------------------------------------------------------
        System.out.println("String  na float: ----------------------------------------");
        String t2 ="23.6F";
        float l2 = Float.parseFloat(t2);
        System.out.println(l2+10.10);
//------------------------------------------------------------------------------------
        System.out.println("String  na double: ----------------------------------------");
        String t3 ="23.6";
        double l3 = Double.parseDouble(t3);
        System.out.println(l3+10.10);
//------------------------------------------------------------------------------------
        int in = 3;
        Integer liczba3 = Integer.valueOf(in);
        Object[] tab = {"Kowalski",liczba3};
        if (tab[0] instanceof String) {
        }
//------------------------------------------------------------------------------------
        System.out.println("Wypisujemy długość myInt (ilość znaków): ----------------------------------------");

        Integer myInt = 10000;
        String myString = myInt.toString();
        System.out.println(myString.length());









        // write your code here
    }
}
