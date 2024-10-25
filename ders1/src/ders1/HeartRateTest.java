package ders1;

import java.util.Scanner;

public class HeartRateTest {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Adınızı giriniz: ");
		String adi= Scanner.nextLine();
		System.out.println("Soyadınızı giriniz: ");
		String soyadi= Scanner.nextLine();
		System.out.println("Doğum yilinizi giriniz: ");
		int dogumyili= Scanner.nextInt();
		System.out.println("Mevcut yili giriniz: ");
		int suankiyil= Scanner.nextInt();
		HeartRate kisi1=new HeartRate(adi,soyadi,dogumyili,suankiyil);
		 kisi1.show();

}
}
