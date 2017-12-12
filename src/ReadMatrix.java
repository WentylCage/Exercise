import java.util.Scanner;

public class ReadMatrix {

    public double[][] read() {
        int columnno; //columns quantity
        int lineno; //lines quantity
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix dimensions");
        System.out.println("Enter lines quantity");
        lineno = input.nextInt();
        System.out.println("Enter columns quantity");
        columnno = input.nextInt();
        double[][] matrix = new double[lineno][columnno];
        System.out.println("Enter matrix, number after number");
        for(int i = 0; i<matrix.length; i++) {
            int p = i+1;
            System.out.println("Enter" + p + "line");
            for(int j = 0; j<matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
                System.out.print(" ");
            }
        }
        System.out.println("Matrixaccepted");
        return matrix;
    }
}

