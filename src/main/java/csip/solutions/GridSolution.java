package csip.solutions; 

public class GridSolution {

    
    private static boolean isMatch(char[] word, int rowIdx, int colIdx, int rowInc, int colInc, int place, int[][] grid) {
	if (place == word.length) {
	    return true; 
	}
	else if (rowIdx < 0 || rowIdx >= grid.length) {
	    return false; 
	}
	else if (colIdx < 0 || colIdx >= grid[0].length) {
	    return false; 
	}
	else if (word[place] != grid[rowIdx][colIdx]) {
	    return false; 
	}
	else {
	    return isMatch(word, rowIdx + rowInc, colIdx + colInc, rowInc, colInc, place + 1, grid);
	}

    }

    public static void findMatches(String word, char[][] grid) {
	char[] wordArr = word.toCharArray();

	for (int i = 0; i < grid.length; ++i) {
	    for (int j = 0; j < grid[0].length; ++j) {

		if (grid[i][j] == wordArr[0]) { // found the first letter, so check in all directions
		    boolean up = isMatch(wordArr, i - 1, j, -1, 0, 1, grid); 
		    boolean upRight = isMatch(wordArr, i - 1, j + 1, -1, 1, 1, grid); 
		    boolean right = isMatch(wordArr, i, j + 1, 0, 1, 1, grid); 
		    boolean downRight = isMatch(wordArr, i + 1, j + 1, 1, 1, 1, grid); 
		    boolean down = isMatch(wordArr, i + 1, j, 1, 0, 1, grid); 
		    boolean downLeft = isMatch(wordArr, i + 1, j - 1, 1, -1, 1, grid); 
		    boolean left = isMatch(wordArr, i, j - 1, 0, -1, 1, grid); 
		    boolean upLeft = isMatch(wordArr, i - 1, j - 1, -1, -1, 1, grid); 

		    if (up || upRight || right || downRight || down || downLeft || left || upLeft) {
			System.out.println("Pattern found at: (" + i + ", " + j + ")");  
		    }
		}

	    }

	}

    }
}