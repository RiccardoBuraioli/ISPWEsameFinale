
public class Decorator extends ComponentInterface {
private ComponentInterface component;
	
	public Decorator( ComponentInterface component){
		this.component = component;
	}
	
	@Override
	public String draw() {
		String resultsFromRedirection = this.component.draw(); 
		return resultsFromRedirection;
	}

}
