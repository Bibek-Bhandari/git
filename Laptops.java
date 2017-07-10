
import java.util.*;


public class Laptops{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	   Map<Integer,Integer> laps=new TreeMap<>();

	   int input=sc.nextInt();

	   for(int i=0;i<input;i++){
	   	 laps.put(sc.nextInt(),sc.nextInt());
	   }
     
    
      int i=0;
      Integer pre=null,temp=null;
	  for(Map.Entry m:laps.entrySet()){
		
		  if(i==0){
			   pre=(Integer)m.getValue();
			   i++;
			   continue;
		  }
		  temp=(Integer)m.getValue();
		  if(pre>temp){
			  System.out.println("Happy Alex");
			  return;
		  }
		  pre=temp;
		
	  }
       
           System.out.println("Poor Alex");
      

	}
}