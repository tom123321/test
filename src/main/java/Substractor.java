public class Substractor {

    private final int baseValue;

    public Substractor(int baseValue) {
        this.baseValue = baseValue;
    }

    public int substractBy( int value ) {
        return baseValue - value;
    }
}
