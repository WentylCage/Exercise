public class PrintMatrix {

    private double tab[][];
    public void print (double[][] printtab) {
        tab = printtab;
        for(int i = 0; i<tab.length; i++) {
            System.out.println();
            for(int j = 0; j<tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
        }
    }
}
