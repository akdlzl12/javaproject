package example5;

public class ColorMoniter implements Moniter {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("컬러모니터를 켜다");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("컬러모니터를 끄다");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("컬러모니터에 컨텐츠를 표시하다");
	}
	
}
