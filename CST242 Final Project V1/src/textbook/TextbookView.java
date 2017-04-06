package textbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextbookView extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	Bookbag theBag = new Bookbag(100);

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextBookPane textbookPane = new TextBookPane();
		GridPane root = textbookPane.returnPane();
		Scene scene = new Scene(root, 600, 700);
		primaryStage.setScene(scene);
		primaryStage.setTitle("please work");
		primaryStage.show();
		
		
	}
	

}
