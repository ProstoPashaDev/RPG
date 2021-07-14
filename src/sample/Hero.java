package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Hero {
    int hp = 70;
    int currenthp = 70;
    int damage = 10;
    int strength = 1;
    int endurance = 1;
    int agility = 1;
    int mana = 1;
    int concentration = 1;

    public void tuneStatsLbl(MainMenuAndPlaying mmap, Main main, double x, double y){
        mmap.strengthLbl.setText("Strength - " + strength);
        mmap.strengthLbl.setLayoutX(x/2);
        mmap.strengthLbl.setLayoutY(y/2 - 300);
        mmap.strengthplus.setText("+");
        mmap.strengthplus.setLayoutX(x/2 + 115);
        mmap.strengthplus.setLayoutY(y/2 - 300);
        mmap.strengthplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mmap.skillPoint >=1) {
                    strength++;
                    mmap.strengthLbl.setText("Strength - " + strength);
                    checkForQuantityOfSkillPoints1(mmap, main, x, y);
                }
            }
        });
        mmap.enduranceLbl.setText("Endurance - " + endurance);
        mmap.enduranceLbl.setLayoutX(x/2);
        mmap.enduranceLbl.setLayoutY(y/2 - 250);
        mmap.enduranceplus.setText("+");
        mmap.enduranceplus.setLayoutX(x/2 + 115);
        mmap.enduranceplus.setLayoutY(y/2 - 250);
        mmap.enduranceplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mmap.skillPoint >=1) {
                    endurance++;
                    mmap.enduranceLbl.setText("Endurance - " + endurance);
                    checkForQuantityOfSkillPoints1(mmap, main, x, y);
                    hp = 70 + 30 * endurance;
                    currenthp = hp;
                }
            }
        });
        mmap.agilityLbl.setText("Agility - " + agility);
        mmap.agilityLbl.setLayoutX(x/2);
        mmap.agilityLbl.setLayoutY(y/2 - 200);
        mmap.agilityplus.setText("+");
        mmap.agilityplus.setLayoutX(x/2 + 115);
        mmap.agilityplus.setLayoutY(y/2 - 200);
        mmap.agilityplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mmap.skillPoint >=1) {
                    agility++;
                    mmap.agilityLbl.setText("Agility - " + agility);
                    checkForQuantityOfSkillPoints1(mmap, main, x, y);
                }
            }
        });
        mmap.manaLbl.setText("Mana - " + mana);
        mmap.manaLbl.setLayoutX(x/2);
        mmap.manaLbl.setLayoutY(y/2 - 150);
        mmap.manaplus.setText("+");
        mmap.manaplus.setLayoutX(x/2 + 115);
        mmap.manaplus.setLayoutY(y/2 - 150);
        mmap.manaplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mmap.skillPoint >=1) {
                    mana++;
                    mmap.manaLbl.setText("Mana - " + mana);
                    checkForQuantityOfSkillPoints1(mmap, main, x, y);
                }
            }
        });
        mmap.concentrationLbl.setText("Concentration - " + concentration);
        mmap.concentrationLbl.setLayoutX(x/2);
        mmap.concentrationLbl.setLayoutY(y/2 - 100);
        mmap.concentrationplus.setText("+");
        mmap.concentrationplus.setLayoutX(x/2 + 115);
        mmap.concentrationplus.setLayoutY(y/2 - 100);
        mmap.concentrationplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mmap.skillPoint >=1){
                    concentration++;
                    mmap.concentrationLbl.setText("Concentration - " + concentration);
                    checkForQuantityOfSkillPoints1(mmap, main, x, y);
                }
            }
        });
        mmap.currentSkillPointLabel.setText("Skill point - " + mmap.skillPoint);
        mmap.currentSkillPointLabel.setLayoutX(x/2);
        mmap.currentSkillPointLabel.setLayoutY(y/2 - 400);
    }
    public void setCurrentSkillPoints1(MainMenuAndPlaying mmap){
        mmap.skillPoint--;
        mmap.currentSkillPointLabel.setText("Skill point - " + mmap.skillPoint);
    }
    public void checkForQuantityOfSkillPoints1(MainMenuAndPlaying mmap, Main main, double x, double y) {
        setCurrentSkillPoints1(mmap);
        if (mmap.skillPoint == 0) {
            main.stage.setScene(main.sceneChooseRace);
            mmap.skillPoint = 2;
            mmap.quantityOfHeroes++;
            if (mmap.quantityOfHeroes == 4) {
                main.stage.setScene(main.sceneStartLoc);
                mmap.tuneHeroesImage(main, x, y);
                mmap.spawnMobsInStartLoc(main, x, y);
            }
        }
    }
}
