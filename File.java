
public class File extends Document{

	private String pathname;

	public File(String textMsg, String pathDes) 
	{
		super(textMsg);
		pathname = pathDes;
	}

	public String getPathname()
	{
		return pathname;
	}

	public String getText() 
	{
		return super.toString();
	}

	public void setPathname(String newPath)
	{
		pathname = newPath;
	}

	public String toString() 
	{
		return pathname + ": " + super.toString();
	}
	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if (docObject.toString().indexOf(keyword, 0) >= 0)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample1 = "I like Java programming class but its difficult.";
		String sample2 = "I wish i have the brain of super computer.";
		Document email1 = new Email(sample1, "Safia", "Teacher", "Java");
		Document email2 = new Email(sample2, "Azhar", "Brian", "Computers");

		Document file1 = new File(sample1, "java.txt");
		Document file2 = new File(sample2, "computers.txt");
		String testWord = "Java";
		if (ContainsKeyword(email1, testWord))
			System.out.println("Email 1 contains the word " + testWord);
		else
			System.out.println("Email 1 does not contain " + "the word " + testWord);
		if (ContainsKeyword(email2, testWord))
			System.out.println("Email 2 contains the word " + testWord);
		else
			System.out.println("Email 2 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file1, testWord))
			System.out.println("File 1 contains the word " + testWord);
		else
			System.out.println("File 1 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file2, testWord))
			System.out.println("File 2 contains the word " + testWord);
		else
			System.out.println("File 2 does not contain" + " the word " + testWord);
		System.out.println("---");
		System.out.println(email1.toString());
		System.out.println("---");
		System.out.println(email2.toString());
		System.out.println("---");
		System.out.println(file1.toString());
		System.out.println(file2.toString());
	}

}
