import java.util.ArrayList;

public class Ocean {
    private int width;
    private ArrayList<Integer> battlefield;

    Ocean(int width) {
        this.width = width;
        this.battlefield = new ArrayList<>(width);
    }

    public ArrayList<Integer> getBattlefield() {
        return battlefield;
    }

    public int getWidth() {
        return width;
    }
}