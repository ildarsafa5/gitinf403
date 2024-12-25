import java.util.Arrays;

public class Main implements  ICompareObject{
    public static void main(String[] args) {
        Main main = new Main();
        Apple[] apples = {
                new Apple(120,"Голд"),
                new Apple(110, "Семеринка")
        };
        ArrayUtils.sort(apples, main);
        System.out.println(Arrays.toString(apples));
    }

    @Override
    public int compare(Object var1, Object var2) {
        return (((Apple)var1).getPrice()-((Apple)var2).getPrice());
    }
}
