
public class UseAuto {

	public static void main(String[] args){
		Kia soul = new Kia();
		Ford focus = new Ford();
		
		soul.setMake("Kia Soul");
		soul.setPrice();
		
		focus.setMake("Ford focus");
		focus.setPrice();
		
		System.out.println("The " + soul.getMake() + "costs " + soul.getPrice());
		System.out.println("The " + focus.getMake() + "costs " + focus.getPrice());
	}
}
