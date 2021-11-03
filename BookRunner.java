public class BookRunner
{
	public static void main(String args[])
	{
		Book textBook = new Book();
		System.out.println(textBook);  //What does this line do? Accesses toString method.
		Book tester = new Book("An Introduction to Java", 11111111);
		System.out.println(tester);  //What does this line do? Accesses toString method.
		System.out.println();
		System.out.println();
		System.out.println();
		tester.setName("ABCDEFG");
		textBook.setName("qwerty");
		tester.setISBN(123456);
		textBook.setISBN(654321);
		System.out.println(textBook.getBookName());
		System.out.println(tester.getBookName());
		System.out.println(textBook.getBookISBN());
		System.out.println(tester.getBookISBN());
		System.out.println(textBook);
		System.out.println(tester);
	}
}