package person;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TopPersonPane {

    // Declare the Labels, TextField and Import the AddressPane
    GridPane topPersonPane = new GridPane();
    Label firstNameLbl;
    TextField firstNameField;
    Label lastNameLbl;
    TextField lastNameField;
    Label phoneLbl;
    TextField phoneField;
    AddressPane addressPane = new AddressPane();

    // Constructor
    public TopPersonPane() {

        //topPersonPane.setGridLinesVisible(true);

        // Set the Spacing for the Grid Pane
        topPersonPane.setHgap(20);
        topPersonPane.setVgap(5);

        // Initialize the Labels and fields
        firstNameLbl = new Label("Enter First Name:");
        firstNameField = new TextField();
        lastNameLbl = new Label("Enter Last Name:");
        lastNameField = new TextField();
        phoneLbl = new Label("Enter the Phone #");
        phoneField = new TextField();


        // Organize the Grid Pane
        topPersonPane.setAlignment(Pos.CENTER);
        topPersonPane.add(firstNameLbl, 0, 1);
        topPersonPane.add(firstNameField, 0, 2);
        topPersonPane.add(lastNameLbl, 1, 1);
        topPersonPane.add(lastNameField, 1, 2);
        topPersonPane.add(phoneLbl,2,1);
        topPersonPane.add(phoneField,2,2);
        topPersonPane.add(addressPane.streetNumberLbl, 0, 3);
        topPersonPane.add(addressPane.streetNumberField, 0, 4);
        topPersonPane.add(addressPane.streetNameLbl, 1, 3);
        topPersonPane.add(addressPane.streetNameField, 1, 4);
        topPersonPane.add(addressPane.cityLbl, 2, 3);
        topPersonPane.add(addressPane.cityField, 2, 4);
        topPersonPane.add(addressPane.stateLbl, 0, 5);
        topPersonPane.add(addressPane.stateList, 0, 6);
        topPersonPane.add(addressPane.zipLbl, 1, 5);
        topPersonPane.add(addressPane.zipField, 1, 6);

    }

    // Getters and Setters
    public TextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(TextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public TextField getPhoneField() { return  phoneField;}

    public void setPhoneField(TextField phoneField) { this.phoneField = phoneField; }

    // Pass the Grid Pane to the next class
    public GridPane returnPane() {
        return topPersonPane;
    }

}