package ClassWork;

public class TypeCasting {

	public static void main(String[] args) {
		
		//TYPE CASTING OF DATA BETWEN INT AND LONG
		int i = 100;
		
		long l = i; //Implicit casting int to long datatype
		System.out.println("Long Value : " + l);
		
		int o = (int) l; //Explicit casting
		System.out.println("int value : " + o);
		
		char t=(char) i;
		System.out.println("int value : " + t);
		
		//TYPE CASTING BETWEEN DOUBLE AND FLOAT
		double d = 19453536734645.36473567456;
		float r = (float) d;
		System.out.println("float value : " + r);
		System.out.println("double value : " + d);
		
		//TYPE CASTING BETWEEN DOUBLE LONG INT
		double d2 = 19453536734645.364730000;
		long l2 = (long) d2;
		int i2 = (int) l2;
		System.out.println("double value : " + d2);
		System.out.println("long value : " + l2);
		System.out.println("int value : " + i2);
						
		//TYPE CAST BETWEEN LONG & FLOAT
		float f = l;
		System.out.println("float value : " + f);
		
		//TYPECAST BETWEEN BYTE, INT & DOUBLE
		byte b;
		int i3 = 257;
		double dd = 323.142;
		
		System.out.println("Conversion of int to byte");
		b = (byte) i3; 
		System.out.println("i3 = " + i3 + " and  b = " + b);
		
		System.out.println("Conversion of double to byte");
		b = (byte) dd;
		System.out.println("dd = " + dd + " and  b = " + b);
	}

}
