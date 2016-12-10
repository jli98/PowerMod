
public class PowerMod {
public static int PowerMod(int a, int b, int n){
	  int ans = 1;
	  a = a % n;
	  while (b > 0){
	    if (b % 2 == 1)
	      ans = ans * a % n;
	    ans = a * a % n;
	    b = b / 2;
}
	  return ans;
}
public static void main(String[] args) {
	System.out.println((int)PowerMod(2,5,8));
}
}