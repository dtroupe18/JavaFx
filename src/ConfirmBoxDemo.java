/*
 * Created by Dave on 2/10/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class ConfirmBoxDemo extends Application  {

    Button button;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Main Window");

        button = new Button();
        button.setText("Click on Me");
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of new window", "Are you sure you want to quit?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

