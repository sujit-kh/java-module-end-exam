class  RaceTrack{
	public static void main(String []args){
	Car c1=new Car(2015,"Duster",60.00);
	//Currnt stutus of object
	System.out.println("MFG Year  =="+c1.getYear());
	System.out.println("Name of car =="+c1.getMake());
	System.out.println("Speed of car =="+c1.getSpedd());
	c1.accelerate();
	System.out.println("Speed of car after acceleratation is =="+c1.getSpedd());
	}
	
}