import java.util.LinkedList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        UserInterface UI = new UserInterface();

        stage.setTitle("NOMBRE");
        UI.studentsUI(stage);
        stage.show();
    }

}
