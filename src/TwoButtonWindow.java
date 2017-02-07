
/**
 * Created by Dave on 2/3/17.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class TwoButtonWindow extends Application implements EventHandler<ActionEvent>  {

    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Title of Window");

        button = new Button();
        button.setText("Click me");
        button.setOnAction(this);

        // ADD SECOND BUTTON
        button2 = new Button("Button 2");
        button2.setOnAction(this);

        /* StackPane layout = new StackPane();
         layout.getChildren().add(button);
         layout.getChildren().add(button2);

         // Button allignment

        StackPane.setAlignment(button, Pos.CENTER_LEFT);
        StackPane.setAlignment(button2, Pos.CENTER_RIGHT); */


        /*HBox hbox = new HBox(button, button2);
          Scene scene = new Scene(hbox, 300, 250); */

        Pane layout = new Pane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);
        button.setLayoutX(100);
        button.setLayoutY(125);
        button2.setLayoutX(200);
        button2.setLayoutY(125);


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.out.println("I love it when you touch me there");
        }

        if(event.getSource() == button2) {
            System.out.println("You pressed button number 2");
        }
    }
}

