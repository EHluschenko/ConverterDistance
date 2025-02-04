package app;

public class Main {
    private static final double CONV_L = 1.60934;
    private static final double CONV_S = 1.852;

    public static void main(String[] args) {
        System.out.println("Converter app.");
        double mile = 5;
        double kilometer = convMileLandToKilometer(mile);
        double kilometer1 = convMileSeaToKilometer(mile);
        System.out.println("Result is " + kilometer + " kilometers, if land mile " + kilometer1 + " kilometers, if sea mile ");
    }
        private static double convMileLandToKilometer(double mile){
            return mile * CONV_L;
        }
        private static double convMileSeaToKilometer(double mile){
            return mile * CONV_S;
        }
    }