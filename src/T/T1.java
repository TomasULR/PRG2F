package T;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
   //    int postava = 1500;
   //    int i = 0;
   //    while (postava > 0){
   //        int HráčDMG = (int) (Math.random()*150 + 1);
   //        i++;
   //        postava = postava- HráčDMG;

   //    }
   //    System.out.println(i);

   //    Scanner sc = new Scanner(System.in);

   //  while (true){
   //      int pin = sc.nextInt();
   //      if(pin < 1000){
   //          System.out.println("Ne, ptam se znovu");
   //      }
   //      else if (pin > 9999){
   //          System.out.println("Ne, ptam se znovu");
   //      }
   //      else {
   //          System.out.println("ok");
   //          break;
   //      }

   //  }

   //    int n = sc.nextInt();

   //    for (int j = 0; j < n; j++) {

   //        if(j % 2 == 0){
   //            System.out.println(j + " je sude");


   //        }

   //    }
       Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int n = (int)Math.sqrt(number);
     int k = 0;
     boolean t = true;
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if(i % 2 == 0 ){
               t = true;
            }
            else {
               t = false;
            }
            if(t = false){
               k = 8;
            }
            else {
               k=0;
            }

             System.out.print(k + " ");
         }
         System.out.println();
     }

    }
}
