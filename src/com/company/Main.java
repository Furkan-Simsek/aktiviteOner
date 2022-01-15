package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
    System.out.print("Hava Sıcaklığını girin: (ºC): ");
    double degree = inp.nextDouble();
    if (degree <= 5) {System.out.println("Kayak yap");}
    else if (degree > 5 && degree <= 15) {System.out.println("Sinamaya git");}
    else if (degree > 15 && degree <= 25) {System.out.println("Piknik yap"); }
    else if (degree > 25 ) { System.out.println("Yüzmeye git");};
    }
}
