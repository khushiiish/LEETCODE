public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();

        System.out.println(obj.isPowerOfTwo(1));   // true
        System.out.println(obj.isPowerOfTwo(2));   // true
        System.out.println(obj.isPowerOfTwo(4));   // true
        System.out.println(obj.isPowerOfTwo(8));   // true
        System.out.println(obj.isPowerOfTwo(10));  // false
        System.out.println(obj.isPowerOfTwo(16));  // true
        System.out.println(obj.isPowerOfTwo(18));  // false
    }
} 
