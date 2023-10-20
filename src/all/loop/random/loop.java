package all.loop.random;

import java.util.Scanner;
import java.util.StringJoiner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num2 = (int) (Math.random()*21);
        int num1 = (int) (Math.random()*21);
        int tries = 1;
        System.out.println(num1 + " " + num2);

        while (num1 != num2){
            num2 = (int) (Math.random()*21);
            num1 = (int) (Math.random()*21);
            System.out.println(num1 + " " + num2);
            tries++;
        }
        System.out.println("trvalo to " + tries );

        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num2 = (int) (Math.random()*21);
            num1 = (int) (Math.random()*21);
            System.out.println(num1 + " " + num2);

            if (num1 == num2){
                counter++;
            }
        }
        System.out.println(counter);

        //pocet pater
        int inp = sc.nextInt();
        for (int i = 0; i < inp; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
