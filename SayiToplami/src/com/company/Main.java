package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Lütfen sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int toplam = 0;
        for(int i=0; i<=n; i++){
            toplam += i;
        }
        System.out.println("Sayıların toplamı : "+toplam);
    }
}
