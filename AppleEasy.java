import java.util.Scanner;

public class AppleEasy{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] a=new char[n][n];
        String s=new String();
        sc.nextLine();
		for(int i=0;i<n;i++){
             s=sc.nextLine();
			for(int j=0;j<n;j++){
                a[i][j]=s.charAt(j);
			}
		}

        int count=0;
        for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
               
               if(i>0 && a[i-1][j]=='o'){
                   count++;    
                }

               	if(i<n-1 && a[i+1][j]=='o'){
                    count++;
                 
               	}
               	
               	if(j>0 && a[i][j-1]=='o'){
                   count++;
                
               	}
          
               	if(j<n-1 && a[i][j+1]=='o'){
                   count++;
                
               }

               if(count%2!=0){
               	  System.out.println("NO");
               	  return;
               }

			}

		}
		if(count%2==0){
			System.out.println("YES");
		}

	}
}