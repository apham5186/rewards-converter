public class RewardValue{
    double cash;
    double miles;

    public RewardValue(double cashValue){
        this.cash = cashValue;
        this.miles = cashToMiles(cashValue);
    }
    public RewardValue(int milesValue){
        this.miles = milesValue;
        this.cash = milesToCash(milesValue);
    }
    private double cashToMiles(double cashValue){
     return cashValue/0.0035;
    }
    private double milesToCash(double miles){
        return miles * 0.0035;
    }
    double getCashValue(){
        return this.cash;
    }
    double getMilesValue(){
        return this.miles;
    }
}