import java.util.Random;

public class RepetedValues {

	public static void main(String[] args) {
	     final int LENGTH = 20;
	     Random r = new Random();
	     int[] Array = new int[LENGTH];
	     for(int i=0;i<20;i++){
	    	 Array[i]=r.nextInt(6);
	     }
	     
	     /*for(int i=0;i<20;i++){
	    	 System.out.print(" ");
	    	 System.out.print(Array[i]);
	     }*/
	     int check=0;
	     for(int i=0;i<20;i++){
	    
	    	if(Array[i]==Array[i+1]){
	    		if(check==0){
	    		System.out.print("(");	
	    		check=1;
	    		}
	       }
	    	
	   	 System.out.print(" ");
    	 System.out.print(Array[i]);
    	 if(check==1){
	    	if(Array[i]!=Array[i+1]){
	    		System.out.print(")");
	    		 check=0 ;
	    	}
    	 }
    	       
	   }
	
	}

}
