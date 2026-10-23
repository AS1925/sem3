class ExceptionDemo {
    public static void main(String[] args) {

        try { System.out.println(30 / 0); }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

        try { Integer.parseInt("This is a Number"); }
        catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }

        try {
            int[] a = new int[5];
            a[6] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        try {
            Object[] a = new Integer[5];
            a[0] = "Hello";
        }
        catch (ArrayStoreException e) {
            System.out.println("Array store exception");
        }

        try {
            String s = null;
            s.charAt(0);
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}