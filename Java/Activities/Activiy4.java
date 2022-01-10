package Activities;

public class Activiy4 {
    public static void main(String[] args) {
        int temp =0;
        int[] array = {1,3,5,6,2,10};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Unsorted array is "+array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1 ; j < array.length - 1 ; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted array is "+array[i]);
        }
    }
}
