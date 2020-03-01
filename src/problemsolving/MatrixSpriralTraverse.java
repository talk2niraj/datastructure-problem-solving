package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpriralTraverse {

	public static void main(String[] args) {
		int matrix[][] = new int[][] { { 1, 2, 3 }, 
									   { 4, 5, 6 }, 
									   { 7, 8, 9 } };
		
		System.out.println(traverseSpiralInMatrix(matrix));
	}

	private static List<Integer> traverseSpiralInMatrix(int[][] matrix) {
		
		if (matrix == null || matrix.length == 0) return null;
		
		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		
		int rowIndex = 0;
		int colIndex = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(rowLength > 0 && colLength > 0) {

			//no circle can be formed for last row/column 
			if (rowLength == 1) {
				for(int i=0; i<rowLength; i++) {
					list.add(matrix[rowIndex][colIndex++]);
				}
			} else if (colLength == 1){
				for(int i=0; i<colLength; i++) {
					list.add(matrix[rowIndex++][colIndex]);
				}
				break;
			}
			
			//move to the right (top)
            for(int i=0;i<colLength-1;i++){
            	list.add(matrix[rowIndex][colIndex++]);
            }
 
            //move to the down (right)
            for(int i=0;i<rowLength-1;i++){
            	list.add(matrix[rowIndex++][colIndex]);
            }
 
            //move to the left (bottom)
            for(int i=0;i<colLength-1;i++){
            	list.add(matrix[rowIndex][colIndex--]);
            }
 
            //move to the up (left)
            for(int i=0;i<rowLength-1;i++){
            	list.add(matrix[rowIndex--][colIndex]);
            }
            
            rowIndex++;
            colIndex++;
            rowLength=rowLength-2;
            colLength=colLength-2;
		}
		
		return list;
	}
}
