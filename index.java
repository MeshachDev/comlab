public class index {

    static int reverse(int a) {
        int r = 0;
        while (a != 0) {
            int re = a % 10;
            r = r * 10 + re;
            a = a / 10;
        }
        return r;
    }

    public static void main(String[] args) {
      
       System.out.println( reverse(23));
    }
}
