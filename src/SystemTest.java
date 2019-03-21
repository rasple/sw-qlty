package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemTest {

    public static void main(String[] args) {
        List<Component> resistors = new ArrayList<Component>();
        Scanner sc = new Scanner(System.in);
       

        do{
            System.out.println("Neue Komponente!\nBitte Ausfallwahrscheinlichkeit eingeben: ");
            Component res = new Component(sc.nextDouble());
            resistors.add(res);
            System.out.println("Weitere Komponenten anlegen? (y/n)");
        } while(sc.next().matches("[yY]"));

        sc.close();
        //System1 system1 = new System1();
        //System2 system2 = new System2();
        //System3 system3 = new System3();
    }
}
