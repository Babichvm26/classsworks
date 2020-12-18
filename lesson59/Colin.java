package lesson59;

public class Colin extends Triangle {

    public static void collinear(double x1, double y1, double x2,
                                 double y2, double x3, double y3)
    {
        // Calculation the area of
        // triangle. We have skipped
        // multiplication with 0.5
        // to avoid floating point
        // computations
        double a = x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2);

        if (a == 0)
            System.out.println("collinear Yes");
        else
            System.out.println("collinear No");
    }
}
