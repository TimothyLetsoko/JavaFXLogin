import javafx.fxml.FXML;
import javafx.scene.control.*;

    public class LoginController {

        @FXML
        private Button btnSignIn;

        @FXML
        private Label lblErrorMsg;

        @FXML
        private PasswordField pfPassword;

        @FXML
        private TextField tfUsername;

        String username = "Darko", password = "Blackk";
        int numberOfAttempts = 3;

        @FXML
        void register() {
        // nothing in here
        }

        @FXML
        void signIn() {
            if(tfUsername.getText().trim().isEmpty() || pfPassword.getText().trim().isEmpty()){
                lblErrorMsg.setText("Username/Password missing");
            }else if(tfUsername.getText().equals(username) && pfPassword.getText().equals(password)){
                lblErrorMsg.setText("");
                System.out.println("Successfully logged in");
            }else{
                    lblErrorMsg.setText("Incorrect credentials, "+(numberOfAttempts-1)+ " attempt(s) left");
                    numberOfAttempts--;
            }
            if(numberOfAttempts == 0){
                btnSignIn.setDisable(true);
                lblErrorMsg.setText("You can no longer sign in.");
            }
        }
    }
