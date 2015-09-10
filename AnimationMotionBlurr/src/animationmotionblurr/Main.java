package animationmotionblurr;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// http://www.java2s.com/Code/Java/JavaFX/UsingMotionBlur.htm

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Text text = new Text("Transparent!");
        text.setFont(new Font(40));

        MotionBlur mb = new MotionBlur();
        mb.setRadius(15.0);
        mb.setAngle(-30.0);

        text.setEffect(mb);

        VBox box = new VBox();
        box.getChildren().add(text);
        final Scene scene = new Scene(box, 300, 250);
        scene.setFill(null);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
