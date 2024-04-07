package example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegistrationFormController {
	@FXML
	private TextField nameField;
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button submitButton;
	@FXML
	private Button exitButton;

@FXML
protected void handleSubmitButtonAction(ActionEvent event)
{
 Window owner = submitButton.getScene().getWindow();
 if(nameField.getText().isEmpty()) {
Alert alert = new Alert(AlertType.ERROR);
 alert.setTitle("Form Error!");
 alert.setHeaderText(null);
 alert.setContentText("Please enter your name");
 alert.initOwner(owner);
 alert.show();}
 else if (emailField.getText().isEmpty()) {
	 Alert alert = new Alert(AlertType.ERROR);
	 alert.setTitle("Form Error!");
	 alert.setHeaderText(null);
	 alert.setContentText("Please enter your email id");
	 alert.initOwner(owner);
	 alert.show();
 }
 else if (passwordField.getText().isEmpty()) {
	 Alert alert = new Alert(AlertType.ERROR);
	 alert.setTitle("Form Error!");
	 alert.setHeaderText(null);
	 alert.setContentText("Please enter your password");
	 alert.initOwner(owner);
	 alert.show();
 }
else {
	 Alert alert = new Alert(AlertType.CONFIRMATION);
	 alert.setContentText("Welcome " + nameField.getText());
	 alert.show();
 }
}
@FXML
protected void handleExitButtonAction(ActionEvent event) {
    Window owner = exitButton.getScene().getWindow();
    Platform.exit();
}
}
