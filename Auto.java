
public abstract class Auto
{
	String make;
	double price;
	
	public abstract void setPrice();
	
	public double getPrice(){
		return price;
	}
	public void setMake (String m){
		make = m;
	}
	public String getMake(){
		return make;
	}
}
