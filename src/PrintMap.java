
import java.util.*;


public class PrintMap {
    /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
    public static void main(String[] args) {


       HashMap<Integer, String > newMap = new LinkedHashMap<>(); // sıralı gelsin diye bu sekilde Linkedin olusuturuldu.

       newMap.put(10, "Java");
       newMap.put(20, "PHP");
       newMap.put(2, "Python");
       newMap.put(57, "C++");
       newMap.put(89, "C");
       newMap.put(40, "JavaScrıpt");

        for (Map.Entry<Integer, String> sıralıGelsin: newMap.entrySet()) { // Map.Entry ile hem key hem de value elde ediilebilir.

            System.out.println(sıralıGelsin.getKey() + "," + sıralıGelsin.getValue());
        }

        //2. method

        for (Integer each: newMap.keySet()) {
            System.out.println(each + "," + newMap.get(each));
        }

    }
}
