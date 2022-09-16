package project0916금;

class Calculatorr {
	Integer value=0;

	void add(int val) {
		this.value += val;
	}

	  public Integer getValue() { return this.value; }
	
}

public class Sample6 {
	public static void main(String[] args) {
        Calculatorr calr = new Calculatorr();
        calr.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(calr.getValue());
	}

}
