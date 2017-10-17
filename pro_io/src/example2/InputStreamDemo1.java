package example2;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class InputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://v.media.daum.net/v/20170704090304780");
		InputStream is = url.openStream();
		StringBuilder sb = new StringBuilder();
		
		byte[] buf = new byte[1024 * 8];
		int len = 0;
		
		while((len=is.read(buf)) != -1) {
			String chunk = new String(buf, 0, len, "euc-kr");
			sb.append(chunk);
		}
		
		System.out.println(sb.toString());
	}
}
