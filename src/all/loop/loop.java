package all.loop;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // while (input != 0){
       //     input = sc.nextInt();
       //     if(input % 2 == 0){
       //         System.err.println(input);
       //   }

       //for (int i = 0; i < input; i++) {
       //    if (i % 2 == 0){
       //        System.out.println(i);
       //    }
       //}

       //for (int i = 2; i < input; i++) {
       //    if(input % i == 0){
       //        System.out.println("Neni prvočíslo");
       //        break;
       //    }
       //}
        int input = sc.nextInt();
        System.out.println("Zadej hranici");
        boolean prime;
        for (int i = 2; i < input; i++) {
            prime = true;
            for (int j = 2; j <i ; j++) {
                if (i % j == 0 && i != j){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}

