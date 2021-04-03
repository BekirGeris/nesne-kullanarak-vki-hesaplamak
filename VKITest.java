package Bolum_10_Soru_2;

public class VKITest {
	public static void main(String[] args) {
		
		VKI test1 = new VKI("Bekir", 22, 83, 1.90);
		
		System.out.printf(test1.getName() + " icin VKI: %.3f", test1.vkiHesapla());
	}
}
