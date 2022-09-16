package project0916금;

class Calculator{
	int value;
   Calculator(){
		this.value=0;
	}
 void add(int val) {
		this.value+=val;
	}
	int getValue() {
		return this.value;
		}
	
boolean isOdd(int val) {
 if(val%2==0) {return true;}
 else {return false; }
 }


int avg(int[] data) {return (data[0]+data[1])/5;}
	 
 }


class UpgradeCalculator extends Calculator{
	void minus(int val) {
		this.value-=val;
	}
}

class MaxLimitCalculator extends Calculator{
	int getValue() {	if(this.value<=100) {
		return this.value;}
       else {return 100;}}
	
		
	
}
public class Sample1 {
	public static void main(String[] args) {
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);  // 50 더하기
		cal.add(60);  // 60 더하기
		System.out.println(cal.getValue()); 
		Calculator cal1=new Calculator();
		cal1.add(50);  // 50 더하기
		cal1.add(49); 
				System.out.println(cal1.isOdd(cal1.getValue()));
				Calculator cal2=new Calculator();
				int[] data = {1, 3, 5, 7, 9};
					int result = cal2.avg(data);
				System.out.println(result); 
	}

}
