package id.haisaori.firststep;

public class LearnDataType {
	/*
	 * mengenal datatype pada java khusus angka
	 * 8 primitive data
	 *  4 primitive data type untuk menyimpan angka- wrapper classnya depannya huruf kapital
	 * wrapper class
	 * using numeric literal character suffix. java default literal whole number as int, gunakan kapital dibandingkan huruf kecil sebagai suffux 
	 */
	public static void main(String[] args) {
		System.out.println("Byte value range (" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + ")");
		System.out.println("Short value range (" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + ")");
		System.out.println("Integer value range (" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + ")");
		
		long myLongValue = 100L;
		System.out.println("A long has a width of " + Long.SIZE);
		System.out.println("Long value range (" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + ")");
		myLongValue = 100;
		myLongValue = 2_147_483_647;
		//myLongValue = 2_147_483_647_222; //error overflow :  type int is out of range
		myLongValue = 2_147_483_647_222L; 
		
		//short bigShortLiteralValue = 32768; //error Type mismatch: cannot convert from int to short
		
		
		short myMinShortValue = Short.MIN_VALUE;  int myMinIntValue = Integer.MAX_VALUE;
		byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE; //ini bisa karena tipe datanya sama
		/*
		 * java compiler doesn't attempt to evaluate the value, in a varible, when it
		 * di operasikan sebagai int
		 */
		//byte myNewByteValue = (myMinByteValue / 2); // ini error 	Type mismatch: cannot convert from int to byte 
		byte myNewByteValue = (byte)(myMinByteValue / 2);
		myNewByteValue = (-128/ 2);
		/*
		 * ROOT CAUSE karena (myMinShortValue / 2) dianggap sebagai int
		 */
		short myNewShortValue = (short) (myMinShortValue / 2);
		
	}
}
