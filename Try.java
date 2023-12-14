class Calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        if (r > 10)
            return r;
        else
            return r + 1;
    }
}

public class Try {
    // class name should start with capital letter.
    public static void main(String... args) {
        // int num1 = 10;
        // int num2 = 20;
        // Calculator cal = new Calculator();
        // int result = cal.add(num1, num2);
        int nums[][] = new int[3][];
        for (int[] n : nums)
            System.out.println(n.length);
    }
}
