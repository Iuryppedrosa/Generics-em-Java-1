package problema1.application;

import problema1.Service.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintService<Integer> p = new PrintService<>();
        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int values = input.nextInt();

        for (int i = 0; i < values; i++){
            int valor = input.nextInt();
            p.addValue(valor);
        }

        System.out.print("How many names? ");
        int namesQuantidade = input.nextInt();

        for (int i = 0; i < namesQuantidade; i++) {
            String namesString = input.next();
            ps.addValue(namesString);
        }

        p.print();
        ps.print();
        System.out.println("\nFirst: " + p.first());
        System.out.println("First String: " + ps.first());

        input.close();
    }
}
