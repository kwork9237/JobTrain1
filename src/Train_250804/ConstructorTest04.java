package Train_250804;

class MyDate04{   
  int year;    
  int month;    
  int day;  

/*  public MyDate(){
    year=2023;    month=4;    day=1;
  }*/
 
//  public MyDate04(int year,int month,int day){
//   this.year=year;
//   this.month=month;
//   this.day=day;
//  }
  
  
  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }

	public MyDate04(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
	MyDate04 d=new MyDate04(1, 1, 1);	
    d.print();

    MyDate04 d2=new MyDate04(2023, 7, 19);
    d2.print();
  }
}            