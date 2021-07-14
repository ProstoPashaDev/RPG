package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Location {
    public ImageView spawnSpider(MainMenuAndPlaying mmap, double cordx, double cordy){
        ImageView spider = new ImageView(new Image("spider.jpg"));
        spider.setFitWidth(121);
        spider.setFitHeight(65);
        spider.setLayoutX(121*cordx);
        spider.setLayoutY(65*cordy);
        mmap.mobCordListStartLoc.add(121*cordx);
        mmap.mobCordListStartLoc.add(121*(cordx+1));
        mmap.mobCordListStartLoc.add(121*(cordx+2));
        mmap.mobCordListStartLoc.add(121*(cordx-1));
        mmap.mobCordListStartLoc.add(121*(cordx-2));
        mmap.mobCordListStartLoc.add(65*cordy);
        mmap.mobCordListStartLoc.add(65*(cordy+1));
        mmap.mobCordListStartLoc.add(65*(cordy+2));
        mmap.mobCordListStartLoc.add(65*(cordy-1));
        mmap.mobCordListStartLoc.add(65*(cordy-2));
        return spider;
    }
}
