package FactoryDesignPattern;

public class PlatinumCard implements ICreditCard{

    @Override
    public String GetCardType() {
        // TODO Auto-generated method stub
        return "Platinum Card";
    }

    @Override
    public int GetAnnualFee() {
        // TODO Auto-generated method stub
        return 100;
    }

    @Override
    public int GetCardLimit() {
        // TODO Auto-generated method stub
        return 10000;
    }

}
