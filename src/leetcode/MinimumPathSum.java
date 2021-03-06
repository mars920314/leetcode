package leetcode;
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
import  java.lang.Math;
public class MinimumPathSum {
	public int minPathSum(int[][] grid){
		int m=grid.length;
		int n=grid[0].length;
		int[][] dp=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				if(i==0 && j==0)
					dp[i][j]=grid[0][0];
				else if(i==0 && j!=0)
					dp[i][j]=dp[i][j-1]+grid[i][j];
				else if(j==0 && i!=0)
					dp[i][j]=dp[i-1][j]+grid[i][j];
				else
					dp[i][j]=Math.min(dp[i][j-1], dp[i-1][j])+grid[i][j];
			}
		return dp[m-1][n-1];
	}

}
