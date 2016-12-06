package sample.AlertBox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by mekhti on 12/3/16.
 */

public class Main extends Application {

    Stage pStage;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        pStage = primaryStage;
        Label label = new Label();

        Button button = new Button("Touch to open Alert Box");
        Button button2 = new Button("Touch to open Confirm Box");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button,button2);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout,500,400);

        button.setOnAction(e -> AlertBox.display("Alert Box","This is an ALert Box"));
        button2.setOnAction(e -> {
            boolean result = ConfirmBox.display("ConfirmBox", "R U a Robot?");
            if (result)
                label.setText("You are a Robot");
            else
                label.setText("You are not a Robot");
        });

        pStage.setScene(scene);
        pStage.setTitle("Primary Stage");
        pStage.show();
    }
}
