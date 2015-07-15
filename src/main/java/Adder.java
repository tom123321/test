public class Adder {

    private final int baseValue;

    public Adder(int baseValue) {
        this.baseValue = baseValue;
    }

    int sumWith( int valueToAdd ) {
        return baseValue + valueToAdd;
    }

}
