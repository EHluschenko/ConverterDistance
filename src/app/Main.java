package app;

public class Main {
    private static final double CONV_L = 1.60934;
    private static final double CONV_S = 1.852;

    public static void main(String[] args) {
        System.out.println("Converter app.");
        System.out.println("Converter mile to kilometers");
        double mile = 5;
        double kilometers = 3;
        double mileLand= convKilometersToMileLand(kilometers);
        double mileSea= convKilometersToMileSea(kilometers);
        double kilometer = convMileLandToKilometer(mile);
        double kilometer1 = convMileSeaToKilometer(mile);
        System.out.println("Result is " + kilometer + " kilometers, if land mile " + kilometer1 + " kilometers, if sea mile ");

        System.out.println("Converter kilometers to mile");
        System.out.println("Result is " + mileLand + " land mile  " + mileSea + " Sea mile ");
    }
        private static double convMileLandToKilometer(double mile){
            return mile * CONV_L;
        }
        private static double convMileSeaToKilometer(double mile){
            return mile * CONV_S;
        }
        private static double convKilometersToMileLand(double kilometers){
        return kilometers / CONV_L;
        }
        private static double convKilometersToMileSea(double kilometers){
        return kilometers / CONV_S;
        }
    }