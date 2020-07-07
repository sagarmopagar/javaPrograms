package July.Shubham;

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 

public class Triangle1 {
	public static void main(String[] args) {

		int n = 5;
		for(int row=0; row<n; row++) {
			for(int col=0; row>=col ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

// for(int col=0; col<n; col++)
// if(row >= col)
