public class Apple{
    private int price;
    private String kind;

    public Apple() {}

    public Apple(int price, String kind) {
        this.price = price;
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public String getKind() {
        return kind;
    }

    public String toString() {
        return price + " " + kind;
    }
}
