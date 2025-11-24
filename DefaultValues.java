
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    byte defaultByte= 5;
    short defaultShort= 8;
    int defaultInt= 6;
    long defaultLong= 12;
    float defaultFloat= 36;
    double defaultDouble= 9;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        DefaultValues checker = new DefaultValues();

        System.out.println("--- Default Values of Primitive Fields ---");
        System.out.println("byte: " + checker.defaultByte);
        System.out.println("short: " + checker.defaultShort);
        System.out.println("int: " + checker.defaultInt);
        System.out.println("long: " + checker.defaultLong);
        System.out.println("float: " + checker.defaultFloat);
        System.out.println("double: " + checker.defaultDouble);
        System.out.println("char: '" + checker.defaultChar + "' (ASCII/Unicode value 0)");
        System.out.println("boolean: " + checker.defaultBoolean);
    }
}