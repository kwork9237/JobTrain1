package Train_250807;

class car {
	private String name;
	private float maxSpeed;
	private long cost;
	
	public car(String name, float maxSpeed, long cost) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.cost = cost;
	}
	
	public void print() {
		System.out.println("car class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
}

class kia extends car {

	public kia(String name, float maxSpeed, long cost) {
		super(name, maxSpeed, cost);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("KIA");
		System.out.println("NAME : " + getName());
		System.out.println("MAXSPEED : " + getMaxSpeed());
		System.out.println("COST : " + getCost());
	}
}

class bmw extends car {

	public bmw(String name, float maxSpeed, long cost) {
		super(name, maxSpeed, cost);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("BMW TEST");
		System.out.println("NAME : " + getName());
		System.out.println("MAXSPEED : " + getMaxSpeed());
		System.out.println("COST : " + getCost());
	}
}

public class ExtendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kia k = new kia("KIACAR 1", 120, 1000000);
		bmw b = new bmw("BMWCAR 1", 120, 1000000);
		
		k.print();
		System.out.println();
		b.print();
	}

}
