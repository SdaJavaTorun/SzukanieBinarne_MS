package com.sdajava.szukaniebinarne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    int n;
    int x;
    int[] tab;

    public void declaration(){
        System.out.println("Podaj ilość elementów tablicy: ");
        int n = input.nextInt();
        this.n=n;
        tab = new int[n];
        this.tab = tab;
        System.out.println("Podaj szukaną wartość: ");
        int x = input.nextInt();
        this.x = x;
    }

    public void showTab(){
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(20);
        }
    }

    public void sortAndShowTab(){
        Arrays.sort(tab);
        System.out.println("Tablica: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public int shareAndChecktTab(){
        int l =1; int p = n;
        int s = (l + p)/2;
        while ( tab[s] != this.x){
            if (l > p) {
                System.out.println("Nie odnaleziono elementu " + this.x);
                return 0;
            } else {
                 s = (l + p)/2;
                if(tab[s] == this.x) {
                    System.out.println("Wartość " + x + " znajduje się w tab[" + s + "].");
                    return s;
                } else if (tab[s] > this.x) {
                    p = s - 1;
                } else {
                    l = s + 1;
                }
            }
        }
       return s;
    }

    public static void main(String[] args) {
    Main obiekt = new Main();
    obiekt.declaration();
    obiekt.showTab();
    obiekt.sortAndShowTab();
    System.out.println(obiekt.shareAndChecktTab());
    }
}
