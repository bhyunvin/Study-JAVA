package tj.exam.ex01;

/*public class Array {
	public static void main(String[] args) {
		String[] classgroup = { "가나", "다라마바", "123" };
		for (int i = 0; i < 3; i++) {
			System.out.print(classgroup[i] + " ");
		}
	}
}*/
public class Array{
public static void main(String[] args) {
	String[] classgroup = { "가나", "다라마바", "123" };
	for (String i : classgroup) {
		System.out.print(i + " ");
	}
}
}