package day01;

class AAAAAA{}
class BBBB extends AAAAAA{}
public class PolymorphismEx2 {
    public static void main(String[] args) {
        AAAAAA obj = new BBBB();
        //7행에선 AAAAAA대신 BBBB를 쓸수도 있다.
        //다시말해 상위클래스 혹은 상위클래스를 상속받은 하위클래스가 위치할수있다.
        // BBBB클래스가 마치 AAAAAA인것처럼 사용할수있다
    }
}