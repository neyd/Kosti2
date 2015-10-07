
package com.neyd.Kosti2;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Женя on 06.10.2015.
 */
public class Kosti2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String resp2 = null;
        String gamer1 = null;
        String gamer2 = null;
        int n = 0;
        int m = 0;
        int l = 0;
        System.out.println("Введіть ім'я гравця 1");
        gamer1 = scanner.nextLine();
        System.out.println("Введіть ім'я гравця 2");
        gamer2 = scanner.nextLine();
        while (true) {
            System.out.println("Кидає " + gamer1);
            scanner.nextLine();
            int kub1 = random.nextInt(6) + 1;
            int kub2 = random.nextInt(6) + 1;
            System.out.println(kub1 + "     " + kub2 + "     " + (kub1 + kub2));
            System.out.println();
            System.out.println("Кидає " + gamer2);
            scanner.nextLine();
            int kub3 = random.nextInt(6) + 1;
            int kub4 = random.nextInt(6) + 1;
            System.out.println(kub3 + "     " + kub4 + "     " + (kub3 + kub4));
            System.out.println();
            if (kub1 + kub2 > kub3 + kub4) {
                n = n+1;
                System.out.println("Переможець " + gamer1 + "    " + n + ":" + m);
            } else if (kub1 + kub2 == kub3 + kub4) {
                System.out.println("Нічия "+"     "+n+":"+m);
            } else {
                m = m+1;
                System.out.println("Переможець " + gamer2 + "    " + n + ":" + m);
            }
            l=l+1;
            System.out.println("Якщо хочете зупинитися 2! "+ "    гра        "+l );
            resp2 = scanner.nextLine();
            if (resp2.equals("2")){
                if(n>m){
                    System.out.println(gamer1 + " Виграв з рахунком" + n + ":" +  m);
                }
                else if(m>n) {
                    System.out.println(gamer2 + " Виграв з рахунком" + m + ":" + n);
                }
                else {
                    System.out.println("нічия, рахунок "+ n + ":"+m);
                }
                break;
            }
        }
    }
}