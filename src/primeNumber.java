
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,flag=0;
for(int i=2;i<=n/2;i++)
{

	if(n%i==0)
{
	System.out.println("Not a prime number");
	flag=1;
	break;
}
}

if(flag==0)
{

	System.out.println("its prime number");
}
}
	

}
