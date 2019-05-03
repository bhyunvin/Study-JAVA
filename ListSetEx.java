package day04;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class ListSetEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//list는 순서가 있고, 동일데이터를 허용하는 드럼통 구조이다
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		System.out.println("array");
		Iterator ai = al.iterator();
		while (ai.hasNext()) {
			System.out.println(ai.next());
		}

		HashSet<String> hs = new HashSet<String>();
		//set은 순서가 보장되지 않으며 동일 데이터는 허용되지 않는다 (엄청 커다란 주머니)
		//집합과 같다고 생각하면 편하다
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator(); //iterator라는 데이터타입을 갖고있는 hi라는 객체
		System.out.println("\nhashset");
		while (hi.hasNext()) { //while문 반복하면서 다음것이 있나 뽑아내기
			System.out.print(hi.next() + " ");
		}
	}
}