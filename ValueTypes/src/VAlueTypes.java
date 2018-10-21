//import static java.lang.System.out;


public class VAlueTypes {


	public static void main(String[] args) {
		int a = 1000;//4 bytes
		short sh = 20;//2 bytes
		byte bt = 127;
		char c = 'A';//2 bytes
		long lg = 12344L;//8 bytes
		lg = a;
		int a2 = (int)lg;
		System.out.println(a2);
		 
		double d1 = 2.5;//8 byte
		float f = 1.5f;//4 byte
		
		
		int x = 5;
		double y = x / 2;
		System.out.println(y);
		
		byte b1 = Byte.MAX_VALUE;
		
		long lg1 = (b1 + 1) + 10L;
		System.out.println(lg1);
		
		char ch = 'A';//utf-16
		
		
		boolean tr = true;
		boolean fl = false;
		
		boolean res = tr && fl;//and
		res = tr || fl;//or
		res = !tr;//not
		
		System.out.println(res);
		
		
		res = (1 > 0) && (5 < 10);
		System.out.println(res);
		{
			int x1 = 5;//0101
			int y1 = 7;//0111
			//Битовое И
			int z = x1 & y1; //0101
			System.out.println(z);
			//Битовое ИЛИ
			z = x1 | y1;//0111
			System.out.println(z);
			//Битовое отрицание
			z = ~x1;
			System.out.println(z);
			//ИСклчающее илиs
			z = x1 ^ y1;//XOR
			//x ^ y ^ y = x;
			System.out.println(z);
			//Обмен значениями  
			x1 = x1 ^ y1;
			System.out.println(x1);
			y1 = x1 ^ y1;
			System.out.println(y1);
			x1 = x1 ^ y1;
			System.out.println(x1);
			
		}
		{
			int a1 = 10;
			//a = a * 2;
			//a *= 2;
			//a1++;
			//System.out.println(a1);
			//++a1;
			//System.out.println(a1);
			int b2 = ++a1;
			//b2 == 11
			System.out.println(b2);
			System.out.println(a1);// = 11
			
			b2 = a1++;
			//b2 == 11
			System.out.println(b2);
			System.out.println(a1);// = 12
			
			
			
			
		}
		

	}

}
