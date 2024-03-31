public class TestFormat {
    public static void main(String[] args) {
        long myBillion = 1_000_000_000; // We can separate digits using underscores to make is more readable.

        //  %.1 = decimal precision
        //  %1  = minimum field width
        //  %-  = left align
        //  %,  = formats numeric values by separating them using commas.

        String s1 = String.format("%,15d", myBillion);
        String s2 = String.format("%,-15d", myBillion);
        System.out.println(s1);
        System.out.println(s2);

        float myFloat = 330000.333336f;
        String s3 = String.format("%,-15.5f", myFloat);
        System.out.println(s3);
    }
}
