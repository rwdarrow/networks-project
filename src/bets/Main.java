package bets;

import com.sun.javafx.css.StyleManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("userScene.fxml"));
        primaryStage.setTitle("Energy Marketplace");
        Application.setUserAgentStylesheet(null);

        StyleManager.getInstance().addUserAgentStylesheet("src/bets/style.css");

        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 829, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
