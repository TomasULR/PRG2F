package T;

import java.util.Arrays;
import java.util.Random;

public class T2 {


    public static void main(String[] args) {
        int[] pole = new int[20];

        Random rd = new Random();
        int souc = 0;
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random() * 201) - 100;
            souc += pole[i];
        }
        System.out.println(Arrays.toString(pole));
        if (souc >= 0) {
            System.out.println(souc);
        } else {
            System.err.println(souc);
        }


        int[] pole2 = {-20, 0, 1, 60, 3, 5, 2, 1, 5, 7};


        for (int j = 0; j < pole2.length; j++) {
            if (pole2[j] >= -10 && pole2[j] <= 10) {
                System.out.println(pole2[j]);
            }
        }


        int[] pole3 = {80, 70, 70, 80, 80, 80, 100, 100};
        int celk = 0;
        for (int k = 0; k < pole3.length; k++) {
            if (pole3[k] < 60) {
                System.err.println("Neprojde s: " + celk + " prumer " + (celk / pole3.length));
                break;
            }
            celk += pole3[k];
        }
        if (celk / 8 > 70) {
            System.out.println("Uspel s: " + celk + " prumer " + (celk / pole3.length));
        }


    }


}
