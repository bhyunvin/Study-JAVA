package tj.exam.ex01;

public class Method4 {
	public static String numbering(int start, int limit) {

		String output = "";
		for (int i = start; i < limit; i++) {
			output += i+" ";
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
	}
}

/*public static String numbering(int init, int limit) {
    int i = init;
    // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
    String output = "";
    while (i < limit) {
        // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
        output += i;
        i++;
    }
    // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
    // ��ġ�ϸ� �ȴ�.
    return output;
}

public static void main(String[] args) {
    // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
    String result = numbering(1, 5);
    // ���� result�� ���� ȭ�鿡 ����Ѵ�.
    System.out.println(result);
}
}*/