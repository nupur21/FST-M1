package Activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Nupur");
        plane.onboard("Sumit");
        plane.onboard("Mayank");
        plane.onboard("Rashmi");
        plane.onboard("Rakesh");
        plane.onboard("Naina");
        plane.onboard("Pari");
        plane.onboard("Mani");
        plane.onboard("Shivam");
        plane.onboard("Aditya");
        System.out.println("Take off time is: "+plane.takeOff());
        System.out.println("The list of passengers are: "+plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landing time is: "+plane.getLastTimeLanded());
    }
}
