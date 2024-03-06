package work;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner2 = new Scanner(System.in);
		int score=0;
		int number;
        String input;
        int x=0;
		 do {
	            
		Random random=new Random();
		 int randomNumber = random.nextInt(100) + 1;
		
		do {  System.out.print("Enter a number between 1 and 100: ");
		  Scanner scanner = new Scanner(System.in);
		   number = scanner.nextInt();
		}while(number<1 || number>100);
		 
      if(number==randomNumber) {
    	  System.out.println("you won from the first try");
    	  score=score+10;
    	  
      }
      else {
    	  int i;
		  for( i=1;i<=3;i++) {
			  if(number>randomNumber) {
				  System.out.println("your number is high, try a lower number");
			  }
			  else
				  if(number<randomNumber)
					  System.out.println("your number is low, try a higher number");
			  number = scanner2.nextInt();
			 if(number==randomNumber) {
				  System.out.println("you won");
				  break;
			  }
			 
				  
		  }
		  if(i==1)
			  score+=8;
		  else if(i==2)
			  score+=6;
		  else if(i==3) 
			  score+=4;
		  else
			  System.out.println("you lost , the number was:"+randomNumber);
      }
        
      System.out.println("your current score is "+score);
      x++;
		  
		 } while ( x<3  ); 
		 System.out.println("your final score is "+score);
		 }
	

}
