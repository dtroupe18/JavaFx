/*
 * Created by Dave on 2/7/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class SwitchScenes extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;


        // first question to ask the user
        Label question1 = new Label("You are in a spooky room with a door and a lamp. How will you escape?");

        // choices
        Button button1 = new Button("Door");
        Button button2 = new Button("Lamp");

        // use lambda to control what happens when the user clicks a button
        button1.setOnAction(e -> window.setScene(scene2));

        // Layout 1 = children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(question1, button1);
        scene1 = new Scene(layout1, 200, 200);

        // button 2
        Button button3 = new Button("This scene sucks... go back");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button3);
        scene2 = new Scene(layout2, 600, 300);

        // how do we know what scence to display by default?
        window.setScene(scene1);
        window.setTitle("Room Escape");
        window.show();

    }
}
