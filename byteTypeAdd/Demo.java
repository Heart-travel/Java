class Demo 
{
	public static void main(String[] args)
	{
		//boolean bl = true;

		//byte a = 3, d = 3, b, c;
		//b = (byte)(b + 127);
		byte b;
		byte b1 = 4; 				// 这里等号左边为byte类型，等号右边为int型，编译的时候编译器会进行检测，
		byte b2 = 4; 				// 如果在byte可容纳的范围内，则强制转换为byte类型并赋值，否则，报错。
		b = b1 + b2; 				// 这里等号左边类型为byte，右边的结果有可能超出byte可容纳的范围，因此
									// 会报错:possible loss of precision.
		
		/*
		b = a++;
		c = ++d;
		System.out.println("b="+b+",c="+c);
		*/
//		System.out.println("a="+a+",b="+b);
		System.out.println(b);
	}
}
