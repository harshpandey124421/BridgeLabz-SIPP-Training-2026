public class ParkingSystem {
    private int bigSpace;
    private int mediumSpace;
    private int smallSpace;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSpace = big;
        this.mediumSpace = medium;
        this.smallSpace = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (bigSpace > 0) {
                bigSpace--;
                return true;
            }
        } else if (carType == 2) {
            if (mediumSpace > 0) {
                mediumSpace--;
                return true;
            }
        } else if (carType == 3) {
            if (smallSpace > 0) {
                smallSpace--;
                return true;
            }
        }
        return false;
    }
}