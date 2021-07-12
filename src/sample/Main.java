package sample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        primaryStage.setTitle("RPG");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MainMenuAndPlaying mainMenuAndPlaying = new MainMenuAndPlaying();
        ArrayList<Node> nodeList = mainMenuAndPlaying.createMainMenu(screenSize.getWidth(), screenSize.getHeight());
        for (int i=0; i<nodeList.size(); i++){
            pane.getChildren().add(nodeList.get(i));
        }
        primaryStage.setScene(new Scene(pane, screenSize.getWidth(), screenSize.getHeight()-55));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
