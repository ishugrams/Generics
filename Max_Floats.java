public class Max_Floats {
    public static void main(String[] args) {
        
        System.out.println("Test Case 1.1: " + maxFloat(30.1f, 25.2f, 10.2f)); // Expected output: 30.1
        System.out.println("Test Case 1.2: " + maxFloat(10.2f, 30.1f, 25.2f)); // Expected output: 30.1
        System.out.println("Test Case 1.3: " + maxFloat(10.2f, 25.2f, 30.1f)); // Expected output: 30.1
    }

    static float maxFloat(float a, float b, float c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
