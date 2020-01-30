import java.util.Scanner;

class SelectionSort{
	public static void main(String[] args) {
		int []list = new int[5];
		Scanner sc = new Scanner(System.in);
		int i,min, index;
		System.out.print("Enter the list items ::  \n");
		for (i=0 ; i<5 ; i++) {
			System.out.print("Item: " + (i+1) + "::");
			list[i] = sc.nextInt();
		}
		for(i=0 ; i<5 ; i++){
			min = list[i];
			index = i;
			for(int j=i+1 ; j<5 ; j++){
				if( list[j] < min ){
					min = list[j];
					index = j;
				}
		}
			list[index] = list[i];
			list[i] = min;
		}
		System.out.println("The sorted list is: ");
		for (i=0 ; i<5 ; i++ ) {
			System.out.print(list[i] + "  ");
			
		}
	}
}