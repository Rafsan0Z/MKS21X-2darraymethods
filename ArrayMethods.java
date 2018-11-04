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
		int sum = 0;
		for(int i = 0; i < ary.length; i++) {
			if(ary[i].length >= x) {
				sum += ary[i][x];
			}
		}
		return sum;
	}

	public static int[] allRowSums(int[][] ary) {
		int[] result = new int[ary.length];
		for(int i = 0; i < ary.length; i++) {
			result[i] = rowSum(ary,i);
		}
		return result;
	}

	public static int[] allColSums(int[][] ary) {
		int maxcol = 0;
		for(int i = 0; i < ary.length; i++) {
			if(ary[i].length > maxcol) {
				maxcol = ary[i].length;
			}
		}
		int[] result = new int[maxcol];
		for(int i = maxcol - 1; i >= 0; i--) {
			result[i] = columnSum(ary,i);
		}
		return result;
	}

	public static boolean isRowMagic(int[][] ary) {
		for(int i = 0; i < ary.length - 1; i++) {
			if(rowSum(ary,i) == rowSum(ary,i+1)) {return false;}
		}
		return true;
	}

	public static boolean isColMagic(int[][] ary) {
		int[] database = allColSums(ary);
		for(int i = 0; i < database.length - 1; i++) {
			if(database[i] != database[i+1]) {return false;}
		}
		return true;
	}
}
