package all;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        String[] users = {"matej", "honza", "jiri", "ondra", "sokol"};
        String userName = "matej";

        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i])){
                System.out.println("Nalez na pozici " + (i+1));
            }
        }

        String promena = "Halloween";

        for (int i = 0; i < promena.length(); i++) {
            if(promena.charAt(i) == promena.charAt(i+1)){
                System.out.println("Je tam");
                break;
            }

        }

        String downerCase = "sokol je kokot";

        for (int i = 0; i < downerCase.length(); i++) {
            if (i %2 == 0){
                System.out.print(downerCase.charAt(i));
            }
            for (int j = 0; j < downerCase.length(); j++) {
                if (i %2 != 0){
                    System.out.print(downerCase.toUpperCase().charAt(i));
                    break;
                }
            }
        }
        System.out.println();

        String words = "sokol je kokot";
        int slov=0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' '){
                slov++;
            }
        }
        System.out.println("pocet slov " + (slov+1));

        String[] pole = {
                "Pablo Diego José Francisco de Paula Juan", "Jan", "Karel",  "FranƟšek Dlouhojmenny", "Don John"};

        int base = 0;

// Assuming pole is an array of strings
        for (int i = 0; i < pole.length; i++) {
            if (pole[i].length() > pole[base].length()) {
                base = i;
            }
        }

        System.out.println(pole[base]);


        String number = "4200";

        for (int i = number.length()-1; i >= 0 ; i--) {
            System.out.print(number.charAt(i));
        }
        System.out.println(

        );

        String name = "meme";

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej jmeno typu souboru");
        String type = sc.nextLine();
        System.out.println(name+"."+type);


        String text = "kajak";

        for (int i = 0; i < (text.length())/2; i++) {
            for (int j = text.length()-1; j > 0; j--, i++) {
                if(text.charAt(i) != text.charAt(j))
                {
                    System.out.println("neni palindrom");
                }
                else {
                    System.out.println("je");
                }


            }
        }
    }
}
