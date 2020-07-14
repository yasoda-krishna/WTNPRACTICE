package WrapperClass;

public class WrapperConvert {

	public static void main(String[] args) {
		short s1=10;
		Short s2=new Short(s1);
		String s8=s2.toString();
		byte b1=s2.byteValue();
		short s3=s2.shortValue();
		int il=s2.intValue();
		long l1=s2.longValue();
		float f1=s2.floatValue();
		double d1=s2.doubleValue();
		double d5=2.54;
		Double d6=new Double(d5);
		int i4 =d6.intValue();
		System.out.println(s8);

	}

}
