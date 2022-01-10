package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        System.out.println("Size of hashset is: "+hashSet.size());
        hashSet.remove("C");
        if(hashSet.remove("K")){
            System.out.println("K is removed from the set");
        }else{
            System.out.println("K is not present in the hashset");
        }
        hashSet.contains("B");
        System.out.println(hashSet);

    }


}
