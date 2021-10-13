// 221810402056
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waaw";
		String s2 = "Hello";
		StringBuffer abc = new StringBuffer(s1);
		StringBuffer def = new StringBuffer(s2);;
		abc.reverse();
		def.reverse();
		String data1 = abc.toString();
		String data2 = def.toString();
		System.out.println(s1.equals(data1));
		System.out.println(s2.equals(data2));
	}

}
