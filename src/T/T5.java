package T;

import java.sql.SQLOutput;
import java.util.Arrays;

public class T5 {

    public static void main(String[] args) {

        System.out.println(Plot(5, true) + " Kč");
        String da = "5,1";
        String oda = "1,2";
        newerDate(da, oda);


    }
    private static float Plot(float metr, boolean lak){
        float cenna = metr * 3 * 33;
        if (lak == true){
            cenna += cenna *0.23;
        }
        return cenna;
    }
    private static void newerDate(String date, String otherDate) {

        String[] partsda = date.split(",");
        String[] partsoda = otherDate.split(",");

        int[] intparsda = new int[partsda.length];
        int[] intparsoda = new int[partsda.length];
        for (int i = 0; i < partsda.length; i++) {
            intparsda[i] = Integer.parseInt(partsda[i]);
            intparsoda[i] = Integer.parseInt(partsoda[i]);

        }


        boolean prvV = false;
        boolean druhV = false;
        boolean mV = false;
        boolean dmV = false;

        if (intparsda[0] > intparsoda[0]) {
            prvV = true;
        } else {
            druhV = true;
        }
        if (intparsda[1] > intparsoda[1]) {
            mV = true;
        } else {
            dmV = true;
        }

        if (prvV && mV){
            System.out.println(date);
        }
        if (druhV && dmV){
            System.out.println(otherDate);
        }
        if (prvV && dmV){
            System.out.println(otherDate);
        }
        if (druhV && mV){
            System.out.println(date);
        }
    }

}
