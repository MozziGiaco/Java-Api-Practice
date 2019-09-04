
public class JavaApiPractice
	{

		public static void main(String[] args)
			{
				String phraseOne = "Mullen High School";
				String phraseTwo = "Hello";
				String phraseThree = "Goodbye Everyone";

				System.out.println(phraseOne.substring(0, 3));

				System.out.println(phraseOne.substring(7, 11));

				System.out.println(phraseTwo.length());

				System.out.println(phraseThree.codePointCount(0, 6));

				System.out.println(phraseThree.codePointCount(0, 15));

				System.out.println(phraseThree.concat(phraseTwo));

				System.out.println(phraseThree.replace("e", "x"));

				System.out.println(phraseOne.toUpperCase());

				System.out.println(phraseOne.replaceAll(" ", ""));

				System.out.println(phraseOne.compareTo(phraseThree));

			}

	}
