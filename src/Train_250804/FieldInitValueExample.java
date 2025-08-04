package Train_250804;

class FieldValue {
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;
}


public class FieldInitValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FieldValue f = new FieldValue();
		
		System.out.println("byteField > " + f.byteField);
		System.out.println("shortField > " + f.shortField);
		System.out.println("intField > " + f.intField);
		System.out.println("longField > " + f.longField);
		
		System.out.println("booleanField > " + f.booleanField);
		System.out.println("charField > " + f.charField);
		
		System.out.println("floatField > " + f.floatField);
		System.out.println("doubleField > " + f.doubleField);
		
		System.out.println("arrField > " + f.arrField);
		System.out.println("referenceField > " + f.referenceField);
	}

}
