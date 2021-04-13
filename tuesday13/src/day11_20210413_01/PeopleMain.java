package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		// PeopleMain 클래스에서 People 클래스를
		//객체로 만들어 활용
		
		//People 클래스 객체 선언
		People p  =new People();
	//People :객체로 만들 클래스이름
	//p:현재 파일에서 쓸 객체이름(내 맘대로)
	//People();:해당 클래스가 가지고 있는 생성자
	//해당 클래스가 별도의 생성자를 정의하고 있지 않다면 기본생성자를 사용함.
		
	//객체로 선언한 클래스가 가지고 있는 자원(필드,메소드) 활용
	//People 클래스가 가지고 있는 필드에 값 저장 및 출력
		p.name ="이름1";
		p.age=10;
		System.out.println(p.name);
		System.out.println(p.age);
		
		People p1= new People();
		p1.name="이름2";
		System.out.println(p1.name);
	}

}
