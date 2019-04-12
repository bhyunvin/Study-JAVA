package tj.exam.ex01;

public class SwitchBreakdefault {
	public static void main(String[] args) {
		System.out.println("Switch(1)");
		switch(4){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}
		System.out.println("Switch(2)");
		switch(2){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
		System.out.println("Switch(3)");
		switch(3){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}
}