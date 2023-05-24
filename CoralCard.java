package FactoryDesignPattern;

public class CoralCard implements ICreditCard{

    @Override
    public String GetCardType() {
        // TODO Auto-generated method stub
        return "Coral Card";
    }

    @Override
    public int GetAnnualFee() {
        // TODO Auto-generated method stub
        return 500;
    }

    @Override
    public int GetCardLimit() {
        // TODO Auto-generated method stub
        return 50000;
    }
    
}
