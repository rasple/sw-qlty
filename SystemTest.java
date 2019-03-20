import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemTest {
    
    public static void main() {

        List<Resistor> resistors = new ArrayList<Resistor>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Neue Komponente!\nBitte Ausfallwahrscheinlichkeit eingeben: ");
            Resistor res = new Resistor(sc.nextDouble());
            resistors.add(res);
            System.out.println("Weitere Komponenten anlegen? (y/n)");
            } while(sc.nextLine().matches("y"));
            


        }

        System1 system1 = new System1();
        System2 system2 = new System2();
        //System3 system3 = new System3();
    }

}