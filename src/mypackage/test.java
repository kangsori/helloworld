package mypackage;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class test {

	public static void main(String[] args) {
		String s1;
		s1 = Base64.getEncoder().encodeToString("소리님이 입장하셨습니다.".getBytes());
		System.out.println(s1);
		
		String s2 =new String(Base64.getDecoder().decode(s1));
		System.out.println(s2);
		
	}

}
