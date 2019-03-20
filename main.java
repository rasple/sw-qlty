import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean abort = false;
        Resistor[] resistors;

        while(!abort){
            SystemInterface.out.println("Neue Komponente!\nBitte Ausfallwahrscheinlichkeit eingeben: ");
            Scanner sc = new Scanner(SystemInterface.in);
            Resistor res = new Resistor(sc.nextDouble());
            


        }

        System1 system1 = new System1();
        System2 system2 = new System2();
        //System3 system3 = new System3();
    }

}