package example1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// unknownHostException : Hostname(연결하려고 하는 컴퓨터이름)이 틀렸을 때 발생
		
		// 지정된 도메인 이름에 해당하는 ip주소 정보를 가지는 InetAddress객체 얻기
		InetAddress ia = InetAddress.getByName("www.daum.net");
		String ipAddress = ia.getHostAddress();
		System.out.println("다음의 ip 주소: " + ipAddress);
		
		InetAddress localHost = InetAddress.getLocalHost();
		String lhIpAddress = localHost.getHostAddress();
		System.out.println("내 컴퓨터의 ip 주소: " + lhIpAddress);
	}
}
