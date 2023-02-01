package unit09.inheritance.day38.mail;

public class Mailing {
    private double weight;

    public Mailing(double weight) {
        this.weight = weight;
    }

    public double calculateShipping(){
        return weight*0.15;
    }

    public double getWeight() {
        return weight;
    }
}
