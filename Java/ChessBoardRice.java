
public class ChessBoardRice {
	public static void main(String[] args)
	{	
		//Array with test values
		int [] [] arr = {{2, 2, 4, 2,}, {0, 3, 0, 1}, {1, 2, 2, 1},  {4, 1, 2, 2}};

		System.out.println(solution(arr));

	}

	public static int solution(int[][]A){

		int maxValue = 0; //holds the max value

		//iterate through the Array
		for (int i = 0; i <A.length; i++){

			for (int j = 0; j<A[i].length; j++)
			{
				//we check to see both the i and j are greater than 0
				//then we proceeds to finds the max value
				if (i > 0 && j > 0){
					A[i][j] += Math.max(A[i - 1][j], A[i][j - 1]);
				}
				else if (i == 0 && j > 0)
				{
					A[i][j] += A[i][j - 1];

				}else if ( j == 0 && i > 0){

					A[i][j] += A[i - 1][j];
				}

				maxValue = A[i][j];
			}
		}


		return maxValue;

	}

}
