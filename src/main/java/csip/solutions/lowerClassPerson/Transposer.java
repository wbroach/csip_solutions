package csip.solutions.freshperson; 

public class Transposer {

    public static int[][] transpose(int[][] matrix) {
	int rows = matrix.length;
	int cols = matrix[0].length;

	int[][] ret = new int[cols][rows];

	for (int i = 0; i < cols; ++i) {

	    for (int j = 0; j < rows; ++j) {
		
		ret[i][j] = matrix[j][i];

	    }

	}

	return ret; 
    }

}