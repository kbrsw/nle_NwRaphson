// Newton Raphson Method for solving
// equations
class SEq_NWP_method {

    static double[][] matrixJ= new double[2][2];

    public static void Matris(double x, double y) {


        matrixJ[0][0] = 2 * x - 2 * y;
        matrixJ[0][1] = -2 * x;
        matrixJ[1][0] = 2;
        matrixJ[1][1] = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixJ[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void determinant(){
        double det = matrixJ[0][0]*matrixJ[1][1]-matrixJ[0][1]*matrixJ[1][0];
        System.out.println("Determinant is " +det);
    }

    public static void main(String[] args) {
        double x0 = 1;
        double y0 = 2;
        Matris(x0, y0);
        determinant();

    }
}

