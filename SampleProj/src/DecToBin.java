
public class DecToBin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		int rem=0;
		
		
		int num = 10;
		
		while(num > 0){
			
			rem = num%2;
			num = num /2;
			
			
			
			res +=rem;
			
		}
		
		System.out.println(res);
		
	}


}
