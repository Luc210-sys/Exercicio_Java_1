/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira quantos anos de idade vocẽ tem: ");
        int ano = input.nextInt();

        System.out.println("quantos meses: ");
        int mes = input.nextInt();

        System.out.println("e quantos dias: ");
        int dia = input.nextInt();

        System.out.println((ano * 365) + (mes * 30) + dia);
    }
}
