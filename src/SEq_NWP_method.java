// Newton Raphson Method for solving system of two equations
class SEq_NWP_method {

//    Precision
    static final double EPSILON = 0.00000000000000000001;

//    First function
    static double f1(double x, double y) {return 2 * x * x - 4 * y - 6;}
//  Second function
    static double f2(double x, double y) {return 4 * y * y + x - 5;
    }

// Partial derivative X of 1st function
    static double df1dx(double x, double y) {
        return 4*x;
    }

//  Partial derivative Y of 1st function
    static double df1dy(double x, double y) {
        return -4;
    }

//  Partial derivative X of 2nd function
    static double df2dx(double x, double y) { return 1; }

//  Partial derivative Y of 2nd function
    static double df2dy(double x, double y) {
        return 8*y;
    }

    //    calculate Jacobian and apply Newton-Raphson method
    static void Jac(double x, double y) {
        double det = df1dx(x, y) * df2dy(x, y) - df1dy(x, y) * df2dx(x, y);
        System.out.println("Determinant is " + det);

        while (Math.abs((1 / det) * f1(x, y)) >= EPSILON && Math.abs((1 / det) * f2(x, y)) >= EPSILON)
        {
            det = df1dx(x, y) * df2dy(x, y) - df1dy(x, y) * df2dx(x, y);
            x = x - (1 / det) * f1(x, y);
            y = y - (1 / det) * f2(x, y);
            System.out.println("x = " + x + "\t" + "y= " + y);
        }
    }

    public static void main(String[] args) {
        double x0 = 1.3;
        double y0 = -2;
        Jac(x0, y0);

    }
}
