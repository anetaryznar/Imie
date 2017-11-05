package pl.sdacademy.java7krk;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imie");
        String name = scanner.nextLine();
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


    }
}
