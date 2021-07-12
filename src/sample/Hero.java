package sample;

public class Hero {
    int strength = 1;
    int endurance = 1;
    int agility = 1;
    int mana = 1;
    int concentration = 1;

    public void increaseStats(MainMenuAndPlaying mmap){

    }
    public void tuneStatsLbl(MainMenuAndPlaying mmap, double x, double y){
        mmap.strengthLbl.setText("Strength - " + strength);
        mmap.strengthLbl.setLayoutX(x/2);
        mmap.strengthLbl.setLayoutY(y/2 - 300);
        mmap.strengthplus.setText("+");
        mmap.strengthplus.setLayoutX(x/2 + 100);
        mmap.strengthplus.setLayoutY(y/2 - 300);
        mmap.enduranceLbl.setText("Endurance - " + endurance);
        mmap.enduranceLbl.setLayoutX(x/2);
        mmap.enduranceLbl.setLayoutY(y/2 - 250);
        mmap.enduranceplus.setText("+");
        mmap.enduranceplus.setLayoutX(x/2 + 100);
        mmap.enduranceplus.setLayoutY(y/2 - 250);
    }
}
