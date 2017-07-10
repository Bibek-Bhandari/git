import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.List;

public class KritiAndDragons{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    int kstrength=sc.nextInt();
		final int no_of_dragons=sc.nextInt();
     
        TreeMap<Integer,Integer>treemap=new TreeMap<>();

        int key=0,value=0;

        for(int i=0;i<no_of_dragons;i++){
            
            key=sc.nextInt();
            value=sc.nextInt();
            if(treemap.containsKey(key)){
            	value+=treemap.get(key);
            }
        	treemap.put(key,value);

        }

       
        int flag=0;
        for(Map.Entry num:treemap.entrySet()){

        	if((Integer)num.getKey()>=kstrength){
        		flag=1;
        		break;
        	}else{
        		
        		kstrength+=(Integer)num.getValue();
        	}
        }

        if(flag==0){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }

	}
}