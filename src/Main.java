
public class Main {
    public static void main(String[] args) {
        long l = 123456;
        double d1, d2;
        float f = 14.75f;
        char c1 = '0';
        l = (long) f;
        d1 = Math.random() * (1000 - 100) + 100;
        int v2 = (int) (Math.random() * 99) + 1;
        System.out.println("Змінна l = " + l);
        System.out.println("Змінна d1 = " + d1);
        System.out.println("Змінна в2 = " + v2);
        double n1, n2;
        n1 = Math.random() * (1000 - 100) + 100;
        n2 = Math.random() * (1000 - 100) + 100;
        double y = Math.sin(d1) * Math.cos(n2) - (Math.atan(n1) / Math.atan(n2));
        System.out.println("Значення y = " + y);
    }
}