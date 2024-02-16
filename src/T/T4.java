package T;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {

        int zaci[][] = {
                {100, 80, 90,},
                {5, 5, 50}
        };

        int soucet = 0;
        int proslocounter = 0;
        for (int i = 0; i < zaci.length; i++) {
            soucet = 0;
            for (int j = 0; j < zaci[i].length; j++) {
                System.out.println(zaci[i][j]);
                soucet += zaci[i][j];
            }
            if (soucet >= 100) {
                proslocounter += 1;
            }
        }

        System.out.println(proslocounter + " proslo");


        int pole[][] = {
                {100, 80, 90, 90},
                {5, 5, 50, 80, 80},
                {0, 2, 3, 4, 5},
                {5, 5, 50, 80, 80},
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Vážený uživateli, zadejte sloupec který chcete vypsat");
        int nej = 99999999;
        int vyvolenysloupec = sc.nextInt();
        vyvolenysloupec -= 1;
        for (int i = 0; i < 4; i++) {
            if (pole[i][vyvolenysloupec] < nej) {
                nej = pole[i][vyvolenysloupec];
            }

        }

        System.out.println("nejmensi čislo je " + nej);


        ArrayList<String> List = new ArrayList<String>();
        ArrayList<String> Druhejlist = new ArrayList<String>();
        String str = "";

        while (true) {
            str = sc.next();


            if (str.equals("konec")) {
                break;
            }


            List.add(str);


        }

        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).length() > 8) {

                if (List.get(i).contains("*")) {
                    System.out.println(List.get(i));

                }
            }


        }

    }
}
