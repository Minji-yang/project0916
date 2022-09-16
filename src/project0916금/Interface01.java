package project0916금;
interface Predator {                   //class아닌 interface 하면  feed메소드 계속 추가할 필요없다
              String getFood();                //인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 내용은 없다.
                                            //구현은  인터페이스를  implements한 클래스들이 구현해야한다.
}
interface Barkable{
	void bark();
}
class Animal{                   //Animal클래스
	String name; //객체변수
	public void setName(String name) {          //method
		this.name=name;
	}
}
class Tiger extends Animal implements Predator, Barkable{          //Tiger 클래스
   public String getFood() {
	   return "apple";
	   }             //interface 메소드는 항상 public으로 구현해야한다.
public void bark() {
	System.out.println("어흥");
	}
}


class Lion extends Animal implements Predator, Barkable{              //Lion 클래스
	 public String getFood() {return "banana";}                       
  public void bark(){System.out.println("으르렁");}}

class Zookeeper{                                    //사육사 클래스
	//Animal tiger=new Tiger()  t is a.
	//Predator tiger= new Tiger()  t is  p
	void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}
}

class Bouncer{
	void barkAnimal(Barkable b) { b.bark();}
		/*
		 * if(animal instanceof Tiger) { System.out.println("어흥"); } else if(animal
		 * instanceof Lion) { System.out.println("으르렁"); }
		 */
	}

public class Interface01 {
	public static void main(String[] args) {
		Zookeeper zooKeeper=new Zookeeper();           // 사육사 객체
		Tiger tiger=new Tiger();                                         // Tiger객체
		Lion lion =new Lion();                                             //Lion객체
		zooKeeper.feed(tiger);                                            //feed(tiger)메소드
		zooKeeper.feed(lion);                                            //feed(lion)메소드
		
		Bouncer bouncer=new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}


