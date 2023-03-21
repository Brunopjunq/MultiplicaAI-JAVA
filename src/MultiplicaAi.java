import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        final int number = sc.nextInt();
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " +  number * i);
        }
    }
}