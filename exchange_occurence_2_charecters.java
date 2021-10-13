//221810402056
import java.util.*;
public class exchange_occurence_2_charecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pop = "Sidemen";
		char[] opp = pop.toCharArray();
		int x = opp[0];//assigning 1st charecter to x
		int y = opp[1];//assigning 2nd charecter to y 
		opp[0]=opp[2];//replacing 1st charecter with 3rd 
		opp[1]=opp[3];//replacing 2nd charecter with 4th
		opp[2]=(char)x; // assigning 3rd charecter to 1st via type conversion
		opp[3]=(char)y; //// assigning 4th charecter to 2nd via type conversion
		System.out.println(opp);
		

	}

}
