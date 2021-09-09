import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class mainClass {
    private static final Logger logger = LoggerFactory.getLogger(mainClass.class);
    private ComponentInterface contents;
	
    public mainClass(ComponentInterface contents) {
    	this.contents = contents;
    }
    
    public void setContents(ComponentInterface contents) {
    	this.contents = contents;
    }
    public void operazione() {
    	logger.debug(contents.draw());
    	
    }
    
    
    public static void main(String args[]) {
    	EsempioTesto testo = new EsempioTesto("Sono io");
    	
    	PopUpDecorator pop = new PopUpDecorator(testo);
    	mainClass me = new mainClass(pop);
    	me.operazione();
    	
    }
    
}
