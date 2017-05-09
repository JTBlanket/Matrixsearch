
public class MatrixSearch {
	private int[][] mat;
	public int odd;
	public int even;
	/*
	 * pre - mat is null
	 * post - mat will be rows X cols
	 * post - mat will contain integers that are >=1 and <= upper
	 */
	
	
	public MatrixSearch (int rows, int cols, int upper){
		mat = new int [rows][cols];
		for(int r = 0; r<rows; r++ ){
			for(int c = 0; c<cols-1; c++){
				mat[r][c] = (int)(Math.random()*upper+1);
				System.out.println( mat[r][c] +" Prime number? " + isPrime(mat[r][c]));
				
			}//end of cols
			
		}// end of rows
	
	}
	
	
	
	public int countOdds(){
		odd=0;
		for(int i = 0; i< mat.length; i++){
			for (int j = 0; j<mat[i].length; j++){
				if(mat[i][j]%2==1)
					odd++;
			}
		}
		return odd;
	}
	
	
	
	public int countEvens(){
		even =0;
		for (int i =0; i < mat.length; i++){
			for(int j=0; j<mat[i].length;j++){
				if(mat[i][j]%2==0)
					even++;
			}
		}
		return even;
	}
	
	
	
	private boolean isPrime(int num){
		  int i;
		  for (i = 2; i <= num / 2; i++) {
		        if (num % i == 0) {
		            return false;
		        }
		    }
		    return true;
		}
	
	
	public String toString(){
		return "";
	}
}
