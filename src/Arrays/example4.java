package Arrays;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] a= {65,66,67,68,69};
		String str=null;
		for(i=0;i<a.length;i++)
		{
			str=Character.toString((char)a[i]);
			System.out.print(str+" ");
		}
	}
}
