package person;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MiddleFacultyPane {

    // Declare the Labels, TextFields and GridPane
    GridPane facultyPane = new GridPane();
    Label rankLbl;
    TextField rankField;
    Label salaryLbl;
    TextField salaryField;
    Label coursesTeachingLbl;
    TextField coursesTeachingField;

    // The Constructor for the Faculty Pane
    public MiddleFacultyPane() {

        //facultyPane.setGridLinesVisible(true);

        // Set the Spacing for the Grid Pane
        facultyPane.setHgap(20);
        facultyPane.setVgap(5);

        // Initializing the Labels and TextFields
        rankLbl = new Label("Enter rank: ");
        rankField = new TextField();
        salaryLbl = new Label("Enter salary: ");
        salaryField = new TextField();
        coursesTeachingLbl = new Label("Enter courses teaching: ");
        coursesTeachingField = new TextField();

        // Organizing the Grid Pane
        facultyPane.add(rankLbl, 0, 0);
        facultyPane.add(rankField, 0, 1);
        facultyPane.add(salaryLbl, 0,15 );
        facultyPane.add(salaryField, 0, 16);
        facultyPane.add(coursesTeachingLbl, 0, 31);
        facultyPane.add(coursesTeachingField, 0, 32);

    }

    // Getters and Setters
    public TextField getRankField() {
        return rankField;
    }

    public void setRankField(TextField rankField) {
        this.rankField = rankField;
    }

    public TextField getSalaryField() {
        return salaryField;
    }

    public void setSalaryField(TextField salaryField) {
        this.salaryField = salaryField;
    }

    public TextField getCoursesTeachingField() {
        return coursesTeachingField;
    }

    public void setCoursesTeachingField(TextField coursesTeachingField) {
        this.coursesTeachingField = coursesTeachingField;
    }

    // Pass the Grid Pane through to the next Class
    public GridPane returnPane() {
        return facultyPane;
    }
}