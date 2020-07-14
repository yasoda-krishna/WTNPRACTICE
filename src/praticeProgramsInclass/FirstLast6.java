package praticeProgramsInclass;

public class FirstLast6 {
	
	static boolean firstLast(int a[])
	{
		if(a[a.length-1]==6 || a[0]==6)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a= {6,2,1};
		int[] b= {1,2,6};
		int[] c= {13,6,1,2,3};
		System.out.println(firstLast(a));
		System.out.println(firstLast(b));
		System.out.println(firstLast(c));
	}

}

