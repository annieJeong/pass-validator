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
		System.out.println("�н����带 �Է��ϼ���");
		System.out.println("���� : Q");
		passwd = br.readLine();
		
		
		Validator validator = new Validator();
		
		int validCode = validator.passwordValidate(passwd);
		
		switch(validCode){
			case TYPE_VERY_WEAK:
				System.out.println("�ſ����");
				break;
			case TYPE_WEAK:
				System.out.println("����");
				break;
			case TYPE_STRONG:
				System.out.println("����");
				break;
			case TYPE_VERY_STRONG:
				System.out.println("�ſ찭��");
				break;
		}
		}while(!passwd.trim().toUpperCase().startsWith("Q"));
	}

}
