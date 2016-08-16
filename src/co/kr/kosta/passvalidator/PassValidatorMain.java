package co.kr.kosta.passvalidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import co.kr.kosta.passvalidator.service.Validator;
import static co.kr.kosta.passvalidator.util.PasswordComplexityContants.*;

public class PassValidatorMain{

	public static void main(String[] args) throws IOException {
		String passwd;
		do{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("패스워드를 입력하세요");
		System.out.println("종료 : Q");
		passwd = br.readLine();
		
		
		Validator validator = new Validator();
		
		int validCode = validator.passwordValidate(passwd);
		
		switch(validCode){
			case TYPE_VERY_WEAK:
				System.out.println("매우약함");
				break;
			case TYPE_WEAK:
				System.out.println("약함");
				break;
			case TYPE_STRONG:
				System.out.println("강함");
				break;
			case TYPE_VERY_STRONG:
				System.out.println("매우강함");
				break;
		}
		}while(!passwd.trim().toUpperCase().startsWith("Q"));
	}

}
