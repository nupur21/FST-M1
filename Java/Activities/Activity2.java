package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int a =0;
        int[] numArray = {10, 77, 10, 54, -11, 10};
        for (int i = 0; i <= numArray.length - 1; i++)
        {
            if (numArray[i] == 10) {
                a = a+numArray[i];
            }
        }
        if(a==30) {
          System.out.println("Sum is " + a);
            }else{
            System.out.println("Value is incorrect, sum is " + a);
        }

    }
    }

