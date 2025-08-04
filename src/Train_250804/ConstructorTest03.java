package Train_250804;

class MyDate2{   
  private int year;    
  private int month;    
  private int day;
  public MyDate2(){ // 기본 생성자 
    year=2023;
    month=4;
    day=1;
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate2 d=new MyDate2();
    d.print(); 
  }
}               