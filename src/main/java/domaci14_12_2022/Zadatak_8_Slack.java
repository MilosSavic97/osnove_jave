package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak_8_Slack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sat: ");
        int sat = s.nextInt();
        System.out.println("Unesite minut: ");
        int min = s.nextInt();
        int pet = 5;

        if ((sat < 0 || sat >24) || (min <0 || min >60)){
            System.out.println("Uneli ste pogresan format sata ili minuta");
        } else if ((min < 29)&&(sat != 23)) {
            System.out.println(sat+ " : " + min);
            System.out.println(sat+ " : " + (min + pet));
            pet = pet + 5;
            System.out.println(sat+ " : " + (min + pet));
            pet = pet + 5;
            System.out.println( sat+ " : " + (min + pet));
            pet = pet + 5;
            System.out.println(sat+ " : " + (min  + pet));
            pet = pet + 5;
            System.out.println(sat+ " : " + (min + pet));
        } else if ((min>29)&&(sat != 23)) {
            System.out.println(sat + " : " + min); //PRVI UNETI MINUT
            min = min + pet;
            //DRUGI UNETI MINUT
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {
                sat = sat + 1;
                min = 00;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 61) {
                sat = sat + 1;
                min = 01;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 62) {
                sat = sat + 1;
                min = 02;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 63) {
                sat = sat + 1;
                min = 03;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 64) {
                sat = sat + 1;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }

            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///TRECI UNETI MINUT
                sat = sat + 1;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = sat + 1;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = sat + 1;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = sat + 1;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = sat + 1;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }

            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///CETVRTI UNETI MINUT
                sat = sat + 1;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = sat + 1;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = sat + 1;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = sat + 1;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = sat + 1;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///PETI JEBENI UNETI MINUT
                sat = sat + 1;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = sat + 1;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = sat + 1;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = sat + 1;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = sat + 1;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///CETVRTI UNETI MINUT
                sat = sat + 1;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = sat + 1;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = sat + 1;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = sat + 1;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = sat + 1;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }
        }else {  {
            System.out.println(sat + " : " + min); //PRVI UNETI MINUT
            min = min + pet;
            //DRUGI UNETI MINUT
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {
                sat = 00;
                min = 00;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 61) {
                sat = 00;
                min = 01;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 62) {
                sat = 00;
                min = 02;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 63) {
                sat = 00;
                min = 03;
                min = min + 5;
                System.out.println(sat + " : " + min);
            } else if (min == 64) {
                sat = 00;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }

            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///TRECI UNETI MINUT
                sat = 00;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = 00;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = 00;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = 00;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = 00;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }

            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///CETVRTI UNETI MINUT
                sat = 00;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = 00;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = 00;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = 00;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = 00;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///PETI JEBENI UNETI MINUT
                sat = 00;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = 00;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = 00;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = 00;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = 00;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }
            if (min < 60) {
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 60) {     ///CETVRTI UNETI MINUT
                sat = 00;
                min = 00;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 61) {
                sat = 00;
                min = 01;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 62) {
                sat = 00;
                min = 02;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 63) {
                sat = 00;
                min = 03;
                System.out.println(sat + " : " + min);
                min = min + 5;
            } else if (min == 64) {
                sat = 00;
                min = 04;
                System.out.println(sat + " : " + min);
                min = min + 5;
            }

        }}}}

