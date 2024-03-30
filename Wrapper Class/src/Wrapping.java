import java.util.ArrayList;

public class Wrapping {
    public static void main(String[] args) {
        Integer iWrap = 44; // Autoboxing: The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
        int unwrapped = iWrap; // Unboxing: The reverse of autoboxing. Automatic conversion of wrapper class to primitive.
        System.out.println(unwrapped);

        // Wrapper classes are useful when working with collections for example ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(67); // 67 is auto-boxed to Integer, as arrayList stores Integer types.
        System.out.println(arrayList.getFirst() + "\n");

        // Wrapper classes have other useful static methods like parse method.
        // parse methods takes a string and returns the primitive value
        String s = "2";
        int x = Integer.parseInt(s);
        System.out.println(x+2);


        double d = 42.5;
        String doubleString1 = "" + d;
        String doubleString2 = Double.toString(d);
        String doubleString3 = String.valueOf(d);
    }
}