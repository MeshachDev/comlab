
// ex:9
import java.util.*;

public class fascinating_number {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT:\n\tm = ");
        int m = in.nextInt();
        System.out.print("\tn = ");
        int n = in.nextInt();
        number(m,n);
    }

    void number(int M, int N) {
        int count = 0;
        String sum = "";
        System.out.println("THE FASCINATING NUMBERS ARE :");
        for (int i = M; i <= N; i++) {
            for (int j = 1; j <= 3; j++) {
                sum += i * j;
            }
            if (num_check(Integer.parseInt(sum))) {
                count++;
                System.out.print(i);
            }
        }
        System.out.println("OUTPUT: THE FREQUENCY OF FASCINATING NUMBERS IS: "+count);
        
    }

    boolean num_check(double n) {
        String s = String.valueOf(n);
        boolean state = false;
        boolean is[] = { false, false, false, false, false, false, false, false, false };
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= 9; j++) {
                if (s.charAt(i) == j) {
                    is[s.indexOf(s.charAt(i))] = true;
                }
                for (boolean b : is) {
                    if (b != true) {
                        state = false;
                    } else {
                        state = true;
                    }
                }
            }
        }
        return state;
    }

    public static void main(String[] args) {
        fascinating_number obj9 = new fascinating_number();
        obj9.input();
    }
}
