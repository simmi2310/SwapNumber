
public class strindt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 100136;
		int reverse=0;
		int digit,temp;
		temp =number;
		while(number!=0)
		{
		 digit =number%10;
		reverse=reverse*10+digit;
		//System.out.println(reverse);
		number=number/10;

		}
if(temp==reverse) {
	System.out.println("palindrome");
}
else
{
	System.out.println(" not palindrome");	
}

}
}
