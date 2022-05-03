import java.util.*;
import java.util.stream.Collectors;

public class CollectıonMethods {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> bosList = new ArrayList<>();


        for (int i = 0; i <5; i++) {
            System.out.println("Lutfen 5 adet sayı giriniz");
            bosList.add(scan.nextInt());
        }
        System.out.println(bosList);

        Collections.reverse(bosList);
        System.out.println("ters sıraladıktan sonra : "  + bosList);

        System.out.println(" max sayi :" +bosList.stream().reduce(Integer::max)); // lambda ile cozumu

        Collections.shuffle(bosList); // rastgele karıstırır,
        System.out.println("shuffle yaptıktan sonra : " + bosList);

        Collections.rotate(bosList, 3);
        System.out.println("rotate edildikten sonra : " + bosList);

        System.out.println(Collections.max(bosList));
        System.out.println(Collections.min(bosList));

        Collections.replaceAll(bosList,Collections.max(bosList),Collections.min(bosList));
        System.out.println("replace sonrası : " + bosList);
    }


}
