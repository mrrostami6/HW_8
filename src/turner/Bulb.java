package turner;
public class Bulb implements Turner{
    private BulbTurn bulbTurn;

    public Bulb(BulbTurn bulbTurn) {
        this.bulbTurn = bulbTurn;
    }

    @Override
    public String toString() {
        return "Bulb{" +
                "bulbTurn=" + bulbTurn +
                '}';
    }

    public BulbTurn getBulbTurn() {
        return bulbTurn;
    }

    public void setBulbTurn(BulbTurn bulbTurn) {
        this.bulbTurn = bulbTurn;
    }

    @Override
    public void turn() {
        if (bulbTurn.equals(BulbTurn.OFF))
            bulbTurn = BulbTurn.ON;
        else
            bulbTurn = BulbTurn.OFF;
    }
}
