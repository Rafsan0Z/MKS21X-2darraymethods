public class ArrayMethods{

	public static int rowSum(int[][] ary, int x) {
		int size = ary[x].length;
		int sum = 0;
		for(int i = 0; i < size; i++) {
			sum += ary[x][i];
		}
		return sum;
	}

	public static int columnSum(int[][] ary, int x) {
		int index = x -1;
		int sum = 0;
		for(int i = 0; i < ary.length; i++) {
			if(ary.length <= index) {
				sum += ary[i][x];
			}
		}
		return sum;
	}
}
