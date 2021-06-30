import java.util.Vector;

public class Kartendeck {
    boolean includeJoker;
    int amount;
    Vector<DefaultCard> defaultCards;
    Vector<JokerCard> jokerCards;

    /**
     * @author Maruthan Thanabalasingam
     * @param includeJoker
     * @param amount
     *
     * Das Kartendeck generiert die Karten mit der Instanziierung.
     * Im Konstruktor wird aufgenommen ob es Jokerkarten enthält und wie viel Karten bereitgestellt werden sollen.
     */

    public Kartendeck(boolean includeJoker,int amount){
        this.setIncludeJoker(includeJoker);
        this.setAmount(amount);

        //eine allgemeine Collection mit allen möglichen Karten
        defaultCards = new Vector<DefaultCard>();
        jokerCards = new Vector<JokerCard>();

        Karte[] deck = new Karte[amount];

        int cnt=0;
        for(Karte karte:defaultCards){
            if (cnt<=7){
            deck[cnt] = karte;
            }if (cnt>7){
                deck[cnt]=jokerCards.iterator().next();
            }
        }



    }

    public boolean isIncludeJoker() {
        return includeJoker;
    }

    public void setIncludeJoker(boolean includeJoker) {
        this.includeJoker = includeJoker;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
