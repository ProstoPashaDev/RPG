package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;

public class MainMenuAndPlaying {
    Button newGameBtn = new Button();
    Button humanBtn = new Button();
    Label humanDescription = new Label();
    Button elfBtn = new Button();
    Label elfDescription = new Label();
    Button dwarfBtn = new Button();
    Label dwarfDescription = new Label();
    Button orcBtn = new Button();
    Label orcDescription = new Label();
    Button twoSwordsClassBtn = new Button();
    Button swordAndshieldClassBtn = new Button();
    Button twoHandedSwordClassBtn = new Button();
    Button thiefClassBtn = new Button();
    Button damageMageClassBtn = new Button();
    Button healMageClassBtn = new Button();
    Label strengthLbl = new Label();
    Label enduranceLbl = new Label();
    Label agilityLbl = new Label();
    Label manaLbl = new Label();
    Label concentrationLbl = new Label();
    Button strengthplus = new Button();
    Button enduranceplus = new Button();
    Button agilityplus = new Button();
    Button manaplus = new Button();
    Button concentrationplus = new Button();
    Label currentSkillPointLabel = new Label();
    ImageView heroesImage = new ImageView(new Image("heroes.jpg"));
    ArrayList<Double> mobCordListStartLoc = new ArrayList<>();
    Button humanBtnInFight = new Button();
    Button elfBtnInFight = new Button();
    Button dwarfBtnInFight = new Button();
    Button orcBtnInFight = new Button();
    Label humanHPLbl = new Label();
    Label elfHPLbl = new Label();
    Label dwarfHPLbl = new Label();
    Label orcHPLbl = new Label();
    Button spiderInFight = new Button();
    Label spiderHPlvl1 = new Label();

    Human human = new Human();
    Elf elf = new Elf();
    Dwarf dwarf = new Dwarf();
    Orc orc = new Orc();

    int squadlvl = 1;

    int spiderCurrentHP = 100;
    int skillPoint = 2;
    int quantityOfHeroes = 0;

    public void createMainMenu(Main main, double x, double y){
        tuneNewGameBtn(main, x, y);
        System.out.println(x+" "+ y);
        main.paneMainMenu.getChildren().add(newGameBtn);
        main.paneChooseRace.getChildren().add(humanBtn);
        main.paneChooseRace.getChildren().add(humanDescription);
        main.paneChooseRace.getChildren().add(elfBtn);
        main.paneChooseRace.getChildren().add(elfDescription);
        main.paneChooseRace.getChildren().add(dwarfBtn);
        main.paneChooseRace.getChildren().add(dwarfDescription);
        main.paneChooseRace.getChildren().add(orcBtn);
        main.paneChooseRace.getChildren().add(orcDescription);

        main.paneChooseClass.getChildren().add(twoSwordsClassBtn);
        main.paneChooseClass.getChildren().add(swordAndshieldClassBtn);
        main.paneChooseClass.getChildren().add(twoHandedSwordClassBtn);
        main.paneChooseClass.getChildren().add(thiefClassBtn);
        main.paneChooseClass.getChildren().add(damageMageClassBtn);
        main.paneChooseClass.getChildren().add(healMageClassBtn);

        main.paneStats.getChildren().add(strengthLbl);
        main.paneStats.getChildren().add(enduranceLbl);
        main.paneStats.getChildren().add(agilityLbl);
        main.paneStats.getChildren().add(manaLbl);
        main.paneStats.getChildren().add(concentrationLbl);
        main.paneStats.getChildren().add(strengthplus);
        main.paneStats.getChildren().add(enduranceplus);
        main.paneStats.getChildren().add(agilityplus);
        main.paneStats.getChildren().add(manaplus);
        main.paneStats.getChildren().add(concentrationplus);
        main.paneStats.getChildren().add(currentSkillPointLabel);

        main.paneStartLoc.getChildren().add(heroesImage);

        main.paneFight.getChildren().add(humanBtnInFight);
        main.paneFight.getChildren().add(elfBtnInFight);
        main.paneFight.getChildren().add(dwarfBtnInFight);
        main.paneFight.getChildren().add(orcBtnInFight);
        main.paneFight.getChildren().add(humanHPLbl);
        main.paneFight.getChildren().add(elfHPLbl);
        main.paneFight.getChildren().add(dwarfHPLbl);
        main.paneFight.getChildren().add(orcHPLbl);
        main.paneFight.getChildren().add(spiderInFight);
        main.paneFight.getChildren().add(spiderHPlvl1);
    }

