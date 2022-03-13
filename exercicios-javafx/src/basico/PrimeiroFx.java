package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		VBox box = new VBox();
		
		box.setAlignment(Pos.CENTER);
		
		box.setSpacing(10);
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene cena = new Scene(box, 200, 400);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
