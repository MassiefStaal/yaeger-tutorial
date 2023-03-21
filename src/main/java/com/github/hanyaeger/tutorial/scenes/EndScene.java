package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.buttons.RestartButton;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EndScene extends StaticScene {

    private Waterworld waterworld;

    public EndScene(Waterworld waterworld){
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background3.jpg");
    }

    @Override
    public void setupEntities(){
        var waterworldButton = new RestartButton(
                new Coordinate2D(getWidth() / 2, getHeight()/ 3 * 2),
                waterworld
        );
        addEntity(waterworldButton);

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

