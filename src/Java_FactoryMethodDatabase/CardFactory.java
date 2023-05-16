package Java_FactoryMethodDatabase;

public class CardFactory implements creditCard{


    @Override
    public String GetCardType() {
        return null;
    }

    @Override
    public int GetCreditLimit() {
        return 0;
    }

    @Override
    public int GetAnnualCharge() {
        return 0;
    }
}
