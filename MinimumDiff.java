import java.util.*;

public class MinimumDiff{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}
        ArrayList<Integer> result=new ArrayList<>();
		for(int i=1;i<n-1;i++){
            result.add(findmaxDiff(arr,i));
		}
		Collections.sort(result);
		System.out.println(result.get(0));


	}

	public static int findmaxDiff(ArrayList<Integer> arr,int index){
		ArrayList<Integer> temp=(ArrayList<Integer>)arr.clone();
		temp.remove(index);
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<temp.size()-1;i++){
            if(max<(temp.get(i+1)-temp.get(i))){
            	max=temp.get(i+1)-temp.get(i);
            }
		}
		return max;
	}
}