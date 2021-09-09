
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PopUpDecorator extends Decorator{
    private static final Logger logger = LoggerFactory.getLogger(PopUpDecorator.class);

	public PopUpDecorator(ComponentInterface component) {
		super(component);
		
	}
	
	public void applyPopUp(String testo) throws Exception {
		Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("testo");
    	alert.setHeaderText("il testo del componente è: "+ testo);
    	alert.showAndWait();
		
	}


	@Override
	public String draw() {
		String preliminaryResults = super.draw();
		try {
		this.applyPopUp(preliminaryResults);
		}catch(Exception e){
			logger.debug(e.getMessage());
		}
		return preliminaryResults;
	}
	
}
