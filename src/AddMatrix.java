public class AddMatrix {

    public double[][] add ()

    {
        System.out.println("MATRIX ADDITION");
        double[][] matrix1;
        double[][] matrix2;
        double[][] matrixr; //result
        System.out.println("Enter first matrix to be added");
        ReadMatrix readmatrix1 = new ReadMatrix();
        matrix1 = readmatrix1.read();
        System.out.println("Enter second matrix to be added");
        ReadMatrix readmatrix2 = new ReadMatrix();
        matrix2 = readmatrix2.read();
        matrixr = readmatrix2.read();
        if (matrix1.length==matrix2.length)
        {
            for(int i = 0; i<matrix1.length; i++)
            {
                for(int j = 0; j<matrix1[i].length; j++)
                {
                    matrixr[i][j] = matrix1[i][j]+matrix2[i][j];
                }
            }
        }
        else
        {
            System.out.println("Tables have different dimensions. Addition aborted");
        }
        return matrixr; //I will use it for possible print
    }

}
