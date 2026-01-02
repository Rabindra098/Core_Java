package sep26;

public class ScndMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 3, 4 }, { 5, 8, 9 }, { 9, 1, 7 } };

		int minEle = Integer.MAX_VALUE;
		int scndMinEle = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < minEle) {
					scndMinEle = minEle;
					minEle = a[i][j];
				}
				if (a[i][j] < scndMinEle && a[i][j] != minEle) {
					scndMinEle = a[i][j];
				}
			}
		}
		System.out.println(scndMinEle);
	}

}
