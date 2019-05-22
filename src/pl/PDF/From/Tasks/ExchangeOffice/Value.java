package pl.PDF.From.Tasks.ExchangeOffice;

public class Value {
    private double amount;
    private Currency currency;
    private double exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Value(double amount, Currency currency, double exchangeRate) {
        this.amount = amount;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
    }
public void addAmount(double amount){
        this.amount+=amount;
}
    public void subtractAmount(double amount){
        this.amount-=amount;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Value(double amount) {
        this.amount = amount;
    }
}
