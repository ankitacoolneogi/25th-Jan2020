import java.util.Scanner;

class TestArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[10];
		int item;
		System.out.print("Enter 10 nos. : \n");
		for (int i=0 ; i<10 ; i++ ) {
			arr[i] = sc.nextInt();
			}	
		System.out.println("Enter no to search: ");
		item = sc.nextInt();
		for (int i=0 ; i<10 ; i++ ) {
			if(arr[i] == item){
				System.out.print("Match found!! \n Position: " + i);
				return;
			}
		}
		System.out.print("No match found!!");
	}
}