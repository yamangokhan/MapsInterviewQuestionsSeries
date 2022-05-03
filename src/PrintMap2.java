import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintMap2 {
    //aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250

    public static void main(String[] args) {
        HashMap<String, Integer> map = new LinkedHashMap<>(); // sıralı gelsin diye Linkedin yapıldı.

        map.put("Kiraz", 100);
        map.put("Incir", 200);
        map.put("Enginar", 150);
        map.put("Uzum", 145);
        map.put("Nar", 250);

        System.out.println("map :" + map);

        for (Map.Entry<String, Integer> yeni: map.entrySet()) {
            System.out.println(yeni.getKey() + " " + yeni.getValue());
        }
    }
}
