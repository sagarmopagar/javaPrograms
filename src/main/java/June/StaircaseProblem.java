package June;

public class StaircaseProblem {

	public static void main(String[] args) {
		int n = 4;
		

		int[] options = { 1, 2 };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (options[i] + options[j] == 4) {
					System.out.println("This combination is valid: " + options[i] + '-' + options[j]);
				} else if (options[i] + options[j] < 4) {
					for (int k = 0; k < 2; k++) {
						if (options[i] + options[j] + options[k] == 4) {
							System.out.println(
									"This combination is valid: " + options[i] + '-' + options[j] + '-' + options[k]);
						}
					}
				}
			}
		}
	}

public static void calc(int[] arr, int total, int midTotal) {
int min = arr[0];
for(int i=1;i<arr.length;i++) {
	if(arr[i]<min) {
		min = arr[i];
	}
}

System.out.println("Minimum element is: "+min);
int times = total / min;
String path;
int mid = 0;
do {

for(int i=0;i<total;i++) {
	if(mid+arr[i] == total) {
		path = Integer.toString(arr[i])+'-';
	}
}
	min++;
} while (min == total);
//	
//for(int i=0; i< arr.length;i++) {
//if(arr[i] == total) {
//	System.out.println("Valid combination: "+arr[i]);
//}
//else{
//	
//}
}

}
