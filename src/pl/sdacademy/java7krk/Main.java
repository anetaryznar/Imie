package pl.sdacademy.java7krk;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //zadanie1();
        zadania2();


    }


    public static void zadania2(){




    }

    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imie");
        String name = scanner.nextLine();
        while (name.isEmpty()) {


        }
        String[] names = new String[name.length()];


        for (int i = 0; i < names.length; i++) {
            if (name.endsWith("a")) {
                System.out.println(name + " jest kobieta");
                break;
            } else {
                System.out.println(name + "jest mezczyzna");
                break;
            }
        }


        /* lub
        System.out.println("jak masz na imie");
        String name = scanner.nextLine();
        while (!name.equals("q")){
            if(name.endsWith("a")){
                System.out.println(name + "jest kobieta");
            }else{
                System.out.println(name+ "jest mezczyzna");
            }
            System.out.println("jak masz na imie");
            name = scanner.nextLine();
        }
        */







    }

}
