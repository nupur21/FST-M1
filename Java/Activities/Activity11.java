package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.HashMap;


public class Activity11 {
    public static void main(String[] args) {
        File tmpdir = FileUtils.getTempDirectory();
        System.out.println(tmpdir.getName());

        HashMap<Integer,String> colours = new HashMap<Integer, String>();
        colours.put(1,"White");
        colours.put(2,"Black");
        colours.put(3,"Grey");
        colours.put(4,"Blue");
        colours.put(6,"Green");
        colours.remove(3);
        if(colours.containsValue("Green")){
            System.out.println("Hashmap contains Green colour");
        }else{
            System.out.println("Hashmap doesn't contains Green colour");
        }
        System.out.println("Size of the hashmap is: "+colours.size());
    }
}
