package src.wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        Double doubleValue = 5.5;

        byte byteValue = doubleValue.byteValue();
        short shortValue = doubleValue.shortValue();
        int intValue = doubleValue.intValue();
        float floatValue = doubleValue.floatValue();
        long longValue = doubleValue.longValue();

        System.out.println("Original Double value: " + doubleValue);
        System.out.println("Converted to byte: " + byteValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to long: " + longValue);

        Double zeroValue = 0.0;
        Double nanValue = doubleValue / zeroValue;
        Double infinityValue = zeroValue / zeroValue;

        System.out.println("NaN Value: " + nanValue);
        System.out.println("Infinity Value: " + infinityValue);

        System.out.println("NaN Value: " + nanValue);
        if (nanValue.isNaN()) {
            System.out.println("Variable nanValue = NaN");
        }

        System.out.println("Infinity Value: " + infinityValue);
        if (infinityValue.isInfinite()) {
            System.out.println("Variable infinityValue = Infinity");
        }

        Long longValue1 = 120L;
        Long longValue2 = 120L;

        System.out.println("Comparing initial values:");
        System.out.println("longValue1 == longValue2: " + (longValue1 == longValue2));

        longValue1 = 1200L;
        longValue2 = 1200L;

        System.out.println("\nComparing updated values:");
        System.out.println("longValue1 == longValue2: " + (longValue1 == longValue2));

    }
}
