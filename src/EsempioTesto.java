package esamePackage;

public class EsempioTesto implements ComponentInterface{
private String text;
	
	public EsempioTesto(String text){
		this.setText(text);
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	@Override
	public String draw() {
		return (this.text);
	}
	
}
