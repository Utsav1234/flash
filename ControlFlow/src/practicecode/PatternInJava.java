package practicecode;

public class PatternInJava {
public static void main(String[] args) {
		/*
         ****
         ****
         ****
         ****	  
	  */
	int k=1;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
			
			System.out.print(i+j-1+"   ");
		
		}
       System.out.println();
	}
	/*
	*
	**
	***
	****
	*/
	System.out.println();
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
       System.out.println();
	}
	System.out.println();
	/*

         ****
         *  *
         *  *
         ****
	*/

	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			if(i==1||i==4||j==1||j==4)
			System.out.print("*");
			else 
				System.out.println("");
			
			
		}
		System.out.println();
		
       
	}
	
	
}
}
