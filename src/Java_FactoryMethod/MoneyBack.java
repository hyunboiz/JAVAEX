package Java_FactoryMethod;

public class MoneyBack implements creditCard{

    @Override
    public String GetCardType() {
        return "MoneyBack";
    }

    @Override
    public int GetCreditLimit() {
        return 50000000;
    }

    @Override
    public int GetAnnualCharge() {
        return 50000;
    }
}
