public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Primitive type
        char c1 = 'c';                     // single character
        char c2 = 67;                    // 2 byte (0 to 65535)

        float f = 3.141592f;              // 4 bytes (32 bits of precision) 6 - 7 digits
        double d = 3.141592653589793;     // 8 bytes (64 bits of precision) 15 - 16 digits

        boolean b = true;                 // 1 byte (true or false)


        short s = -32768;                  // 2 bytes (−32,768 to +32,767)

        int i = -2147483648;               // 4 bytes (-2,147,483,648 to +2,147,483,647)

        long l = 9223372036854775807L;     // 8 bytes (-9 quintillion to +9 quintillion)

        System.out.println(c1);  // char
        System.out.println(c2);  // char represented by unicode
        System.out.println(f);  // float
        System.out.println(d);  // double
        System.out.println(b);  // boolean
        System.out.println(s);  // short
        System.out.println(i);  // int
        System.out.println(l);  // long

        // Reference type
        String str = "string";             // size --> depends on how many character are there in the string
        System.out.println(str);
    }
}
