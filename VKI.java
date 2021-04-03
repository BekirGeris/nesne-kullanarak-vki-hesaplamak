package Bolum_10_Soru_2;

public class VKI {

	private String name;
	private int age;
	private double weight;
	private double size;
	
	
	public VKI(String name, int age, double weight, double size) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.size = size;
	}
	
	public double vkiHesapla() {
		return weight / Math.pow(size, 2); 
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getSize() {
		return size;
	}
	
	
	
}
