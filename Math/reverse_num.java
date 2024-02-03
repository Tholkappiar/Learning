public class Solution {
	public static long reverseBits(long n) {

		String rev = Long.toBinaryString(n);

		rev = String.format("%32s", rev).replaceAll(" ", "0");

		StringBuilder sb = new StringBuilder(rev);
		String reversed = sb.reverse().toString();

		long ans = Long.parseLong(reversed,2);
		return ans;
	}
}
