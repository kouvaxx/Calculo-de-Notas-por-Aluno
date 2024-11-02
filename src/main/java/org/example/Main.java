package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Bem vindo ao programa Calculo de Notas!");

        System.out.println("Digite o nome do aluno: ");
        String aluno = scan.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        int nota = scan.nextInt();

        System.out.println("Digite a segunda nota do aluno: ");
        int nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota do aluno: ");
        int nota3 = scan.nextInt();

        String total = String.valueOf(nota + nota2 + nota3);
        if (nota + nota2 + nota3 >= 70) {
            System.out.println("Parabéns " + aluno + " você foi aprovado, sua nota foi: " + total);
        } else {
            System.out.println(aluno + " você foi reprovado!, sua nota foi: " + total);
        }

        scan.close();

    }
}

