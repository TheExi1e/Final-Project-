package person;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BottomButtonsPane {

    // Declare the Buttons and the HBox
    VBox row;
    HBox topRow;
    HBox bottomRow;
    HBox buttonsPane;
    Button insertBtn;
    Button removeBtn;
    Button updateBtn;
    Button searchBtn;
    RadioButton student;
    RadioButton faculty;

    // The Choice
    ToggleGroup choice;

    // Buttons Constructor
    public BottomButtonsPane() {

        // Initialize the HBox
        buttonsPane = new HBox(20);
        bottomRow = new HBox(10);
        topRow = new HBox(10);
        row = new VBox(10);

        choice = new ToggleGroup();

        // Initialize the Buttons
        insertBtn = new Button("Add");
        insertBtn.setPrefWidth(100);
        removeBtn = new Button("Remove");
        removeBtn.setPrefWidth(100);
        updateBtn = new Button("Update");
        updateBtn.setPrefWidth(100);
        searchBtn = new Button("Search");
        searchBtn.setPrefWidth(100);
        student = new RadioButton("Student Mode");
        student.setToggleGroup(choice);
        faculty = new RadioButton("Faculty Mode");
        faculty.setToggleGroup(choice);

        bottomRow.getChildren().addAll(insertBtn,removeBtn,updateBtn,searchBtn);
        topRow.setAlignment(Pos.CENTER);
        topRow.getChildren().addAll(student,faculty);

        row.getChildren().addAll(topRow,bottomRow);
        row.setAlignment(Pos.CENTER);

        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.getChildren().addAll(row);

    }

    // Pass the Buttons through an HBox for other classes
    public HBox returnPane() {
        return buttonsPane;
    }

}