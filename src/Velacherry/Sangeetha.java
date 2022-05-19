package Velacherry;
import Tnagar.Hotchips;
import Porur.vasantha;
public class Sangeetha {
	private void Meals() {
		// TODO Auto-generated method stub
System.out.println("Available Meals");
	}
private void Dosa() {
	// TODO Auto-generated method stub
System.out.println("Available dossa");
}
public static void main(String[] args) {
	Sangeetha s= new Sangeetha();
	s.Meals();
	s.Dosa();

	Hotchips f= new Hotchips(); 
	f.Friedrice();
	f.Noodle();
	vasantha v= new vasantha();
	v.Soup();
}
}