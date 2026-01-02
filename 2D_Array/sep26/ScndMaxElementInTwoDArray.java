package sep26;

public class ScndMaxElementInTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 3, 4 }, { 5, 8, 9 }, { 9, 1, 7 } };

		int maxEle = Integer.MIN_VALUE;
		int scndMaxEle = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxEle) {
					scndMaxEle = maxEle;
					maxEle = a[i][j];
				}
				if (a[i][j] > scndMaxEle && a[i][j] != maxEle) {
					scndMaxEle = a[i][j];
				}
			}
		}
		System.out.println(scndMaxEle);
	}

}
