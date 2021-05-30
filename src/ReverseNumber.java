
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number= 12345987;
int reverse=0;
while(number!=0)
{
int digit =number%10;//8
reverse=reverse*10+digit;//78
//System.out.println(reverse);
number=number/10;//1234598

}
System.out.println(reverse);
	}

}

