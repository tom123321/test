public class Multipler {

    private final int baseValue;

    public Multipler(int baseValue) {
        this.baseValue = baseValue;
    }

    public int multiplyBy( int value ) {
        return baseValue * value;
    }
}
