package be.intecbrussel;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.util.Arrays.*;

public class MainApp {
    public static void main(String[] args) {

        //OPDRACHT 1
        System.out.println("*** OPDRACHT 1 ***");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("POSTNUMMER: ");

        int city[] = new int[]{myScanner.nextInt()};

        for (int index = 0; index < city.length; index++) {
            switch (city[index]) {
                case (9300) -> System.out.println("Aalst");
                case (2000) -> System.out.println("Antwerpen");
                case (1000) -> System.out.println("Brussel");
                case (9200) -> System.out.println("Dendermonde");
                case (9000) -> System.out.println("Gent");
                case (8500) -> System.out.println("Kortrijk");
                case (9700) -> System.out.println("Oudenaarde");
                case (2300) -> System.out.println("Turnhout");
                default -> System.out.println("Voer de juiste postcode in");

            }

            //OPDRACHT 2

            System.out.println("*** OPDRACHT 2 ***");

            int[][] a = {{1, 3, 4}, {3, 4, 5}};
            int[][] b = {{1, 3, 4}, {3, 4, 5}};
            int[][] c = new int[a.length][b.length + 1];
            for (int r = 0; r < a.length; r++) {
                for (int i = 0; i < a[r].length; i++) {
                    c[r][i] = a[r][i] + b[r][i];

                    System.out.print(c[r][i] + " ");
                }
                System.out.println();

            }
            //OPDRACHT 3
            System.out.println("*** OPDRACHT 3 ***");

            Scanner in = new Scanner(System.in);

            Random random = new Random();
            int random_num = random.nextInt(10);

            int[][] player = new int[10][10];
            System.out.println("START GAME");





                System.out.println("Enter a row: ");
                int x = in.nextInt();


                System.out.println("Enter a column: ");
                int y = in.nextInt();


            }
        }
    }






