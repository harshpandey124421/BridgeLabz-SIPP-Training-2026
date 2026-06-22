public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double radiusMiles = radiusKm / 1.6;
        
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n", 
                          volumeKm, volumeMiles);
    }
}
