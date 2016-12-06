package sample.AlertBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sun.nio.ch.sctp.SctpNet;

/**
 * Created by mekhti on 12/5/16.
 */

public class Main_Exit extends Application{
    public static void main(String[] args){
        launch(args);
    }

    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;

        stage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        StackPane layout = new StackPane();
        Button button  = new Button("Close Program");
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,400);

        button.setOnAction(e -> closeProgram());

        stage.setScene(scene);
        stage.show();

    }
    private void closeProgram(){
        boolean answer = ConfirmBox.display("Exit","R U sure u wanna exit ? ");
        if (answer)
            stage.close();
    }
}