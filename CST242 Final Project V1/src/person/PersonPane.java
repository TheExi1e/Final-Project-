package person;

import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PersonPane {

    // Import the different Panes
    VBox personPane = new VBox(20);
    TopPersonPane topPersonPane;
    MiddleStudentPane middleStudentPane;
    MiddleFacultyPane middleFacultyPane;
    BottomButtonsPane bottomButtonsPane;

    HBox middle = new HBox(20);

    Separator separator1 = new Separator();
    Separator separator2 = new Separator();
    Separator separator3 = new Separator();


    // Constructor
    public PersonPane() {

        topPersonPane = new TopPersonPane();
        middleStudentPane = new MiddleStudentPane();
        middleFacultyPane = new MiddleFacultyPane();
        bottomButtonsPane = new BottomButtonsPane();

        separator1.setValignment(VPos.CENTER);
        separator2.setValignment(VPos.CENTER);
        separator3.setHalignment(HPos.CENTER);
        separator3.setOrientation(Orientation.VERTICAL);
        middle.setAlignment(Pos.CENTER);
        middle.getChildren().addAll(middleStudentPane.returnPane(), separator3, middleFacultyPane.returnPane());
        personPane.getChildren().addAll(topPersonPane.returnPane(), separator1, middle, separator2, bottomButtonsPane.returnPane());


        bottomButtonsPane.insertBtn.setOnAction(e -> {

            if (topPersonPane.firstNameField.getText() == null || topPersonPane.lastNameField.getText() == null || topPersonPane.phoneField.getText() == null || topPersonPane.addressPane.streetNumberField.getText() == null || topPersonPane.addressPane.streetNameField.getText() == null || topPersonPane.addressPane.cityField.getText() == null || topPersonPane.addressPane.stateList.getSelectionModel().getSelectedItem() == null || topPersonPane.addressPane.zipField.getText() == null || middleStudentPane.coursesTakingList.getSelectionModel().getSelectedItems() == null || middleStudentPane.coursesTookList.getSelectionModel().getSelectedItems() == null || middleStudentPane.creditsTakingField.getText() == null || middleStudentPane.gpaField.getText() == null || middleStudentPane.major.getSelectionModel().getSelectedItem() == null) {
                System.out.println("nope");
            } else {

                if (bottomButtonsPane.student.isSelected() == true) {

                    System.out.println("Student");
                } else if (bottomButtonsPane.faculty.isSelected() == true) {
                    System.out.println("Faculty");

                } else {
                    System.out.println("choose");
                }
            }
        });

    }

    //
    public VBox returnPane() {
        return personPane;
    }


}


