package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;
import javafx.scene.Cursor;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundImage("background2.jpg");
        setBackgroundAudio("waterworld.mp3");
    }

    @Override
    public void setupEntities() {

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
