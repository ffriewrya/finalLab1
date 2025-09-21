import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.Math.*;

public class Main {
    private static double calculate1(double x) {
        return (asin(cos(pow(2 * tan(x), sin(x)))));
    }
    private static double calculate2(double x) {
        return (pow(PI + cbrt(pow((x * (1 - x)), 3)), 3));
    }
    private static double calculate3(double x) {
        return pow(pow(asin(1 / exp(abs(x))), 2 * tan(asin((x + 5.5) / 15))) + 4, tan(tan(x)));
    }
    public static void main(String[] args) {
        short[] w = new short[16];
        for (int i = 0; i < w.length; i++) {
            w[i] = (short) (i + 5);
        }
        double[] x = new double[19];
        for (int j = 0; j < x.length; j++) {
            x[j] = -2 + random() * 15;
        }
        List<Short> checkValues = new ArrayList<>(Arrays.asList((short) 5, (short) 9, (short) 10, (short) 12,
                (short) 13, (short) 15, (short) 17, (short) 19));
        double[][] k = new double[16][19];

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 19; j++) {
                short valueW = w[i];
                double valueX = x[j];
                if (valueW == 8) {
                    k[i][j] = calculate1(valueX);
                } else if (checkValues.contains(valueW)) {
                    k[i][j] = calculate2(valueX);
                } else {
                    k[i][j] = calculate3(valueX);
                }
            }
        }
        for (double[] row : k) {
            for (double v : row) {
                System.out.printf("%14.4f", v);
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}