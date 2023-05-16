package Java_FactoryMethod;

public class Titanium implements creditCard{

    @Override
    public String GetCardType() {
        return "Titanium";
    }

    @Override
    public int GetCreditLimit() {
        return 500000000;
    }

    @Override
    public int GetAnnualCharge() {
        return 500000;
    }
}
