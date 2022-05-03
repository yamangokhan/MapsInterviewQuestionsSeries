import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Set;

public class MapsKey {


    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {
        HashMap<Integer, String> zıpCodeAndCountry = new HashMap<>();

        zıpCodeAndCountry.put(85001, "Arizona");
        zıpCodeAndCountry.put(71601, "Arkansas");
        zıpCodeAndCountry.put(80001, "Colarado");

        Set<Integer> keys = zıpCodeAndCountry.keySet();
        for (Integer key:keys
             ) {
            System.out.println(key + "=>" + zıpCodeAndCountry.get(key));

        }
        System.out.println("\n *** \n");
        System.out.print(keys);
    }
}
