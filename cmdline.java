public class cmdline {
    int num1, num2, num3;
    public static void main(String args[]) {
        cmdline obj = new cmdline();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            System.out.println(args[i]);
        }
        obj.num1 = Integer.parseInt(args[0]);
        obj.num2 = Integer.parseInt(args[1]);
        obj.num3 = obj.num1 * obj.num2;
        System.out.println(obj.num1 + " * " + obj.num2 + " = " + obj.num3);
    }
}