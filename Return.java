package tj.exam.ex01;

import java.util.Arrays;

public class Return {
	 
    public static String[] getMembers() {
        String[] members = { "철수", "영희", "종현" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(Arrays.toString(members));
    }
 
}