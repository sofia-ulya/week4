/*Static
1.static field
2.static method
3.static class --> Math class (API Java)
*/

import SemuaCircle.Circle;			//import specific class in package

public class DriverCircle{

	public static void main(String[]args){
	//object/reference
	Circle bulat = new Circle();	
	System.out.println("Print apa? "+bulat);

	Circle bulat1 = new Circle(76);
	System.out.println("Print apa? "+bulat1);

	Circle bulat2 = new Circle(8,3);
	System.out.println("Print apa? "+bulat2);

	Circle bulat3 = new Circle(8,3);
	System.out.println("Print apa? "+bulat3);

	//guna static method DriverCircle
	System.out.println("Ukurlilit = "+UkurLilit(bulat3.getCircle()));
	//guna static method dari class Circle
	System.out.println("Ukurlilit = "+Circle.UkurLilit(bulat3.getCircle()));
	
	System.out.println("Luas ialah "+ KiraLuas(bulat2));

	System.out.println("Paparan ialah "+ Papar());
	}

	//static method that return a reference (object)
	public static Circle Papar(){
		int j = 5;
		return new Circle(j);		//create object
	}

	//call by reference static method that accept as its parameter
	public static double KiraLuas(Circle b){
		return b.getCircle() * b.getCircle() * Math.PI;
	}

	//static method
	public static double UkurLilit(double jejari){
		return 2 * Math.PI * jejari;
	}
}



















//reference
	//String s = "DITP";
	//System.out.println(s);

	
	//System.out.println(bulat);
	//System.out.println(bulat1);
	/*System.out.println("Jejari bulat1 "+bulat.getCircle());	
	System.out.println("Jejari bulat2 "+bulat2.getCircle());
	bulat2.setCircle(35);
	System.out.println("Jejari bulat2 "+bulat2.getCircle());*/
	//System.out.format("Luas ialah %2.2f", bulat.KiraLuas());