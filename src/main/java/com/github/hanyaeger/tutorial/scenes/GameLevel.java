package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Swordfish;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import javafx.scene.Cursor;

import java.util.concurrent.TimeUnit;

public class GameLevel extends DynamicScene {

    private Waterworld waterworld;

    public GameLevel(Waterworld waterworld){
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
        setBackgroundAudio("audio/waterworld.mp3");
    }

    @Override
    public void setupEntities() {
        var swordfish = new Swordfish(
                new Coordinate2D(getWidth() / 2, getHeight() / 3 * 2)
        );
        var hannyHealth = new HealthText(
                new Coordinate2D(getWidth(), getHeight())
        );
        var hanny = new Hanny(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), hannyHealth, waterworld
        );
        addEntity(swordfish);
        addEntity(hanny);
        addEntity(hannyHealth);

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
