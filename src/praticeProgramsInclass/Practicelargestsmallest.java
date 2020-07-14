package praticeProgramsInclass;

public class Practicelargestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList= {1,5,3,4,5,5};
		int max=myList[0];
		int ind=0;
		for(int i=0;i<myList.length;i++)
		{
			if(max<myList[i])
			{
				max=myList[i];
				ind=i;
			}
		}
		System.out.println("The largest element is "+max+" and the smallest index for "+max+" is "+ind);
	}

}
