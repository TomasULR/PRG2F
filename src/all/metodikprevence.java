package all;

public class metodikprevence {
    public static void main(String[] args) {

    int area = rec( 5,6);
    System.out.println(area);

        for (int i = 0; i < 30; i++) {
            System.out.println(ran(2,10));
        }
    }


    public static int ran(int min, int max){
        int res = (int)(Math.random()*(max-min+1) + min);
        return res;

    }
    public static int rec(int a, int b){
        int i = a*b;

        return (i);
    }

}
