package unit09.inheritance.day38.mail;

public class FastMail extends Mailing{
    public FastMail(double weight) {
        super(weight);
    }

    @Override
    public double calculateShipping() {
        return super.calculateShipping()+5;
    }
}
