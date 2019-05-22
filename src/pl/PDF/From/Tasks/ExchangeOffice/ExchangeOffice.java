package pl.PDF.From.Tasks.ExchangeOffice;

import java.util.ArrayList;
import java.util.List;

public class ExchangeOffice {
    List<Value> values = new ArrayList<>();

    public ExchangeOffice(double amount) {
        for (int i = 0; i < 7; i++) {
            values.add(new Value(amount));
        }
        values.get(0).setCurrency(Currency.PLN);
        values.get(0).setExchangeRate(1);
        values.get(1).setCurrency(Currency.EUR);
        values.get(1).setExchangeRate(4.3);
        values.get(2).setCurrency(Currency.USD);
        values.get(2).setExchangeRate(3.836);
        values.get(3).setCurrency(Currency.GBP);
        values.get(3).setExchangeRate(4.99);
        values.get(4).setCurrency(Currency.RUB);
        values.get(4).setExchangeRate(0.05);
        values.get(5).setCurrency(Currency.JPY);
        values.get(5).setExchangeRate(3.4625);
        values.get(6).setCurrency(Currency.CZK);
        values.get(6).setExchangeRate(0.1666);
    }

    public void showFunds() {
        System.out.println("Current funds: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(values.get(i).getAmount() + " " + values.get(i).getCurrency());

        }

    }

    void exchange(double amount, Currency from, Currency to) {

        if (from==Currency.PLN||to==Currency.PLN){
            if(from==Currency.PLN){
                values.get(0).addAmount(amount);
                for (int i=0;i<7;i++){
                    if(values.get(i).getCurrency()==to){
                        values.get(i).subtractAmount(0.8*amount/values.get(i).getExchangeRate());
                        break;
                    }

                }
            }else {
                for(int i=0;i<7;i++){
                    if(values.get(i).getCurrency()==from){
                        values.get(i).addAmount(amount);
                        values.get(0).subtractAmount(amount*0.8*values.get(i).getExchangeRate());
                        break;
                    }
                }
            }
        }

    }
}