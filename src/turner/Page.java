package turner;
public class Page implements Turner{
    private int numberOfPage;

    public Page(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "numberOfPage=" + numberOfPage +
                '}';
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public void turn() {
        numberOfPage++;
    }
}
