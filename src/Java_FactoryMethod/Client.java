package Java_FactoryMethod;

public class Client {
    public static void main(String[] args) {
        creditCard Card = CardFactory.getCard("MoneyBack");
        if(Card != null){
            System.out.println(Card.GetCardType());
            System.out.println("Phi thuong nien: "+Card.GetAnnualCharge());
            System.out.println("Han muc: "+Card.GetCreditLimit());
        }
    }
}
