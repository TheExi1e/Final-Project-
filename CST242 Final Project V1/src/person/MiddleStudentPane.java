package person;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class MiddleStudentPane {

    // Declare the ListViews, TextFields and Grid Pane
    GridPane studentPane = new GridPane();
    Label coursesTookLbl;
    ListView<String> coursesTookList;
    Label coursesTakingLbl;
    ListView<String> coursesTakingList;
    Label coursesNeededLbl;
    TextArea coursesNeededArea;
    Label majorLbl;
    ListView<String> major;
    TextField creditsTakingField;
    TextField gpaField;
    VBox cTook;
    VBox cTaking;
    VBox majorVB;
    VBox cNeed;



    // Constructor
    public MiddleStudentPane() {

        //studentPane.setGridLinesVisible(true);

        // Set the spacing for the Grid Pane
        studentPane.setHgap(20);
        studentPane.setVgap(20);

        // Initialize the ListViews and TextFields

        coursesTookLbl = new Label("Taken Classes:");
        coursesTookList = new ListView<String>();
        coursesTookList.setMaxSize(120, 150);

        coursesTakingLbl = new Label("Current Courses:");
        coursesTakingList = new ListView<String>();
        coursesTakingList.setMaxSize(120, 150);

        coursesNeededLbl = new Label("Need to Take");
        coursesNeededArea = new TextArea();
        coursesNeededArea.setMaxSize(120, 150);

        majorLbl = new Label("Majors:");
        major = new ListView<String>();
        major.setMaxSize(120, 150);

        majorVB = new VBox();
        cTook = new VBox();
        cTaking = new VBox();
        cNeed = new VBox();

        majorVB.getChildren().addAll(majorLbl,major);
        cTook.getChildren().addAll(coursesTookLbl,coursesTookList);
        cTaking.getChildren().addAll(coursesTakingLbl,coursesTakingList);
        cNeed.getChildren().addAll(coursesNeededLbl,coursesNeededArea);



        creditsTakingField = new TextField("Enter the Number of Credits being Taken");
        gpaField = new TextField("Enter the Current GPA");

        // Make the Student Grid Pane look nice and organized
        studentPane.add(cTook, 0, 0);
        studentPane.add(cTaking, 0, 1);
        studentPane.add(cNeed, 1, 0);
        studentPane.add(majorVB, 1, 1);
        studentPane.add(creditsTakingField, 0, 2);
        studentPane.add(gpaField, 1, 2);



    }



    // Getters and Setters
    public ListView<String> getCoursesTookList() {
        return coursesTookList;
    }

    public void setCoursesTookList(ListView<String> coursesTookList) {
        this.coursesTookList = coursesTookList;
    }

    public ListView<String> getCoursesTakingList() {
        return coursesTakingList;
    }

    public void setCoursesTakingList(ListView<String> coursesTakingList) {
        this.coursesTakingList = coursesTakingList;
    }

    public TextArea getCoursesNeededArea() {
        return coursesNeededArea;
    }

    public void setCoursesNeededArea(TextArea coursesNeededArea) {
        this.coursesNeededArea = coursesNeededArea;
    }

    public ListView<String> getMajor() {
        return major;
    }

    public void setMajor(ListView<String> major) {
        this.major = major;
    }

    public TextField getCreditsTakingField() {
        return creditsTakingField;
    }

    public void setCreditsTakingField(TextField creditsTakingField) {
        this.creditsTakingField = creditsTakingField;
    }

    public TextField getGpaField() {
        return gpaField;
    }

    public void setGpaField(TextField gpaField) {
        this.gpaField = gpaField;
    }

    // Pass the Grid Pane through to the next class
    public GridPane returnPane() {
        return studentPane;
    }

}