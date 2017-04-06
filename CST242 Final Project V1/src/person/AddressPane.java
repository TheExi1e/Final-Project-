package person;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class AddressPane {

    // Street Number
    Label streetNumberLbl;
    TextField streetNumberField;

    // Street Name
    Label streetNameLbl;
    TextField streetNameField;

    // City
    Label cityLbl;
    TextField cityField;

    // State
    Label stateLbl;
    ListView<String> stateList;

    // ZipCode
    Label zipLbl;
    TextField zipField;

    public AddressPane() {

        // Initialize Street Number
        streetNumberLbl = new Label("Enter the Street Number");
        streetNumberField = new TextField();

        // Initialize the Street Name
        streetNameLbl = new Label("Enter the Street Name");
        streetNameField = new TextField();

        // Initialize the City
        cityLbl = new Label("Enter the City");
        cityField = new TextField();

        // Initialize the State
        stateLbl = new Label("Choose the State");
        stateList = new ListView<String>();
        stateList.setPrefSize(10, 50);
        stateList.getItems().addAll("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN",
                "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM",
                "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV",
                "WI", "WY");
        stateList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Initialize the ZipCode
        zipLbl = new Label("Enter the Zip Code");
        zipField = new TextField();

    }

    // Getters and Setters
    public TextField getStreetNumberField() {
        return streetNumberField;
    }

    public void setStreetNumberField(TextField streetNumberField) {
        this.streetNumberField = streetNumberField;
    }

    public TextField getStreetNameField() {
        return streetNameField;
    }

    public void setStreetNameField(TextField streetNameField) {
        this.streetNameField = streetNameField;
    }

    public TextField getCityField() {
        return cityField;
    }

    public void setCityField(TextField cityField) {
        this.cityField = cityField;
    }

    public TextField getZipField() {
        return zipField;
    }

    public void setZipField(TextField zipField) {
        this.zipField = zipField;
    }

    public ListView<String> getStateList() {
        return stateList;
    }



}