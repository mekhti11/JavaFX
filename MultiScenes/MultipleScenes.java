package sample.JavaFX.MultiScenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by mekhti on 12/3/16.
 */

public class MultipleScenes extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage pStage = primaryStage;
        Scene scene1,scene2;
        Button buton1=new Button("Go to other scene ");
        Button buton2 = new Button("This scene sucks,back to first scene ");

        //setting a Label
        Label label = new Label("Welcome Earthlings");

        //Layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label,buton1);
        scene1 = new Scene(layout1,300,400);

        //Layout 2
        StackPane layout2 = new StackPane() ;
        layout2.getChildren().add(buton2);
        scene2 = new Scene(layout2,300,400);

        //Set button on action
        buton2.setOnAction(e -> pStage.setScene(scene1));
        buton1.setOnAction(e -> pStage.setScene(scene2));

        pStage.setScene(scene1);
        pStage.setTitle("MultipleScenes");
        pStage.show();
    }

}
