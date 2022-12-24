package datatype;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class DataType {
	/*
	 * #### Data Type ####
	 * 
	 * 1> proper data representation
	 * 2> proper memory allocation
	 * 3> proper operation to be performed
	 * 
	 * # Types:
	 * 
	 * 1> primitive
	 * 		a> byte		~ 23,50,44,77,12
	 * 		b> short	~ 562, 2434, 4567, 24433
	 * 		c> int		~ 123456, 767893, 6736833
	 * 		d> long		~ 18327412352397, 74365973472098
	 * 		e> float	~ 1.2, 3.5, 1223.3435	
	 * 		f> double	~ 7834782764.7623453572, 63576874534534.3453463434
	 * 		g> char		~ 'M', '@'
	 * 		h> boolean	~ true/false
	 * 
	 * 2> non-primitve
	 * 		a> String	= Ram, Hari, Kathmandu, ghj234, admin@gmail.com
	 * 		b> Array
	 * 		c> Classes
	 */

		/* Example:
		long x = 5000000000000000L; (L to be used in long)
		float k = 1.5f; (f to be used in float)
		 */
	
	
	public static void main(String[] args) {
		
		
		System.out.println("byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		System.out.println("int = "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("long = "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
		System.out.println("float = "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		System.out.println("double = "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
		System.out.println("character = "+Character.SIZE+" "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
		
		
		
	
	}	
}
