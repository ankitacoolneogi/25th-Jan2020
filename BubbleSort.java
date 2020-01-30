import java.util.Scanner;

class BubbleSort{
	public static void main(String[] args) {
		int []list = new int[5];
		Scanner sc = new Scanner(System.in);
		int i,temp;
		System.out.print("Enter the list items ::  \n");
		for (i=0 ; i<5 ; i++) {
			System.out.print("Item: " + (i+1) + "::");
			list[i] = sc.nextInt();
		}
		for(i=0 ; i<5 ; i++){
			for(int j=i+1 ; j<5 ; j++)
				if( list[i] > list[j] ){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
		}
		System.out.println("The sorted list is: ");
		for (i=0 ; i<5 ; i++ ) {
			System.out.print(list[i] + "  ");
			
		}
	}
}