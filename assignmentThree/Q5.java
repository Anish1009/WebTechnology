import java.util.*;

public class Q5{
	static int dp[][];


	static void printChanges(String s1, String s2)
	{
		int i = s1.length();
		int j = s2.length();

	
		while (i != 0 && j != 0) {

	
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				i--;
				j--;
			}

		
			else if (dp[i][j] == dp[i - 1][j - 1] + 1) {
				System.out.println("change " + s1.charAt(i - 1) + " to " + s2.charAt(j - 1));
				i--;
				j--;
			}

	
			else if (dp[i][j] == dp[i - 1][j] + 1) {
				System.out.println("Delete " + s1.charAt(i - 1));
				i--;
			}


			else if (dp[i][j] == dp[i][j - 1] + 1) {
				System.out.println("Add " + s2.charAt(j - 1));
				j--;
			}
		}
	}

	static void editDP(String s1, String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		int[][] DP = new int[l1 + 1][l2 + 1];


		for (int i = 0; i <= l1; i++)
			DP[i][0] = i;
		for (int j = 0; j <= l2; j++)
			DP[0][j] = j;


		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {

			
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					DP[i][j] = DP[i - 1][j - 1];
				else {

					DP[i][j] = min(DP[i - 1][j - 1],
								DP[i - 1][j], DP[i][j - 1])
							+ 1;
				}
			}
		}

		dp = DP;
	}


	static int min(int a, int b, int c)
	{
		int z = Math.min(a, b);
		return Math.min(z, c);
	}


	public static void main(String[] args) throws Exception
	{
		String s1 = "abcdef";
		String s2 = "axcdfdh";


		editDP(s1, s2);


		printChanges(s1, s2);
	}
}
