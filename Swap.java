public class Swap {

    public static void main (String[] args) {

        int temp, x, j;
        
        j = 0;
        x = 1;

        System.out.println("x value:" + x);
        System.out.println("j value:" + j);

        temp = j;
        j = x;
        x = temp;

        System.out.println("x value:" + x);
        System.out.println("j value:" + j);
    }
}