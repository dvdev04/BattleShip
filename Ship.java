public class Ship {
    int size;

    Ship(int size, int width) {
        if (size * 2 < width) {
            this.size = size;
        }
        else throw new IllegalArgumentException();
    }

}