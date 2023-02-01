package unit09.inheritance.day36.overridemethod;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(0);
        card.transaction(100);
        card.info();
        card.transaction(20);
        card.info();
        card.transaction(13.25);
        card.info();

        RewartCard rCard = new RewartCard(0,0.01,0);
        rCard.info();
        rCard.transaction(99.69);
        rCard.info();
        rCard.transaction(12.56);
        rCard.info();
    }
}
