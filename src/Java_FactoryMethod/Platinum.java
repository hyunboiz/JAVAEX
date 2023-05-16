package Java_FactoryMethod;

public class Platinum implements creditCard{

    @Override
    public String GetCardType() {
        return "Platinum";
    }

    @Override
    public int GetCreditLimit() {
        return 100000000;
    }

    @Override
    public int GetAnnualCharge() {
        return 50000;
    }
}
