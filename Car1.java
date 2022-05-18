class Car{
	private int year;
	private String make;
	private double speed;
	Car( int year,String make, double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	int getYear(){
		return year;
	}
	String getMake(){
		return this.make;
	}
	double getSpedd(){
		return speed;
	}
	void accelerate(){
		speed=speed+1;
	}
}
class  RaceTrack{
	public static void main(String []args){
	Car c1=new Car(2015,"Duster",60.00);
	
	
	System.out.println("Year of manufacturing is =="+c1.getYear());
	System.out.println("Name of car is =="+c1.getMake());
	System.out.println("Speed of car is =="+c1.getSpedd());
	c1.accelerate();
	System.out.println("Speed of car after acceleratation is =="+c1.getSpedd());
	}
	
}