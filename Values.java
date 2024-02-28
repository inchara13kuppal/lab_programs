package week2;

class Values {
    byte Byte;
    int integer;
    long Long;
    short Short;
    boolean Boolean;
    String string;
    float Float;
    char ch;
    double Double;

    void getValues() {
        System.out.println("The Default value of primitive datatype Byte: " + Byte);
        System.out.println("The Default value of primitive datatype Integer: " + integer);
        System.out.println("The Default value of primitive datatype Long: " + Long);
        System.out.println("The Default value of primitive datatype Short: " + Short);
        System.out.println("The Default value of primitive datatype Boolean: " + Boolean);
        System.out.println("The Default value of String: " + string);
        System.out.println("The Default value of primitive datatype Float: " + Float);
        System.out.println("The Default value of primitive datatype char: " + ch);
        System.out.println("The Default value of primitive datatype double: " + Double);
    }
}

class DefaultValues {
    public static void main(String[] args) {
        Values var = new Values();
        var.getValues();
    }
}
