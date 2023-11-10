package all.loop.random;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] pole = new int[15];

        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int)(Math.random()*100-49);
        }

        System.out.println(Arrays.toString(pole));
    }

}
