package pl.PDF.From.Tasks.ExchangeOffice;

public class Main {
    public static void main(String[] args) {
        ExchangeOffice exchangeOffice=new ExchangeOffice(1000);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(100,Currency.PLN,Currency.EUR);
        exchangeOffice.showFunds();
    }
}
