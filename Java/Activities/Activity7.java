package Activities;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(5,100,50);
        mountainBike.setHeight(60);
        mountainBike.applyBrake(5);
        mountainBike.speedUp(20);
        mountainBike.bicycleDesc();
            }
}
