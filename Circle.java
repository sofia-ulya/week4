package SemuaCircle;		//create package

public class Circle{
	//instance variable
	private double jejari, x,r;
	public static int bilObjekWujud = 0;
	//default constructor
	public Circle(){
		//System.out.println("Default constructor dipanggil");
		jejari = 1;
		x = 5;
		bilObjekWujud++;
	}

	//overloading constructor
	public Circle(double jejari){
		//this(jejari,59);
		this.jejari = jejari;x = 5;
		bilObjekWujud++;
	}
	public Circle(double jejari, double x){
		this.jejari = jejari;
		this.x = x;
		bilObjekWujud++;
	}

	//overload method toString()
	public String toString()
	{
		String tentangCircle;
		return "Bil objek ialah "+ bilObjekWujud;
		
		//return "jejari = "+jejari+"\nluas adalah "+KiraLuas()+"\nx = "+ x;
	}

	public void setCircle(double jejari)
	{
		this.jejari = jejari;
		System.out.println(jejari);
	}

	public double getCircle()
	{
		return jejari;
	}

	//method
	public double KiraLuas(){
		return jejari * jejari * Math.PI;
	}

	//static method. kena guna var yang static jugak
	public static double UkurLilit(double j){
		return 2 * Math.PI * j;
	}
}