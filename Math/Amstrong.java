import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = String.valueOf(num).length();

		int ans = 0,last = 0;
		int temp = num;

		while(temp>0){
			last = temp % 10;
			ans = ans + (int)(Math.pow(last, count));
			temp = temp/10;
		}
		System.out.println(ans == num ? true : false);
		
	}
}
