//221810402056
public class replace_occurence_of_odd_witheven_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PROGRAM --> EVEN TO ODD
		
		String s56 = "Welcome";
		System.out.println("The Original String is:"+s56);
		char[] kkk = s56.toCharArray();
		int xy = s56.length();
		for(int i=1; i<xy-1;i++) {
			if(i%2==0) {
				
				kkk[i] = s56.charAt(i+1);
			}				
		}
		
		System.out.println("even to odd conerted string is :");
		System.out.println(kkk);
		for(int lam=1;lam<xy-1;lam++) {
			if(lam%2==1) {
				
				kkk[lam]=s56.charAt(lam+1);
			}
		}
		System.out.println("odd to even converted string is  : ");
		
		System.out.println(kkk);
		

	}

}
//for(int lam=1;lam<xy-1;lam++) {
//if(lam%2==1) {
	
	//kkk[lam]=s56.charAt(lam+1);
//}
//}