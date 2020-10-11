public class Main {

    public static void main(String[] args) {
        boolean a = FALSE
        char b = 'B'
        byte c = 11
        short d = 12
        int e = 13
        long f = 14
        float g = 0.3f
        double h = 16

        System.out.println("boolean = " + Boolean.FALSE);
        System.out.println("boolean = " + Boolean.TRUE);
        System.out.println("char = " + Character.MAX_VALUE);
        System.out.println("byte min = " + Byte.MIN_VALUE);
        System.out.println("byte max = " + Byte.MAX_VALUE);
        System.out.println("short min = " + Short.MIN_VALUE);
        System.out.println("short max = " + Short.MAX_VALUE);
        System.out.println("int min = " + Integer.MIN_VALUE);
        System.out.println("int max = " + Integer.MAX_VALUE);
        System.out.println("long min = " + Long.MIN_VALUE);
        System.out.println("long max = " + Long.MAX_VALUE);
        System.out.println("float min = " + Float.MIN_VALUE);
        System.out.println("float max = " + Float.MAX_VALUE);
        System.out.println("double min = " + Double.MIN_VALUE);
        System.out.println("double max = " + Double.MAX_VALUE);
        System.out.println();
        
        
        int [] array = new int[10];
        int min = 0;
        int max = array[1];


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("array min = " + min);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("array max = " + max);


    }
}
