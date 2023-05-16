package Java_FactoryMethod;

public class CardFactory {
    public static creditCard getCard(String cardType){
        switch (cardType){
            case "MoneyBack":
                return new MoneyBack();
            case "Platinum":
                return new Platinum();
            case "Titanium":
                return new Titanium();
            default:
                return null;
        }
    }
}
