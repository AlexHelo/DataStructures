import java.util.LinkedList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class UserInterface {

    LinkedList<Student> StudentList = new LinkedList<Student>();

    TextField textField1 = new TextField();
    TextField textField2 = new TextField();
    TextField textField3 = new TextField();

    Label StudentsListView = new Label("");

    public void studentsUI(Stage stage) {
        HBox hbox = new HBox(300);
        Scene sc = new Scene(hbox);
        VBox vbox = new VBox(50);
        BorderPane bp = new BorderPane();
        Label nothing = new Label("           ");
        nothing.setMinWidth(10);
        // Name FIELD
        textField1.setPromptText("NAME");
        // ID FIELD

        textField2.setPromptText("ID");
        // GRADE FIELD

        textField3.setPromptText("Grade");
        // BUTTONS
        Button buttonAdd = new Button("Add Student");

        buttonAdd.setOnAction((event) -> {
            addStudent();
        });

        Button buttonSort = new Button("Sort");

        buttonSort.setOnAction((event) -> {
            orderList();
        });

        vbox.getChildren().addAll(textField1, textField2, textField3, buttonAdd, buttonSort);
        bp.setLeft(nothing);
        bp.setCenter(vbox);

        hbox.getChildren().addAll(bp, StudentsListView);
        stage.setScene(sc);
    }

    public void addStudent() {

        StudentList
                .add(new Student(textField1.getText(), textField2.getText(), Double.parseDouble(textField3.getText())));

        textField1.clear();
        textField2.clear();
        textField3.clear();

        updatePrint();
    }

    public void orderList() {

        quickSort(0, StudentList.size() - 1);

        updatePrint();
    }

    public void updatePrint() {
        StudentsListView.setText("");
        for (int i = 0; i < StudentList.size(); i++) {

            StudentsListView.setText(StudentsListView.getText() + StudentList.get(i).format());
        }

    }

    public void quickSort(int low, int high) {

        int i = low, j = high;

        Student pivot = StudentList.get(low + (high - low) / 2);

        while (i <= j) {

            while (StudentList.get(i).getGrade() < pivot.getGrade()) {
                i++;
            }

            while (StudentList.get(j).getGrade() > pivot.getGrade()) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private void exchange(int i, int j) {
        Student temp = StudentList.get(i);
        StudentList.set(i, StudentList.get(j));
        StudentList.set(j, temp);

    }
}