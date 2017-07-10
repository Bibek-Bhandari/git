
import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=4;i<=n;i++){
            if(n%i==0){
               flag=true;
               char[] m=String.valueOf(i).toCharArray();

               for(int y=0;y<m.length;y++){

                   if(m[y]!='4' && m[y]!='7'){
                    flag=false;
                    break;
                   }

               }
               if(flag==true){
                System.out.println("YES");
                return;
               }

            }

        }
        System.out.println("NO");
    }
} 