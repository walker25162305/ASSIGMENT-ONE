//Class declaration//
public class MultiplesDisplay{
	 public static void main(String[] args) {
	 	//Variable declaration//
	 	int lowerRanger = 71;
	 	int upperRanger = 150;

	 	System.out.println("Multiples of 2,3, and 7 with int the range"+lowerRanger+"to"+upperRanger+"are:");
	 	//function that lists the multiples of 2, 3, and 7 in the lower and upper range//
	 	for(int i=lowerRanger;i<=upperRanger;i++){
	 		if (i%2==0|| i%3 ==0||i%7==0){
	 			System.out.println(i);
	 		}
	 	}
		
	}
}