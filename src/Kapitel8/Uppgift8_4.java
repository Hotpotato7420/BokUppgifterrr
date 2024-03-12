
package Kapitel8;
import javax.swing.*;


public class Uppgift8_4 {
    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog("Vad ar kommunalskatten?");
        double kom = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Vad ar Stat skatten? (1, 2, 3)");
        int stat = Integer.parseInt(s);

        s = JOptionPane.showInputDialog("Hur mycket lon vill du ha?");
        double exLon = Double.parseDouble(s);

        double lonen = Skatt.prisEfter(exLon, kom, stat);
        System.out.println(lonen);

    }

    public class Skatt {
        public static double prisEfter(double x, double y, int z) {
            double lon = 0;
            if (z == 1) {
                lon = x / (1 - 0.01 * STAT_LaG * y);
                double arb = lon * 1.320;
                double moms = arb + lon * 1.25;
                return moms;
            } else if (z == 2) {
                lon = x / (1 - 0.01 * STAT_MEDEL * y);
                double arb = lon * 1.320;
                double moms = arb + lon * 1.25;
                return moms;
            } else if (z == 3) {
                lon = x / 1 - 0.01 * STAT_HoG * y;
                double arb = lon * 1.320;
                double moms = arb + lon * 1.25;
                return moms;
            }
            return 0;

        }

        public static final double MOMS = 25.0;
        public static final double ARB_AVG = 32.0;
        public static final double STAT_LaG = 0;
        public static final double STAT_MEDEL = 20.0;
        public static final double STAT_HoG = 25.0;
        public static final double LaG = 1;
        public static final double MEDEL = 2;
        public static final double HoG = 3;
    }
}