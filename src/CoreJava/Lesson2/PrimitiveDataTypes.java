package CoreJava.Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = -128;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        short s1 = 32767;
        short s2 = -32768;

        int i1 = 2147483647;
        int i2 = -2147483648;

        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;

        float f1 = 3.14159265358979f;
        float f2 = -3.14159265358979f;
        float f3 = 20;

        double d1 = 3.14159265358979d;
        double d2 = -3.14159265358979d;

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 330;
        char c4 = '\u2665';

        boolean bool = true;
        boolean bool2 = false;

        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);

    }
}
