package person;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class PersonView extends Application {

/*
public void start(Stage primaryStage) throws Exception {

BodyBag theBag = new BodyBag(100);
*/

        @Override
        public void start(Stage primaryStage) throws Exception {
            PersonPane personPane = new PersonPane();

            Scene scene = new Scene(personPane.returnPane(), 600, 750);

            primaryStage.setScene(scene);
            primaryStage.setTitle("pl0x");
            primaryStage.show();

        }

        public static void main(String[] args) {
            launch(args);
        }

    }

