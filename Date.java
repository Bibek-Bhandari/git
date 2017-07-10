import java.util.Scanner;

public class Date{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int x1,y1,x2,y2,x3,y3,x4,y4;
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
        int temp,max;
        max=Integer.max(Integer.max(Integer.max(x1,x2),y1),y2);
        if(max<-100 || max>100){
        	System.out.println("-1");
        	return;

        }
        if(Math.abs(x1-x2)==Math.abs(y1-y2)){
               x3=x1;
               y3=y2;
               x4=x2;
               y4=y1;
               
        }else if(x1==x2){
        	   temp=Math.abs(y2-y1);
        	   if(x1<=0){
                 x3=x1+temp;
        	   }else{
        	   	 x3=x1-temp;
        	   }
        	    x4=x3;
        	    y3=y1;
        	    y4=y2;
        }else if(y1==y2){
        	   temp=Math.abs(x2-x1);
        	   if(y1<=0){
                 y3=y1+temp;
        	   }else{
        	   	 y3=y1-temp;
        	   }
        	    x3=x1;
        	    x4=x2;
        	    y4=y3;
      
        }else{
        	System.out.println("-1");
        	return;
        }
        
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
	}
}