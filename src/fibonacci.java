
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0, b=1;
System.out.println(a);
for(int i=2;i<10;i++)
{
	int c=a+b;
	System.out.println(c);
	b=a;
	a=c;
}
	}

}
