// Newton Raphson Method for solving system of equations
class SEq_NWP_method {

    static double[][] matrixJ = new double[2][2]; //matrix for Jacobian
    static double[] xmatrc = new double[2]; //matrix for unknowns
    static double[] fmatr = new double[2];

    //    x,y-vector. Set initial guess values
    public static void xmatrix() {
        xmatrc[0] = 5;
        xmatrc[1] = 7;
    }

    //Set system of equations
    public static void fmatrix() {
        fmatr[0] = xmatrc[0] * xmatrc[0] - 2 * xmatrc[0] * xmatrc[1];
        fmatr[1] = 2 * xmatrc[0] + xmatrc[1];
    }

    //    calculate Jacobian
    public static void Jacobian(double x, double y) {
        //here we write partial derivatives of given equations
        matrixJ[0][0] = 2 * xmatrc[0] - 2 * xmatrc[1];
        matrixJ[0][1] = -2 * xmatrc[0];
        matrixJ[1][0] = 2;
        matrixJ[1][1] = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixJ[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void determinant() {
        double det = matrixJ[0][0] * matrixJ[1][1] - matrixJ[0][1] * matrixJ[1][0];
        System.out.println("Determinant is " + det);

        double[] res = new double[2];
        for (int k = 0; k < 2; k++) {
            res[k] += xmatrc[k] - (1 / det) * fmatr[k];
            System.out.println(res[k] + "\t");
        }
    }

    public static void main(String[] args) {
        xmatrix();
        fmatrix();
        Jacobian(xmatrc[0], xmatrc[1]);
        determinant();

    }
}

