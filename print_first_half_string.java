//221810402056
public class print_first_half_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Gitam Hyderabad";
		if(s1.contains(" ")) {
			String s2 = s1.substring(0,s1.indexOf(" "));
			System.out.println(s2);
		}
		
		
	}
}
