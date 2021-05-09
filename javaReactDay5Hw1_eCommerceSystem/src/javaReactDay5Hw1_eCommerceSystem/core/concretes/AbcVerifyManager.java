package javaReactDay5Hw1_eCommerceSystem.core.concretes;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

import javaReactDay5Hw1_eCommerceSystem.core.abstracts.VerifyService;

public class AbcVerifyManager implements VerifyService {

	@Override
	public void sendVerifyMail() {
		Scanner input = new Scanner(System.in);
		while(true) {
		String verifyCode=getAlphaNumericString(15);
		System.out.println("Dogrulama kodunuz: "+verifyCode);
		System.out.println("Lutfen dogrulama kodunu giriniz:");
		
		
		
			String myString = input.next();
			if (myString.equals(verifyCode)) {
				System.out.println("Dogrulama basarili!");
				break;
			}else {
				System.out.println("Yanlis dogrulama kodu girildi. Lutfen tekrar deneyiniz.");
			}
		}
		
		
	}
	private String getAlphaNumericString(int n)
    {
  
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }

}
