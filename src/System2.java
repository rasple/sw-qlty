package src;

public class System2 implements SystemInterface {
    public double reliability(Resistor[] resistors) {
        double totalFailureRate=1;
        for(Resistor res : resistors){
            totalFailureRate*=(1-(Math.exp((-res.getFailureRate())*87600)));
        }
        return (1-totalFailureRate);

    }
}