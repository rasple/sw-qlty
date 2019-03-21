package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SystemTest {

    public static void main(String[] args) {
        List<Component> components = new ArrayList<Component>();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Neue Komponente!\nBitte Ausfallwahrscheinlichkeit eingeben: ");
            try {
                Double prob = sc.nextDouble();
                if(prob > 1 || prob < 0){
                    System.out.println("Fehler: Eine Wahrscheinlichkeit muss zwischen 0 und 1 liegen!");
                    continue;
                }
                Component res = new Component(prob);
                components.add(res);
            } catch (Exception e) {
                System.out.println("Fehler: Ungültige Eingabe!");
                continue;
            }
            System.out.println("Weitere Komponenten anlegen? (y/n)");
        } while (sc.next().matches("[yY]"));

        sc.close();
        // Convert to Array
        Component[] comps = components.toArray(new Component[components.size()]);

        // Run tests
        List<SystemInterface> systems = new ArrayList<SystemInterface>();
        systems.add(new System1());
        systems.add(new System2());
        //systems.add(new System3());

        Map<String, Double> reliabilities = new HashMap<String, Double>();

        for (SystemInterface sys : systems) {
            double rel = sys.reliability(comps);
            String name = sys.getClass().getTypeName();
            System.out.println(name + ": " + rel);
            reliabilities.put(name, rel);
        }
    }
}
