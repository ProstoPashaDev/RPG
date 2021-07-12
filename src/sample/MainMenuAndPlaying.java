package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class MainMenuAndPlaying {
    Button newGameBtn = new Button();
    Label chooseClassAndRaceLabel = new Label();
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

    public ArrayList<Node> createMainMenu(double x, double y){
        tuneNewGameBtn(x, y);
        ArrayList<Node> nodelist = new ArrayList<>();
        nodelist.add(newGameBtn);
        nodelist.add(chooseClassAndRaceLabel);
        nodelist.add(humanBtn);
        nodelist.add(humanDescription);
        nodelist.add(elfBtn);
        nodelist.add(elfDescription);
        nodelist.add(dwarfBtn);
        nodelist.add(dwarfDescription);
        nodelist.add(orcBtn);
        nodelist.add(orcDescription);
        nodelist.add(twoSwordsClassBtn);
        nodelist.add(swordAndshieldClassBtn);
        nodelist.add(twoHandedSwordClassBtn);
        nodelist.add(thiefClassBtn);
        nodelist.add(damageMageClassBtn);
        nodelist.add(healMageClassBtn);
        nodelist.add(strengthLbl);
        nodelist.add(enduranceLbl);
        nodelist.add(agilityLbl);
        nodelist.add(manaLbl);
        nodelist.add(concentrationLbl);
        nodelist.add(strengthplus);
        nodelist.add(enduranceplus);
        nodelist.add(agilityplus);
        nodelist.add(manaplus);
        nodelist.add(concentrationplus);
        nodelist.add(currentSkillPointLabel);

        return nodelist;
    }
    public void setVisibleFalse(){
        humanBtn.setVisible(false);
        elfBtn.setVisible(false);
        dwarfBtn.setVisible(false);
        orcBtn.setVisible(false);
        twoSwordsClassBtn.setVisible(false);
        swordAndshieldClassBtn.setVisible(false);
        twoHandedSwordClassBtn.setVisible(false);
        thiefClassBtn.setVisible(false);
        damageMageClassBtn.setVisible(false);
        healMageClassBtn.setVisible(false);
        strengthplus.setVisible(false);
        enduranceplus.setVisible(false);
        agilityplus.setVisible(false);
        manaplus.setVisible(false);
        concentrationplus.setVisible(false);
        strengthLbl.setVisible(false);
        enduranceLbl.setVisible(false);
        agilityLbl.setVisible(false);
        manaLbl.setVisible(false);
        concentrationLbl.setVisible(false);
        //TODO ...
    }

    public void tuneNewGameBtn(double x, double y){
        setVisibleFalse();
        newGameBtn.setPrefSize(100, 80);
        newGameBtn.setLayoutX(x / 2);
        newGameBtn.setLayoutY(y / 2 - 130);
        newGameBtn.setText("New Game");
        newGameBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                newGameBtn.setVisible(false);
                chooseClassAndRaceForCharacters(x, y);
            }
        });
    }
    public void chooseClassAndRaceForCharacters(double x, double y){
        tuneChooseClassAndRaceLabel(x, y);
        tuneChooseRaceButtons(x, y);
        tuneRaceDescriptions(x, y);
    }
    public void tuneChooseClassAndRaceLabel(double x, double y){
        chooseClassAndRaceLabel.setText("Choose race for first character");
        chooseClassAndRaceLabel.setLayoutX(x/2 - 100);
        chooseClassAndRaceLabel.setLayoutY(y/5 - 100);
    }
    public void tuneChooseRaceButtons(double x, double y){
        tuneHumanBtn(x, y);
        tuneElfBtn(x, y);
        tuneDwarfBtn(x, y);
        tuneOrcBtn(x, y);
    }
    public void tuneHumanBtn(double x, double y){
        humanBtn.setVisible(true);
        humanBtn.setText("Human");
        humanBtn.setPrefSize(250, 250);
        humanBtn.setLayoutX(x / 5);
        humanBtn.setLayoutY(y / 5);
        humanBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tuneNodes(x, y);
                for (int i=0; i<4; i++){

                }

            }
        });
    }
    public void tuneElfBtn(double x, double y){
        elfBtn.setVisible(true);
        elfBtn.setText("Elf");
        elfBtn.setPrefSize(250, 250);
        elfBtn.setLayoutX(x / 5 + 350);
        elfBtn.setLayoutY(y / 5);
        elfBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tuneNodes(x, y);
            }
        });
    }
    public void tuneDwarfBtn(double x, double y){
        dwarfBtn.setVisible(true);
        dwarfBtn.setText("Dwarf");
        dwarfBtn.setPrefSize(250, 250);
        dwarfBtn.setLayoutX(x / 5 + 700);
        dwarfBtn.setLayoutY(y / 5);
        dwarfBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tuneNodes(x, y);
            }
        });
    }
    public void tuneOrcBtn(double x, double y){
        orcBtn.setVisible(true);
        orcBtn.setText("Orc");
        orcBtn.setPrefSize(250, 250);
        orcBtn.setLayoutX(x / 5 + 1050);
        orcBtn.setLayoutY(y / 5);
        orcBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tuneNodes(x, y);
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
    public void tuneChooseClassBtn(double x, double y){
        twoSwordsClassBtn.setText("Two Swords");
        twoSwordsClassBtn.setPrefSize(200, 200);
        twoSwordsClassBtn.setLayoutX(x/5 - 300);
        twoSwordsClassBtn.setLayoutY(y/5);
        twoSwordsClassBtn.setVisible(true);
        twoSwordsClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        swordAndshieldClassBtn.setText("Sword and shield");
        swordAndshieldClassBtn.setPrefSize(200, 200);
        swordAndshieldClassBtn.setLayoutX(x/5);
        swordAndshieldClassBtn.setLayoutY(y/5);
        swordAndshieldClassBtn.setVisible(true);
        swordAndshieldClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        twoHandedSwordClassBtn.setText("Two-handed sword");
        twoHandedSwordClassBtn.setPrefSize(200, 200);
        twoHandedSwordClassBtn.setLayoutX(x/5 + 300);
        twoHandedSwordClassBtn.setLayoutY(y/5);
        twoHandedSwordClassBtn.setVisible(true);
        twoHandedSwordClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        thiefClassBtn.setText("Thief");
        thiefClassBtn.setPrefSize(200, 200);
        thiefClassBtn.setLayoutX(x/5 + 600);
        thiefClassBtn.setLayoutY(y/5);
        thiefClassBtn.setVisible(true);
        thiefClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        damageMageClassBtn.setText("Damage mage");
        damageMageClassBtn.setPrefSize(200, 200);
        damageMageClassBtn.setLayoutX(x/5 + 900);
        damageMageClassBtn.setLayoutY(y/5);
        damageMageClassBtn.setVisible(true);
        damageMageClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        healMageClassBtn.setText("Heal mage");
        healMageClassBtn.setPrefSize(200, 200);
        healMageClassBtn.setLayoutX(x/5 + 1200);
        healMageClassBtn.setLayoutY(y/5);
        healMageClassBtn.setVisible(true);
        healMageClassBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setVisibles();
            }
        });

        chooseClassAndRaceLabel.setText("Choose class for first character");

        humanBtn.setVisible(false);
        humanDescription.setVisible(false);
        elfBtn.setVisible(false);
        elfDescription.setVisible(false);
        dwarfBtn.setVisible(false);
        dwarfDescription.setVisible(false);
        orcBtn.setVisible(false);
        orcDescription.setVisible(false);

    }
    public void tuneNodes(double x, double y){
        tuneChooseClassBtn(x, y);
        Hero hero = new Hero();
        hero.tuneStatsLbl(this, x, y);
    }
    public void setVisibles(){
        strengthplus.setVisible(true);
        enduranceplus.setVisible(true);
        agilityplus.setVisible(true);
        manaplus.setVisible(true);
        concentrationplus.setVisible(true);
        strengthLbl.setVisible(true);
        enduranceLbl.setVisible(true);
        agilityLbl.setVisible(true);
        manaLbl.setVisible(true);
        concentrationLbl.setVisible(true);
        chooseClassAndRaceLabel.setVisible(false);
        twoSwordsClassBtn.setVisible(false);
        swordAndshieldClassBtn.setVisible(false);
        twoHandedSwordClassBtn.setVisible(false);
        thiefClassBtn.setVisible(false);
        damageMageClassBtn.setVisible(false);
        healMageClassBtn.setVisible(false);
    }
    
}