    public void tuneNewGameBtn(Main main, double x, double y){
        newGameBtn.setPrefSize(100, 80);
        newGameBtn.setLayoutX(x / 2);
        newGameBtn.setLayoutY(y / 2 - 130);
        newGameBtn.setText("New Game");
        newGameBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                chooseClassAndRaceForCharacters(main, x, y);
                main.stage.setScene(main.sceneChooseRace);
            }
        });
    }
    public void chooseClassAndRaceForCharacters(Main main, double x, double y){
        tuneChooseRaceButtons(main, x, y);
        tuneRaceDescriptions(x, y);
    }
    public void tuneChooseRaceButtons(Main main, double x, double y){
        tuneHumanBtn(main, x, y);
        tuneElfBtn(main, x, y);
        tuneDwarfBtn(main, x, y);
        tuneOrcBtn(main, x, y);
    }
    public void tuneHumanBtn(Main main, double x, double y){
        humanBtn.setText("Human");
        humanBtn.setPrefSize(250, 250);
        humanBtn.setLayoutX(x / 5);
        humanBtn.setLayoutY(y / 5);
        humanBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createHumanHero(main, x, y);
                main.stage.setScene(main.sceneChooseClass);
            }
        });
    }
    public void tuneElfBtn(Main main, double x, double y){
        elfBtn.setText("Elf");
        elfBtn.setPrefSize(250, 250);
        elfBtn.setLayoutX(x / 5 + 350);
        elfBtn.setLayoutY(y / 5);
        elfBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createElfHero(main, x, y);
                main.stage.setScene(main.sceneChooseClass);
            }
        });
    }
    public void tuneDwarfBtn(Main main, double x, double y){
        dwarfBtn.setText("Dwarf");
        dwarfBtn.setPrefSize(250, 250);
        dwarfBtn.setLayoutX(x / 5 + 700);
        dwarfBtn.setLayoutY(y / 5);
        dwarfBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createDwarfHero(main, x, y);
                main.stage.setScene(main.sceneChooseClass);
            }
        });
    }
    public void tuneOrcBtn(Main main, double x, double y){
        orcBtn.setText("Orc");
        orcBtn.setPrefSize(250, 250);
        orcBtn.setLayoutX(x / 5 + 1050);
        orcBtn.setLayoutY(y / 5);
        orcBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                createOrcHero(main, x, y);
                main.stage.setScene(main.sceneChooseClass);
            }
        });
    }
    public void tuneRaceDescriptions(double x, double y){
        humanDescription.setText("People have an extra skill point at every second level");
        humanDescription.setLayoutX(x/5 + 5);
        humanDescription.setLayoutY(y/5 + 300);
        elfDescription.setText("Each level elves` agility increases by one");
        elfDescription.setLayoutX(x/5 + 355);
        elfDescription.setLayoutY(y/5 + 300);
        dwarfDescription.setText("If you have a dwarf in your squad you have a \nchance to find an extra gold or potion in chests");
        dwarfDescription.setLayoutX(x/5 + 705);
        dwarfDescription.setLayoutY(y/5 + 300);
        orcDescription.setText("The less health the orcs have, the more damage they do");
        orcDescription.setLayoutX(x/5 + 1055);
        orcDescription.setLayoutY(y/5 + 300);
    }
    public void tuneChooseClassBtn(Main main, double x, double y){
        twoSwordsClassBtn.setText("Two Swords");
        twoSwordsClassBtn.setPrefSize(200, 200);
        twoSwordsClassBtn.setLayoutX(x/5 - 300);
        twoSwordsClassBtn.setLayoutY(y/5);
        twoSwordsClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
        swordAndshieldClassBtn.setText("Sword and shield");
        swordAndshieldClassBtn.setPrefSize(200, 200);
        swordAndshieldClassBtn.setLayoutX(x/5);
        swordAndshieldClassBtn.setLayoutY(y/5);
        swordAndshieldClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
        twoHandedSwordClassBtn.setText("Two-handed sword");
        twoHandedSwordClassBtn.setPrefSize(200, 200);
        twoHandedSwordClassBtn.setLayoutX(x/5 + 300);
        twoHandedSwordClassBtn.setLayoutY(y/5);
        twoHandedSwordClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
        thiefClassBtn.setText("Thief");
        thiefClassBtn.setPrefSize(200, 200);
        thiefClassBtn.setLayoutX(x/5 + 600);
        thiefClassBtn.setLayoutY(y/5);
        thiefClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
        damageMageClassBtn.setText("Damage mage");
        damageMageClassBtn.setPrefSize(200, 200);
        damageMageClassBtn.setLayoutX(x/5 + 900);
        damageMageClassBtn.setLayoutY(y/5);
        damageMageClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
        healMageClassBtn.setText("Heal mage");
        healMageClassBtn.setPrefSize(200, 200);
        healMageClassBtn.setLayoutX(x/5 + 1200);
        healMageClassBtn.setLayoutY(y/5);
        healMageClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                main.stage.setScene(main.sceneStats);
            }
        });
    }
    public void createHumanHero(Main main, double x, double y){
        tuneChooseClassBtn(main, x, y);
        human.tuneStatsLbl(this, main, x, y);
        humanBtn.setDisable(true);
    }
    public void createElfHero(Main main, double x, double y){
        tuneChooseClassBtn(main, x, y);
        elf.tuneStatsLbl(this, main, x, y);
        elfBtn.setDisable(true);
    }
    public void createDwarfHero(Main main, double x, double y){
        tuneChooseClassBtn(main, x, y);
        dwarf.tuneStatsLbl(this, main, x, y);
        dwarfBtn.setDisable(true);
    }
    public void createOrcHero(Main main, double x, double y){
        tuneChooseClassBtn(main, x, y);
        orc.tuneStatsLbl(this, main, x, y);
        orcBtn.setDisable(true);
    }
    public void tuneHeroesImage(Main main, double x, double y){
        heroesImage.setLayoutX(121*8);
        heroesImage.setLayoutY(65*16);
        heroesImage.setFitWidth(121);
        heroesImage.setFitHeight(65);
        main.sceneStartLoc.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode().equals(KeyCode.W)){
                    heroesImage.setLayoutY(heroesImage.getLayoutY() - 65);
                    checkForMobsInStartLoc(main);
                }
                else if (keyEvent.getCode().equals(KeyCode.S)){
                    heroesImage.setLayoutY(heroesImage.getLayoutY() + 65);
                    checkForMobsInStartLoc(main);
                }
                else if (keyEvent.getCode().equals(KeyCode.A)){
                    heroesImage.setLayoutX(heroesImage.getLayoutX() - 121);
                    checkForMobsInStartLoc(main);
                }
                else if (keyEvent.getCode().equals(KeyCode.D)){
                    heroesImage.setLayoutX(heroesImage.getLayoutX() + 121);
                    checkForMobsInStartLoc(main);
                }
            }
        });
    }
    public void spawnMobsInStartLoc(Main main, double x, double y){
        tuneFightScene(x, y);
        Location startlocation = new Location();
        main.paneStartLoc.getChildren().add(startlocation.spawnSpider(this, 3, 3));
        main.paneStartLoc.getChildren().add(startlocation.spawnSpider(this, 13, 5));

    }

    public void checkForMobsInStartLoc(Main main){
        if (mobCordListStartLoc.contains(heroesImage.getLayoutX()) && mobCordListStartLoc.contains(heroesImage.getLayoutY())){
            main.stage.setScene(main.sceneFight);
        }
    }
    public void tuneFightScene(double x, double y) {
        ImageView humanImage = new ImageView(new Image("human.png"));
        humanImage.setFitWidth(250);
        humanImage.setFitHeight(250);
        humanBtnInFight.setGraphic(humanImage);
        humanBtnInFight.setPrefSize(250, 250);
        humanBtnInFight.setLayoutX(x / 5);
        humanBtnInFight.setLayoutY(y - 500);
        humanHPLbl.setText(human.currenthp + " / " + human.hp);
        humanHPLbl.setLayoutX(x / 5 + 100);
        humanHPLbl.setLayoutY(y - 200);
        ImageView elfImage = new ImageView(new Image("elf.jpg"));
        elfImage.setFitWidth(250);
        elfImage.setFitHeight(250);
        elfBtnInFight.setGraphic(elfImage);
        elfBtnInFight.setPrefSize(250, 250);
        elfBtnInFight.setLayoutX(x / 5 + 340);
        elfBtnInFight.setLayoutY(y - 500);
        elfHPLbl.setText(elf.currenthp + " / " + elf.hp);
        elfHPLbl.setLayoutX(x / 5 + 440);
        elfHPLbl.setLayoutY(y - 200);
        ImageView dwarfImage = new ImageView(new Image("dwarf.jpg"));
        dwarfImage.setFitWidth(250);
        dwarfImage.setFitHeight(250);
        dwarfBtnInFight.setGraphic(dwarfImage);
        dwarfBtnInFight.setPrefSize(250, 250);
        dwarfBtnInFight.setLayoutX(x / 5 + 680);
        dwarfBtnInFight.setLayoutY(y - 500);
        dwarfHPLbl.setText(dwarf.currenthp + " / " + dwarf.hp);
        dwarfHPLbl.setLayoutX(x / 5 + 780);
        dwarfHPLbl.setLayoutY(y - 200);
        ImageView orcImage = new ImageView(new Image("orc.jpg"));
        orcImage.setFitWidth(250);
        orcImage.setFitHeight(250);
        orcBtnInFight.setGraphic(orcImage);
        orcBtnInFight.setPrefSize(250, 250);
        orcBtnInFight.setLayoutX(x / 5 + 1020);
        orcBtnInFight.setLayoutY(y - 500);
        orcHPLbl.setText(orc.currenthp + " / " + orc.hp);
        orcHPLbl.setLayoutX(x / 5 + 1120);
        orcHPLbl.setLayoutY(y - 200);

        ImageView spiderImage = new ImageView(new Image("spider.jpg"));
        spiderImage.setFitWidth(250);
        spiderImage.setFitHeight(250);
        spiderInFight.setGraphic(spiderImage);
        spiderInFight.setLayoutX(x / 5 + 510);
        spiderInFight.setLayoutY(y / 5 - 100);
        spiderHPlvl1.setText(spiderCurrentHP + " / 100");
        spiderHPlvl1.setLayoutX(x / 5 + 610);
        spiderHPlvl1.setLayoutY(y / 5 + 200);
    }
    public void tuneSkillsForHeroes(){
        //TODO
    }
}
