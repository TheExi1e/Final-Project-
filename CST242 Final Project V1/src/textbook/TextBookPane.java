package textbook;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class TextBookPane extends TextbookView {
	
	GridPane textbookPane = new GridPane();

	public TextBookPane() {

		textbookPane.setAlignment(Pos.CENTER);
		TextField textbookTitleField = new TextField();
		TextField textbookISBNField = new TextField();
		TextField textbookPriceField = new TextField();
		TextField authorFirstNameField = new TextField();
		TextField authorLastNameField = new TextField();

		Label textbookTitleLbl = new Label("Textbook Title: ");
		Label textbookISBNLbl = new Label("Textbook ISBN: ");
		Label textbookPriceLbl = new Label("Textbook Price: ");
		Label authorFirstNameLbl = new Label("Author First Name: ");
		Label authorLastNameLbl = new Label("Author Last Name: ");

		Button insertBtn = new Button("INSERT");
		insertBtn.setPrefWidth(100);
		Button searchBtn = new Button("SEARCH");
		searchBtn.setPrefWidth(100);
		Button removeBtn = new Button("REMOVE");
		removeBtn.setPrefWidth(100);
		Button updateBtn = new Button("UPDATE");
		updateBtn.setPrefWidth(100);

		//textbookPane.getChildren().addAll(textbookTitleField, textbookISBNField, authorFirstNameField,
		//		authorLastNameField, textbookTitleLbl, textbookISBNLbl, textbookPriceLbl, authorFirstNameLbl,
		//		authorLastNameLbl, insertBtn, searchBtn, removeBtn, updateBtn);
		
		textbookPane.add(textbookTitleLbl, 0, 0);
		textbookPane.add(textbookTitleField, 0, 1);
		textbookPane.add(textbookISBNLbl, 0, 2);
		textbookPane.add(textbookISBNField, 0, 3);
		textbookPane.add(textbookPriceLbl, 0, 4);
		textbookPane.add(textbookPriceField, 0, 5);
		textbookPane.add(authorFirstNameLbl, 1, 0);
		textbookPane.add(authorFirstNameField, 1, 1);
		textbookPane.add(authorLastNameLbl, 1, 2);
		textbookPane.add(authorLastNameField, 1, 3);
		
		textbookPane.add(insertBtn, 0, 10);
		textbookPane.add(searchBtn, 0, 11);
		textbookPane.add(removeBtn, 0, 12);
		textbookPane.add(updateBtn, 0, 13);

		insertBtn.setOnAction(e -> {
			// String isbn, string title, arraylist<Author> authors, double
			// price
			String isbn = textbookISBNField.getText();
			String title = textbookTitleField.getText();
			String authorFn = authorFirstNameField.getText();
			String authorLn = authorLastNameField.getText();
			Author newAuthor = new Author(authorFn, authorLn);
			Double price = Double.parseDouble(textbookPriceField.getText());

			ArrayList<Author> author = new ArrayList<Author>();
			author.add(newAuthor);

			Textbook t = new Textbook(isbn, title, author, price);
			theBag.add(t);
			textbookISBNField.clear();
			textbookTitleField.clear();
			authorFirstNameField.clear();
			authorLastNameField.clear();
			textbookPriceField.clear();
		});

		searchBtn.setOnAction(e -> {
			String isbn = textbookISBNField.getText();
			if (theBag.searchByBookISBN(isbn) == null) {
				Stage notFoundStage = new Stage();
				VBox notFoundHBox = new VBox(20);
				Label notFoundLbl = new Label("Book not found.");
				Button okBtn = new Button("OK");
				notFoundHBox.getChildren().addAll(notFoundLbl, okBtn);
				Scene notFoundScene = new Scene(notFoundHBox, 800, 200);
				notFoundStage.setScene(notFoundScene);
				notFoundStage.show();
				okBtn.setOnAction(e1 -> {
					notFoundStage.close();
				});

			} else {

				Stage foundStage = new Stage();
				VBox foundHBox = new VBox(20);
				Label foundLbl = new Label("BOOK FOUND: " + theBag.searchByBookISBN(isbn).toString() + "\n");
				Button okBtn = new Button("OK");
				foundHBox.getChildren().addAll(foundLbl, okBtn);
				Scene foundScene = new Scene(foundHBox, 800, 200);
				foundStage.setScene(foundScene);
				foundStage.show();
				okBtn.setOnAction(e1 -> {
					foundStage.close();
				});

			}
		});

		removeBtn.setOnAction(e -> {
			
			String isbn = textbookISBNField.getText();
			if (theBag.searchByBookISBN(isbn) == null) {
				Stage notFoundStage = new Stage();
				VBox notFoundHBox = new VBox(20);
				Label notFoundLbl = new Label("Book not found.");
				Button okBtn = new Button("OK");
				notFoundHBox.getChildren().addAll(notFoundLbl, okBtn);
				Scene notFoundScene = new Scene(notFoundHBox, 800, 200);
				notFoundStage.setScene(notFoundScene);
				notFoundStage.show();
				okBtn.setOnAction(e1 -> {
					notFoundStage.close();
				});

			} else {

				Stage foundStage = new Stage();
				VBox foundHBox = new VBox(20);
				Label foundLbl = new Label("REMOVING BOOK: " + theBag.searchByBookISBN(isbn).toString() + "\n");
				Button okBtn = new Button("OK");
				foundHBox.getChildren().addAll(foundLbl, okBtn);
				Scene foundScene = new Scene(foundHBox, 800, 200);
				foundStage.setScene(foundScene);
				foundStage.show();
				theBag.removeByBookISBN(isbn);
				okBtn.setOnAction(e1 -> {
					foundStage.close();
				});

			}

		});

		updateBtn.setOnAction(e -> {

		});

	}
	
	public GridPane returnPane(){
		return textbookPane;
	}

}
