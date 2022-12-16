package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak6_14_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = " # ";

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        if (a >= 0){
            str = str + a;
        } else {
            str = a + str;
        }
        System.out.println("Unesite b: ");
        int b = s.nextInt();
            if (b >= 0){
                str = str + b;
            } else {
                str = b + str;
            }
            System.out.println("Unesite c: ");
            int c = s.nextInt();
                if (c >= 0){
                    str = str + c;
                } else {
                    str = c + str;

                    System.out.println("Unesite d: ");
                    int d = s.nextInt();
                    if (d >= 0) {
                        str = str + d;
                    } else {
                        str = d + str;
                    }

                    System.out.println(str);


                }
}}
