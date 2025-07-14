package dsa.backtracking;

/**
 * TC: O(3 ^n*m)
 * SC: O(n*2) 
 */
public class RatInMaze {

	public static void main(String[] args) {
		
		int mat[][] = {
				{1, 1, 1, 0},
				{1, 0, 0, 1},
				{1, 1, 0, 0},
				{1, 1, 1, 1}
		};
		
		int n = mat.length;  //4 (rows)
		int m = mat[0].length;  //4, mat[0]= it will go in 1st matrix i.e {1, 1, 1, 0}, and find length(column)
		
		boolean vis[][] = new boolean[n][m];   //visited where we can not go again
		vis[0][0] = true;
		
		int i = 0;
		int j = 0;
		ratInMaze(mat, vis, i, j, "", n, m); 
	}
	
	//to check if place is valid to visit or not
	static boolean isValid(int i, int j, int mat[][], boolean vis[][], int n, int m) { 
		if(i < n && i >=0 && j < m && j >= 0 && mat[i][j] == 1 && vis[i][j] == false) {
			return true; 
		}
		return false; 
	}
	
	//Directions: DLRU
	
	//to print element
	static void ratInMaze(int mat[][], boolean vis[][], int i, int j, String path, int n, int m) {
		
		//base case, means if we have arrived at bottom right corner, if yes then print answer
		if(i == n-1 && j == m-1) {  //n-1 coz index no i and j will start from 0. Bottom right corner reached	
			System.out.println(path);
			return;
		} 
		
		//if Down is valid
		if(isValid(i+1, j, mat, vis, n, m)){
//			path = path+ 'D';
			vis[i+1][j] = true;
			ratInMaze(mat, vis, i+1, j, path+'D', n, m);
//			path = path.substring(0, path.length() -1);    //backtracking
			vis[i+1][j] = false;       //backtracking
		}
		
		//if Left is valid
		if(isValid(i, j-1, mat, vis, n, m)) {
			vis[i][j-1] = true;
			ratInMaze(mat, vis, i, j-1, path+'L', n, m); 
			vis[i][j-1] = false;           //backtracking
		}
		
		//if Right is valid
		if(isValid(i, j+1, mat, vis, n, m)) {
			vis[i][j+1] = true;
			ratInMaze(mat, vis, i, j+1, path+'R', n, m);
			vis[i][j+1] = false;
		}
		
		//if UP is valid
				if(isValid(i-1, j, mat, vis, n, m)) {
					vis[i-1][j] = true;
					ratInMaze(mat, vis, i-1, j, path+'U', n, m);
					vis[i-1][j] = false;
				}
	}
	
}












