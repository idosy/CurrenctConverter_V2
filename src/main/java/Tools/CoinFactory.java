package Tools;

public class CoinFactory {
    public static Coin getCoinInstance(Coins coin){


            switch (coin){
            case ILS:
                return new Ils();
            case USD:
                return new Usd();
            case EURO:
                return new Euro();
        }
        return null;
    }
}
