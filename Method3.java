package tj.exam.ex01;

public class Method3 {
	public static void numbering(int start, int limit) {
		for (int i = start; i <= limit; i++) {
			if(start == 0)
				continue;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		numbering(1, 2);
	}
}