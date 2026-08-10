package com.boris.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choix;

        do {

            afficherMenu();

            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
                break;
            }

            if (choix < 1 || choix > 4) {
                System.out.println("Choix invalide.");
                continue;
            }

            System.out.print("Premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Deuxième nombre : ");
            double b = scanner.nextDouble();

            try {

                double resultat;

                switch (choix) {

                    case 1:
                        resultat = calculator.addition(a, b);
                        break;

                    case 2:
                        resultat = calculator.soustraction(a, b);
                        break;

                    case 3:
                        resultat = calculator.multiplication(a, b);
                        break;

                    case 4:
                        resultat = calculator.division(a, b);
                        break;

                    default:
                        continue;
                }

                System.out.println("Résultat : " + resultat);

            } catch (ArithmeticException e) {

                System.out.println("Erreur : " + e.getMessage());
            }

            System.out.println();

        } while (true);

        scanner.close();
    }


    private static void afficherMenu() {

        System.out.println("=== CALCULATRICE ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Quitter");
    }
}
