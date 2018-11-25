public class Driver {
  public static void main(String[] args) {
    MyString x = new MyString("TestString");
    MyString y = new MyString("StringTest");
    
	System.out.println(x.length());
	//10
	System.out.println(y.length());
	//10
	System.out.println(x.subSequence(0,4));
	//Test
	System.out.println(y.subSequence(0,6));
	//String
	System.out.println(x.charAt(4));
	//S
	System.out.println(y.charAt(0));
	//S
	System.out.println(x.compareTo(y));
	//something positive
	System.out.println(y.compareTo(x));
	//something negative
  }



}
