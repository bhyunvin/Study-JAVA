package day01;

interface I{
    public void z(); //중괄호로 된 본체{}가 없음
}
 
class AAAA implements I{
    //public void z(){}
	//인터페이스를 따르지 않았기때문에 에러가생김
}