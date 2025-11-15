package CoreJava;

public class Main {

    public static void main(String[] args) {

        try {
            // Loading animation before header
            System.out.print("Loading CoreJava modules");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400); // 0.4 sec delay for each dot
                System.out.print(".");
            }
            System.out.println("\n"); // new line after loading complete
        } catch (InterruptedException e) {
            System.out.println("\nLoading interrupted!");
        }

        printHeader();
        System.out.println("Welcome to the CoreJava Project! 🚀");
        System.out.println("A complete collection of Core Java practice programs.\n");

        System.out.println("📚 Topics Covered:");
        System.out.println("  1️⃣  Basics & Decision Making");
        System.out.println("  2️⃣  Numbers & Mathematical Logic");
        System.out.println("  3️⃣  Arrays (1D & 2D)");
        System.out.println("  4️⃣  Strings & Character Operations");
        System.out.println("  5️⃣  Patterns (Star & Number Patterns)");
        System.out.println("  6️⃣  Sorting & Searching Algorithms\n");

        System.out.println("Developed by: Aditya Raj 💻");
        System.out.println("---------------------------------------------------");
        System.out.println("Ready to explore the world of Core Java!");
        System.out.println("---------------------------------------------------");
        System.out.println("👉 Tip: Navigate to the topic packages inside /src/CoreJava/");
        System.out.println("   and run any program to test your Java logic.\n");

        printFooter();
    }

    private static void printHeader() {
        System.out.println("===================================================");
        System.out.println("🧠  CORE JAVA PROJECT - LOGIC BUILDER & PRACTICE 🧩");
        System.out.println("===================================================");
    }

    private static void printFooter() {
        System.out.println("===================================================");
        System.out.println("🔥 Keep coding, keep learning – Java never stops! 🔥");
        System.out.println("===================================================");
    }
}
