package cvika;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class maa {
    private static int randomNum(boolean Negative, int range) {
        if (Negative)
            return (int) (Math.random() * range) * (((int) (Math.random() * 2) * 2) - 2);
        else
            return (int) (Math.random() * range);
    }

    private static int[] randomArray(boolean Negative, int Range, int Length) {
        int[] randomArr = new int[Length];
        for (int i = 0; i < Length; i++) {
            randomArr[i] = randomNum(Negative, Range);
        }
        return randomArr;
    }

    private static String randomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length-1; i++) {
            char randomChar = (char) (random.nextInt(95) + 32);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    private static String randomIP() {
        return Integer.toString(randomNum(false, 256)) + "." + Integer.toString(randomNum(false, 256)) + "." + Integer.toString(randomNum(false, 256)) + "." + Integer.toString(randomNum(false, 256))+"/"+Integer.toString(randomNum(false, 32));
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    private static int dayCount(int day, int month, int year) {
        int[] months;
        if (isLeapYear(year)) {
            months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        } else {
            months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        }
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += months[i];
        }
        return sum + day;
    }

    private static void textAnalysis(String text) {
        int wordCount = 0;
        int sentencesCount = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            char character = text.charAt(i);
            if (character == ' ') {
                wordCount++;
            } else if ((character == '!') || (character == '.') || (character == '?'))
                sentencesCount++;
        }
        System.out.println("Word count: " + Integer.toString(wordCount));
        System.out.println("Sentence count: " + Integer.toString(sentencesCount));
    }

    private static boolean isTriangel(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        return false;
    }

    private static double triangleArea(int a, int b, int c) {
        if (isTriangel(a, b, c)) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return -1.0;
    }

    private static int digitsSum(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int hosts(String ip) {
        String[] ipArr = ip.split("/");
        int subnet = Integer.valueOf(ipArr[1]);
        return (int) (Math.pow(2, subnet)-2);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 -> 8");
        int t = s.nextInt();
        switch (t) {
            case 1:
                int[] arr = randomArray(true, 100, 10);
                System.out.println("Used Array: " + Arrays.toString(arr));
                int max = getMax(arr);
                System.out.println("Max: " + Integer.toString(max));
                break;
            case 2:
                int day = randomNum(false, 29);
                int month = randomNum(false, 13);
                int year = randomNum(false, 2026);
                System.out.println(
                        "Used date: " + Integer.toString(day) + "." + Integer.toString(month) + "." + Integer.toString(year));
                int count = dayCount(day, month, year);
                System.out.println("Count: " + Integer.toString(count));
                break;
            case 3:
                String text = randomString(100);
                System.out.println("String: " + text);
                textAnalysis(text);
                break;
            case 4:
                int a = randomNum(false, 100);
                int b = randomNum(false, 100);
                int c = randomNum(false, 100);
                System.out.println("a: "+Integer.toString(a)+" b: "+Integer.toString(b)+" c: "+Integer.toString(c));
                double area = triangleArea(a, b, c);
                System.out.println("Area: "+Double.toString(area));
                break;
            case 5:
                int num = randomNum(false, 1000);
                System.out.println("Number: "+Integer.toString(num));
                int sum = digitsSum(num);
                System.out.println("Sum: "+Integer.toString(sum));
                break;
            case 6:
                String ip = randomIP();
                System.out.println("IP: "+ip);
                int hosts = hosts(ip);
                System.out.println("Hosts: "+Integer.toString(hosts));
                break;
        }
    }
}

