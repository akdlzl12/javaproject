package example5;

public class ComputerApp {
	public static void main(String[] args) {
		// Computer<String> com1 = new Computer<String>();
		
		Computer<ColorMoniter> com = new Computer<ColorMoniter>();
		com.setMoniter(new ColorMoniter());
		com.turnOnMointer();
		com.displayMointer();
	}
}
