import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImport {
    public static void main(String[] args) {
        out.println("sqrt " + sqrt(2.0)); // It is though not recommended to use a static import for System.out.
        out.println("tan " + tan(60));    // It makes it unclear what 'out' is and where it came from.
        // Though it is quite considerable to use it places like for Math, still it is not recommended to use it as it can lead to many naming conflicts.
    }
}

