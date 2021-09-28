package turner;
public class Leaf implements Turner {

    private static final String[] colors = {"red", "yellow", "green", "orange"};
    private static int counter = 0;
    private String color;


    public Leaf(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void turn() {
        if (counter < 4)
            color = colors[counter++];
        else
            counter = 0;
    }
}
