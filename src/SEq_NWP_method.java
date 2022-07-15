import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.differentiation.JacobianFunction;
import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;
import org.ejml.data.Matrix;

// Java program for implementation of
// Newton Raphson Method for solving
// equations
class SEq_NWP_method {

    static final double EPSILON = 0.001;


    static double func2(double x, double y)
    {
        return 2* x + y;
    }

    static double func1(double x, double y)
    {
        return x* x -2*x*y;
    }

    static void Matris (double x, double y) {

        double[][] matrixJ;
        matrixJ = new double[2][2];
        matrixJ[0][0] = x * x - 2 * y;
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

public static void main(String[] args){
        double x0 = 50;
        double y0 = 50;
        Matris(x0,y0);

        }
}

