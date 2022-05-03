import java.util.*;

public class C03_AddedOrNot {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3, 8, 8, 8, 8, 8, 4, 4, 4, 4, 4, 4, 4));

        System.out.println(liste);

        List<Integer> bosListe = new ArrayList<>();
        Set<Integer> tekrarlıElemanList = new HashSet<>();

        for (Integer herbiri : liste
        ) {
            int sayac = 0;
            if (!bosListe.contains(herbiri)) {
                bosListe.add(herbiri);

            } else {
                tekrarlıElemanList.add(herbiri);
            }
        }
        System.out.println("dolmadan onceki bos liste : " + bosListe);
        System.out.println(" tekrarlı eleman listesinin sayisi : " + tekrarlıElemanList.size());

        System.out.println("yinelenen degerler : " + tekrarlıElemanList);

        System.out.println("tekrarsız elemanlar kumesi size : " + bosListe.size());
        System.out.println("tekrarlı elemanlar kumesi size : " + liste.size());
    }
}
