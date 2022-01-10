package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Nupur");
        myList.add("Sumit");
        myList.add("Mayank");
        myList.add("Shivam");
        myList.add("Mani");
        for (int i =0; i<1;i++){
            System.out.println("Values in Arraylist: "+myList);
        }
        System.out.println("3rd name is: "+myList.get(2));
        System.out.println("Is Nupur exists in the list: "+myList.contains("Nupur"));
        System.out.println("Size of Arraylist is: "+myList.size());
        myList.remove(4);
        System.out.println("Size of new arraylist is: "+myList.size());
        }
    }


