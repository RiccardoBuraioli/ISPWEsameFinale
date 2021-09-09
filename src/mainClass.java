package esamePackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainClass {
    private static final Logger logger = LoggerFactory.getLogger(MainClass.class);
    private ComponentInterface contents;
	
    public MainClass(ComponentInterface contents) {
    	this.contents = contents;
    }
    
    public void setContents(ComponentInterface contents) {
    	this.contents = contents;
    }
    public void operazione() {
    	logger.debug(contents.draw());
    	
    }
    
    
    public static void main(String args) {
    	EsempioTesto testo = new EsempioTesto("Sono io");
    	
    	PopUpDecorator pop = new PopUpDecorator(testo);
    	MainClass me = new MainClass(pop);
    	me.operazione();
    	
    }
    
}
