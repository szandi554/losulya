/*
* File: App.java
* Author: Siegenthaler Alexandra 
* Copyright: 2026, Siegenthaler Alexandra 
* Group: Szoft II/2/E
* Date: 2026-02-19
* Github: https://github.com/szandi554/losulya
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;
  
public class App {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ló súlyának becslése (Carroll és Huntington képlet alapján)");
        System.out.println("-----------------------------------------------------------");

        
        System.out.print("Add meg a mellkas kerületét (cm): ");
        double mellkasKerulet = sc.nextDouble();

        
        System.out.print("Add meg a ló hosszát (cm): ");
        double hossz = sc.nextDouble();

        
        double loSulya = (mellkasKerulet * mellkasKerulet * hossz) / 11877;

        
        System.out.println("-----------------------------------------------------------");
        System.out.println("A ló becsült súlya: " + loSulya + " kg");

        
        sc.close();
    }
}
