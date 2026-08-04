public class Operators{

    public static void main(String[] args) {

        // ===========================================================
        // 1. Arithmetic Operators
        // ===========================================================

        int a = 20;
        int b = 10;

        System.out.println("===== Arithmetic Operators =====");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Addition (+)       : " + (a + b));
        System.out.println("Subtraction (-)    : " + (a - b));
        System.out.println("Multiplication (*) : " + (a * b));
        System.out.println("Division (/)       : " + (a / b));
        System.out.println("Modulus (%)        : " + (a % b));

        // ===========================================================
        // 2. Unary Operators
        // ===========================================================

        System.out.println("\n===== Unary Operators =====");

        int x = 5;

        System.out.println("Original x : " + x);

        System.out.println("Post Increment (x++) : " + (x++));
        System.out.println("After x++            : " + x);

        System.out.println("Pre Increment (++x)  : " + (++x));

        System.out.println("Post Decrement (x--) : " + (x--));
        System.out.println("After x--            : " + x);

        System.out.println("Pre Decrement (--x)  : " + (--x));

        // ===========================================================
        // 3. Assignment Operators
        // ===========================================================

        System.out.println("\n===== Assignment Operators =====");

        int num = 10;

        System.out.println("Initial Value : " + num);

        num += 5;
        System.out.println("num += 5  : " + num);

        num -= 2;
        System.out.println("num -= 2  : " + num);

        num *= 3;
        System.out.println("num *= 3  : " + num);

        num /= 2;
        System.out.println("num /= 2  : " + num);

        num %= 4;
        System.out.println("num %= 4  : " + num);

        // ===========================================================
        // 4. Relational (Comparison) Operators
        // ===========================================================

        System.out.println("\n===== Relational Operators =====");

        int p = 30;
        int q = 20;

        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p <= q : " + (p <= q));

        // ===========================================================
        // 5. Logical Operators
        // ===========================================================

        System.out.println("\n===== Logical Operators =====");

        boolean java = true;
        boolean spring = false;

        System.out.println("java && spring : " + (java && spring));
        System.out.println("java || spring : " + (java || spring));
        System.out.println("!java          : " + (!java));
        System.out.println("!spring        : " + (!spring));

        // ===========================================================
        // 6. Bitwise Operators
        // ===========================================================

        System.out.println("\n===== Bitwise Operators =====");

        int m = 5; // Binary = 0101
        int n = 3; // Binary = 0011

        System.out.println("m & n : " + (m & n));
        System.out.println("m | n : " + (m | n));
        System.out.println("m ^ n : " + (m ^ n));
        System.out.println("~m    : " + (~m));

        // ===========================================================
        // 7. Shift Operators
        // ===========================================================

        System.out.println("\n===== Shift Operators =====");

        int value = 8;

        System.out.println("value << 1 : " + (value << 1));
        System.out.println("value >> 1 : " + (value >> 1));

        // ===========================================================
        // 8. Ternary Operator
        // ===========================================================

        System.out.println("\n===== Ternary Operator =====");

        int age = 18;

        String result = (age >= 18) ? "Eligible for Voting" : "Not Eligible";

        System.out.println(result);

        // ===========================================================
        // 9. instanceof Operator
        // ===========================================================

        System.out.println("\n===== instanceof Operator =====");

        String name = "Ravi";

        System.out.println(name instanceof String);

        // ===========================================================
        // End of Program
        // ===========================================================

        System.out.println("\nProgram Completed Successfully.");

    }
}