import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeysValue {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {
        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkıye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 68);
        ulke.put("Canada", 40);

        System.out.println("ulke isimler ve nufusları : " + ulke + "milyondur");
        System.out.println("ulke ısımleri : " + ulke.keySet());
        System.out.println("nufusları ise " + ulke.values());

        int nufusToplam = 0;
        for (Integer nufus : ulke.values()
        ) {
            nufusToplam += nufus;
        }
        System.out.println("nufus toplamı :" + nufusToplam);

        ellidenBuyukNufus(ulke);

        System.out.println("lambda ile nufuslar toplamı :" + ulke.values().stream().reduce(Integer::sum));
        System.out.println(" lambda ile sıralama (tersten sıralama): " + ulke.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.print("************* \n " );
        System.out.println("Lambda ile normal sıralama (natural order method):" + ulke.values().stream().sorted().collect(Collectors.toList()));


        for (Map.Entry<String, Integer> siralama: ulke.entrySet()) {
            System.out.println("entry ile sıralama: " );
            System.out.println((siralama));

        }

    }
/// method ile yaptım \\\
    public static void ellidenBuyukNufus(HashMap<String, Integer> ulke) {

        int sayac = 0;

        for (Integer ellidenBuyuk : ulke.values()) {
            if (ellidenBuyuk > 50) {
                sayac++;
            }

        }

        System.out.println("50 den buyuk ulke sayısı : \n" + "\n" + sayac);
    }
}



