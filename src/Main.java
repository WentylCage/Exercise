//Matrix calculator

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int a;
        System.out.println("Add Matrix - press 1");
        System.out.println("Exit - press 2");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        switch (a) {
            case 1:
                AddMatrix add = new AddMatrix();
                add.add();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Add Matrix - press 1");
                System.out.println("Exit - press 2");
        }
    }
}
