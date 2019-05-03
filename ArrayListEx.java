package day04;

import java.util.ArrayList;

public class ArrayListEx {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        ArrayList<String> al = new ArrayList<String>(); //add해서 들어오는 값을 String로 지정해준것
        al.add("one"); //add는 어떠한 형태의 데이터타입도 수용할 수 있다 (데이터타입이 Object여야한다)
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
        	String value = al.get(i);
            System.out.println(al.get(i));
            System.out.println(value);
        }
    }
}