package src;

public class System2 implements SystemInterface {
    public double reliability(Component[] resistors) {
        double totalFailureRate=1;
        for(Component res : resistors){
            totalFailureRate*=(1-(Math.exp((-res.getFailureRate())*87600)));
        }
        return (1-totalFailureRate);

    }
}