package paquete;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ClickMe extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	Button btn;
	@Override
	
	public void start(Stage primaryStage) throws Exception {
		btn = new Button("Click me");
		btn.setOnAction( e -> buttonClicked());
		
		StackPane pane = new StackPane();
		pane.getChildren().add(btn);
		
		
		primaryStage.setScene(new Scene(pane,300,250));
		primaryStage.show();
		primaryStage.setTitle("Nuevo título");
		
		
	}
	public void buttonClicked() {
		if( btn.getText().equals("Click me")) {
			btn.setText("Clicked");
		}
		else {
			btn.setText("Click me");
		}
	}
	
}
