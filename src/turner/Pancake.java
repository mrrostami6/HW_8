package turner;
public class Pancake implements Turner{
    private PancakeSide currentSide;

    public Pancake(PancakeSide currentSide) {
        this.currentSide = currentSide;
    }

    public PancakeSide getCurrentSide() {
        return currentSide;
    }

    public void setCurrentSide(PancakeSide currentSide) {
        this.currentSide = currentSide;
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "currentSide=" + currentSide +
                '}';
    }

    @Override
    public void turn() {
        if (currentSide.equals(PancakeSide.BACK))
            currentSide = PancakeSide.FRONT;
        else
            currentSide = PancakeSide.BACK;
    }
}
