package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage stage = new Stage();
    Pane paneMainMenu = new Pane();
    Pane paneChooseRace = new Pane();
    Pane paneChooseClass = new Pane();
    Pane paneStats = new Pane();
    Pane paneStartLoc = new Pane();
    Pane paneFight = new Pane();

    Scene sceneMainMenu;
    Scene sceneChooseRace;
    Scene sceneChooseClass;
    Scene sceneStats;
    Scene sceneStartLoc;
    Scene sceneFight;

    @Override
    public void start(Stage primaryStage){
        stage.setTitle("RPG");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MainMenuAndPlaying mainMenuAndPlaying = new MainMenuAndPlaying();
        mainMenuAndPlaying.createMainMenu(this, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneMainMenu = new Scene(paneMainMenu, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneChooseRace = new Scene(paneChooseRace, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneChooseClass = new Scene(paneChooseClass, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneStats = new Scene(paneStats, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneStartLoc = new Scene(paneStartLoc, screenSize.getWidth(), screenSize.getHeight()-55);
        sceneFight = new Scene(paneFight, screenSize.getWidth(), screenSize.getHeight()-55);
        stage.setScene(sceneMainMenu);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
