
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {23,12,14,100,56,53,98,12};
int v=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]>v)
	{
		v=a[i];
	}
}
System.out.println(v);
	}

}
