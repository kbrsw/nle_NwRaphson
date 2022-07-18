// Newton Raphson Method for solving system of equations
class SEq_NWP_method {

    //    x,y-vector. Set initial guess values

    static final double EPSILON = 0.0000000000000001;

    static double f1(double x, double y) {return 2 * x * x - 4 * y - 6;}

    static double f2(double x, double y) {return 4 * y * y + x - 5;
    }

    static double df1dx(double x, double y) {
        return 4*x;
    }

    static double df1dy(double x, double y) {
        return -4;
    }

    static double df2dx(double x, double y) { return 1; }

    static double df2dy(double x, double y) {
        return 8*y;
    }

    //    calculate Jacobian
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
        double x0 = 0.3;
        double y0 = -2;
        Jac(x0, y0);

    }
}


