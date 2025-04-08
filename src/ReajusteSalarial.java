


import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INFLACAO = 3.8;


        while (true) {
            System.out.print("Informe o salário do colaborador (ou digite 0 para encerrar): R$ ");
            double salario = scanner.nextDouble();


            if (salario == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            double percentual = 0;


            if (salario <= 280) {
                percentual = 20;
            } else if (salario <= 700) {
                percentual = 15;
            } else if (salario <= 1500) {
                percentual = 10;
            } else {
                percentual = 5;
            }


            double aumento = salario * (percentual / 100);
            double novoSalario = salario + aumento;
            double aumentoReal = ((novoSalario / salario - 1) * 100) - INFLACAO;


            System.out.println("\n--- INFORMAÇÕES DO REAJUSTE ---");
            System.out.printf("1. Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.printf("2. Percentual de aumento aplicado: %.0f%%%n", percentual);
            System.out.printf("3. Valor do aumento: R$ %.2f%n", aumento);
            System.out.printf("4. Novo salário, após o aumento: R$ %.2f%n", novoSalario);
            System.out.printf("5. Valor do aumento real, descontando a inflação: %.2f%%%n", aumentoReal);
            System.out.println("----------------------------------\n");
        }

        scanner.close();
    }
}
 