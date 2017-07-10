import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

 interface canSwim{}

 class Amphibian implements canSwim{}

class Tadpole extends Amphibian{}

public class FindAllTadpole{

	public static void main(String[] args){
		List<Tadpole> tadpoles=new ArrayList<Tadpole>();

		for(Amphibian amphibian:tadpoles){
			Amphibian Tadpole=amphibian;
		}
	}
}