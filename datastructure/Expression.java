import java.util.Scanner;

public class Expression{
    
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int total=0,min;
        
        if(a==1&&b==1&&c==1 || a==1 && c==1){
			total=a+b+c;
		}else if(a==1||b==1||c==1){
			if(a==1) total=(a+b)*c;
			else if(b==1){
				min=Integer.min(a,c);
				if(a!=min){
					total=a*(b+c);
				}else{
					total=(a+b)*c;
				}
			}else if(c==1){
				total=a*(b+c);
			}
		
		}else{
			total=a*b*c;
		}
        System.out.println(total);

	}
}