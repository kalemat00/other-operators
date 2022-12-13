public class Tester {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b ++;

        if((b % 2 == 1) && (((b * (b + 1)) % 3) == 0))
            System.out.println("b odd number and b * (b + 1) is a multiple of 3.");
    }
}
