
public class Percolation {
	
	private int[][] ar;
	//constructor: create n-by-n grid, with all sites blocked
	public Percolation(int n) {
		int[][] ar = new int[n][n];
		for (int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				ar[row][col]=0;
			}
		}
	}                 
	
	// open site (row, col) if it is not open already
	public void open(int row, int col) {
		if(ar[row][col]==0) {
			ar[row][col]=1;
		}
	}   
	
	// is site (row, col) open?
	public boolean isOpen(int row, int col)  {
		if(ar[row][col]==1) {
			return true;
		}
		return false;
	}
	
	//A full site is an open site that can be connected to an open site in the top row 
	//via a chain of neighboring (left, right, up, down) open sites. 
	// is site (row, col) full?
	public boolean isFull(int row, int col) {  
	}
	
	
	// number of open sites
	public int numberOfOpenSites() {
		int openSites=0;
		for(int row=0;row<ar[0].length;row++) {
			for(int col=0;col<ar[1].length;col++) {
				if(ar[row][col]==1) {
					openSites+=1;
				}
			}
		}
		return openSites;
	}      
	
	//We say the system percolates if there is a full site in the bottom row.
	// does the system percolate?
	public boolean percolates() {
		
	}              

	public static void main(String[] args) {
		
	}
}
