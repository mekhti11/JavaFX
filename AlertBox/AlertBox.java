package sample.AlertBox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by mekhti on 12/3/16.
 */

public class AlertBox {

    public static void display(String title,String message){
        Stage aBox = new Stage();

        Label label = new Label();
        label.setText(message);

        Button button = new Button("QUIT");
        button.setOnAction(e -> aBox.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout,200,200);

        aBox.setScene(scene);
        aBox.setTitle(title);
        aBox.initModality(Modality.APPLICATION_MODAL);
        aBox.showAndWait();
    }
}
