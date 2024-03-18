import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Student> students = new ArrayList<>();
        Image image1 = new Image(getClass().getResourceAsStream("/cat.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("/cat2.png"));
        Image image3 = new Image(getClass().getResourceAsStream("/cat3.png"));
        students.add(new Student("David", 123, image1));
        students.add(new Student("Aaron", 321, image2));
        students.add(new Student("Sam", 213, image3));
        VBox vb = new VBox();
        for (Student s: students){
            vb.getChildren().add(getStudent(s));
        }
        BorderPane bp = new BorderPane();
        bp.setCenter(vb);
        Scene scene = new Scene(bp, 500, 500, Color.LIGHTYELLOW);
        stage.setTitle("Name");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    private VBox getStudent(Student s){
    VBox student = new VBox();
    student.getChildren().add(new Text("Name: " + s.getName()));
    student.getChildren().add(new Text("ID: " + s.getID()));
    ImageView imageView = new ImageView(s.getImage());
    student.getChildren().add(imageView);
    imageView.setFitWidth(150);
    imageView.setFitHeight(100);
    student.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, null, null)));
    student.setPadding(new Insets(10));
    student.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
    student.setStyle("-fx-margin-bottom: 10px;");
    return student;
    }
}