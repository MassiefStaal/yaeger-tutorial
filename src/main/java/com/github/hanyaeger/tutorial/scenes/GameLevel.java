package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Swordfish;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.Cursor;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
        setBackgroundAudio("audio/waterworld.mp3");
    }

    @Override
    public void setupEntities() {
        var swordfish = new Swordfish(
                new Coordinate2D(getWidth() / 2, getHeight()/ 3 * 2)
        );
        var hanny = new Hanny(
                new Coordinate2D(getWidth() / 2, getHeight() /2)
        );
        addEntity(swordfish);
        addEntity(hanny);
    }

    @Override
    public void setCursor(Cursor cursor) {
        super.setCursor(cursor);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void beforeInitialize() {
        super.beforeInitialize();
    }
}
