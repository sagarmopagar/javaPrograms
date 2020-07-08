package July.Shubham;

public class Pyramid {
	public static void main(String[] args) {

		int n = 10;
		for(int row=0; row<n; row++) {  // Deciding number of rows
			for(int space=0; space<(n-1-row); space++) { // Deciding for number space to be given before printing Star
				System.out.print("  ");
			}
			for(int star=0; star<=(2*row); star++) { // Deciding for number Stars
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
