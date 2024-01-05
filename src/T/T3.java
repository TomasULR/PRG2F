package T;

import java.util.Random;

public class T3 {
    public static void main(String[] args) {

    String[] pole= {"Pepa", "Stanislav", "Bohdan",};
    String[] pole2= {"Nový", "Váverka", "Tůma"};
        int random = (int)(Math.random() * 3);
        int random2 = (int)(Math.random() * 3);

        System.out.println(pole[random] +" " + pole2[random2] );
        
        
        String retezec = "Kolik je ve vete vět. AJDLKJA kjd.";
        int slovoCounter = 0;
        for (int i = 0; i < retezec.length(); i++) {
            if( retezec.charAt(i) == '.'|| retezec.charAt(i) == '!'|| retezec.charAt(i) == '?'){
                slovoCounter++;
            }
        }
        System.out.println("Ve větě je: " + slovoCounter + " vět");


        String tel = "+420350986458";

            if (tel.substring(0,4) != "+420"){
                System.out.println("Není platné tel. číslo");
            }

        if (tel.length() != 13){
            System.out.println("neni platné");
        }
        else {
            System.out.println("Je platné");
        }


    }
}
