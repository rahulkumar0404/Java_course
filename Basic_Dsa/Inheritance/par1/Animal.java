package par1;

class Animal {
	private String type;
	private String size;
	private double weight;

	public Animal() {}
	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	public void move(String speed) {
		System.out.println(this.type + "moves" + speed);
	}

	public void makeNoise() {
		System.out.println(type + "makes some kind of moves");
	}
}
