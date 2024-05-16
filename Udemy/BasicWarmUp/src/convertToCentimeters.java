public class convertToCentimeters {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int height_inch) {
        double height_cen = (double) height_inch * 2.54;
        System.out.println(height_cen);
        return height_cen;
    }

    public static double convertToCentimeters(int height_feet, int height_inch) {
        int total_inch = height_feet * 12 + height_inch;
        double height_cen = convertToCentimeters(total_inch);
        System.out.println(height_cen);
        return height_cen;
    }
}
