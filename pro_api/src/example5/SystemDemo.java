package example5;

public class SystemDemo {
	public static void main(String[] args) {
		
		// 시스템의 현재 시간 정보 조회
		long time = System.currentTimeMillis();
		System.out.println(time);;
		
		// 시스템의 프로퍼티 정보조회
		// 프로퍼티 정보 : JVM이 시작될 때 자동으로 설정되는 시스템의 속성값
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		// 시스템의 환경변수 정보 조회
		String javahome = System.getenv("JAVA_HOME");
		System.out.println(javahome);
		
		String path = System.getenv("PATH");
		System.out.println(path);
		
	}
}
