 class Task {
    public static void main(String[] args) {

        int num = 65;
         double num1 = 56.09;

        
        byte b = (byte) num;
        short s = (short) num;
        char ch = (char) num;
         int a = (int)num1;

        
        long l = num;
        float f = num;
        double d = num;

        System.out.println("int value    : " + num);
        System.out.println("byte value   : " + b);
        System.out.println("short value  : " + s);
        System.out.println("long value   : " + l);
        System.out.println("float value  : " + f);
        System.out.println("double value : " + d);
        System.out.println("char value   : " + ch);
        System.out.println("Int value    : " + a);
    }
}