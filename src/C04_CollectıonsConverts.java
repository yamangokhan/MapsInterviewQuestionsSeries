import java.util.*;

public class C04_CollectıonsConverts {
    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {


        Integer arr[] = new Integer[10];
        Random randomIlk10 = new Random();
        for (int i = 0; i <10 ; i++) {
            arr[i] = randomIlk10.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("array halinde :" + Arrays.toString(arr));

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("list halinde : " + list);

        Set<Integer> listConverToSet = new HashSet<>(list);
        System.out.println("set halinde : " + listConverToSet);
    }
}
