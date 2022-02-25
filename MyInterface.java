interface MyInterface{
	String getString();
}

class lambdaString{
	public static void main(String args[])
	{
		MyInterface reff = ()-> "Hello World";
		System.out.println(reff.getString());
	}
}