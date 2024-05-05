public class ThreadPriority {
    public static void main(String[] args) {
        try {
            Thread Td1 = new Thread();
            Thread Td2 = new Thread();

            System.out.println("Before any change in thread:");
            System.out.println("The priority of " + Td1.getName() + " is " + Td1.getPriority());
            System.out.println("The priority of " + Td2.getName() + " is " + Td2.getPriority());

            Td1.setPriority(1);
            Td2.setPriority(8);
            System.out.println("After changing thread priority:");
            System.out.println("The priority of " + Td1.getName() + " is " + Td1.getPriority());
            System.out.println("The priority of " + Td2.getName() + " is " + Td2.getPriority());
        } catch(Exception e) {
            System.out.println("Main Thread interrupted");
        }
    }
}
