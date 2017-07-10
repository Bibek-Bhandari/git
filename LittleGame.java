import java.util.Scanner;
import java.util.StringTokenizer;


public class LittleGame{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
      
		int input=sc.nextInt();
		  boolean[] arr=new boolean[input+1];
        int i=0;
        String s="";
        int x;
        for( i=0;i<2;i++){
           x=sc.nextInt();
           for(int j=0;j<x;j++){
           	s+=sc.nextInt()+" ";
           }
        }

       int temp=0;
       
        StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()){
              temp=Integer.valueOf(st.nextToken());
             if(temp<=input){
                arr[temp]=true;
             }
		}
        int flag=0;
		for(i=1;i<=input;i++){
			if(arr[i]!=true){
                flag=1;
			}
		}

		if(flag==0){
			System.out.println("I become the guy.");
		}else{
			System.out.println("Oh, my keyboard!");
		}
	}
}