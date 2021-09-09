package esamePackage;

public class Decorator implements ComponentInterface {
private ComponentInterface component;
	
	public Decorator( ComponentInterface component){
		this.component = component;
	}
	
	@Override
	public String draw() {
		return this.component.draw();
	}

}
