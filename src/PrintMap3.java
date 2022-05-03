import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintMap3 {
   // Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin

    public static void main(String[] args) {
        HashMap<Integer,String> sayıveOkunusları = new HashMap<>();

        sayıveOkunusları.put(1, "bir" );
        sayıveOkunusları.put(2, "iki" );
        sayıveOkunusları.put(3, "uc" );
        sayıveOkunusları.put(4, "dort" );
        sayıveOkunusları.put(5, "bes" );
        sayıveOkunusları.put(6, "altı" );


        System.out.println("map:" + sayıveOkunusları);



    }
}
