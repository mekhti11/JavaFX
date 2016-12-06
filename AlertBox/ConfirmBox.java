package sample.JavaFX.AlertBox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by mekhti on 12/5/16.
 */

public class ConfirmBox {

    private static boolean answer;

    public static boolean display(String title, String message) {
        Stage cBox = new Stage();

        Label label = new Label();
        label.setText(message);

        Button button1 = new Button("Yes");
        button1.setOnAction(e -> {
            answer=true;
            cBox.close();
        });
        Button button2 = new Button("No");
        button2.setOnAction(e-> {
            answer=false;
            cBox.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button1,button2);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 200, 200);

        cBox.setScene(scene);
        cBox.setTitle(title);
        cBox.initModality(Modality.APPLICATION_MODAL);
        cBox.showAndWait();

        return answer;
    }
}
