package practical_works.prac_3.Shells;

public class num_1 {
    public static void main(String[] args) {
        Double doubleObj1 = 3.14;
        Double doubleObj2 = Double.valueOf("2.718");
        String strValue = "1.618";
        double parsedDouble = Double.parseDouble(strValue);
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);
        String d = Double.toString(3.14);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive float: " + primitiveFloat);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive long: " + primitiveLong);
        System.out.println("Primitive short: " + primitiveShort);
        System.out.println("Primitive byte: " + primitiveByte);
        System.out.println("Str double: " + d);
    }
}
