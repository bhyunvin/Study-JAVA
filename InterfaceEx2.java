package day01;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class AAAAA implements I1, I2{
    public void x(){}
    public void z(){}   
} //하나의 클래스가 여러개의 인터페이스를 구현할수있다.

interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class BBB implements I4{
    public void x(){}
    public void z(){}   
} //인터페이스끼리도 상속될 수 있다.

interface I5{
    // private void y();
	//인터페이스는 따로 기재하지않아도 default가 아닌 무조건적으로 public 이다
	//당연히 private나 protected도 허용되지않는다.
}

/*
abstract는 하위클래스가 상속받아 사용(override)하도록 강제한다
실제로 구체적인 로직이나 상태를 가질수있다
그러나 interface는 구체적인 상태나 로직을 가질 수 없다.
*/