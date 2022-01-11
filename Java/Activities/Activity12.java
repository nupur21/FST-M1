package Activities;

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a,b) -> (a+b);
        System.out.println(ad1.add(10,20));
        Addable ad2 = (a,b) -> {
            return (a+b);
        };
        System.out.println(ad2.add(50,60));
    }
}
