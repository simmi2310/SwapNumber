package Testing;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Swathi12@345%";
String a="";
int len= s.length();
for(int i=len;i>0;i--) 
	 a=a+s.charAt(i-1);
	System.out.print(a); 
	System.out.println();

if(s.equals(a))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}

int n=1234567;
int reverse=0;
while(n!=0)
{
	int nw=n%10;
	reverse= reverse*10+nw;
	n=n/10;
}
System.out.println(reverse);
String w=s.replaceAll("[a-zA-Z0-9]", "");
System.out.println(w);

	
int[] arr= new int[] {1,1,2,3,4,4,5,6,7,5};
int[] b= {};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			b[i]=arr[j];
			System.out.println(b[i]);			
		}		
			
			
		}
	}
}
}
