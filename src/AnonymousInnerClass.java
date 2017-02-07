/*
 * Created by Dave on 2/7/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class AnonymousInnerClass extends Application  {

    Button button;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Title of Window");

        button = new Button();
        button.setText("Hey Baby");

        // SINGLE LINE LAMBDA
        // button.setOnAction(e -> System.out.println("Hey Hey Hey"));


        // MULTI-LINE
        button.setOnAction(e -> {
                    System.out.println("Hey Hey Hey");
                    System.out.println("Some more stuff");
                });

        /* button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am anonymous inner class");
            }
        }); */


        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

