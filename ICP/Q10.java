import java.util.*;
public class Q10 {
	public static int GCD(int m, int n) { if (m < n) {
		return (GCD(n, m));
		}
		if (m % n == 0) {
		return (n);
		}
		return (GCD(n, m % n));
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int gcd = GCD(m,n);
		System.out.println(gcd);
	}

}
