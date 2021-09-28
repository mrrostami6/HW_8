package turner;
public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf("yellow");
        Page page = new Page(1);
        Pancake pancake = new Pancake(PancakeSide.BACK);
        Bulb bulb = new Bulb(BulbTurn.ON);

        System.out.println(leaf);
        System.out.println(page);
        System.out.println(pancake);
        System.out.println(bulb);
        System.out.println("---------\n---------\n--------");

        leaf.turn();
        page.turn();
        pancake.turn();
        bulb.turn();

        System.out.println(leaf);
        System.out.println(page);
        System.out.println(pancake);
        System.out.println(bulb);
    }
}
