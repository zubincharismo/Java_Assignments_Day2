
public class replace_occurence_of_odd_witheven_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PROGRAM --> EVEN TO ODD
		
		String s56 = "Welcome";
		char[] kkk = s56.toCharArray();
		int xy = s56.length();
		for(int i=1; i<xy;i++) {
			if(i%2==0) {
				if(i=xy-1 and i=xy-2){
					continue;
				}
				kkk[i] = s56.charAt(i+1);
			}				
		}
		for(int lam=1;i<xy;i++) {
			if(lam%2==1) {
				if(lam=xy-1 and lam=xy-2){
					continue;
				}
				kkk[i]=s56.charAt(i+1);
			}
		}
		System.out.println(kkk);
		

	}

}
