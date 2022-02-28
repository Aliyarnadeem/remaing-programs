import java.util.*;
public class enumedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car m = car.MARUTI;
		switch(m)
		{
		case FORD:
			System.out.println("Some local company");
			break;
		case MARUTI:
			System.out.println("Best company from my point of view");
			break;
		case SUZUKI:
			System.out.println("baddest experience company from my pov");
			break;
		case REVA:
			System.out.println("baddest experience company from my pov");
			break;
		}
		
		
		
		
		System.out.println(car.REVA.getprice());
	}

}

enum car {
	
	SUZUKI, FORD, MARUTI, REVA;
	int price;
	car() {
		price = 80;
		System.out.println("Constructor");
	}
	public int getprice() {
		return price;
	}
}