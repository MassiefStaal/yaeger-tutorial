package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.buttons.RestartButton;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;

public class EndScene extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background3.jpg");
    }

    @Override
    public void setupEntities() {
        var waterworldButton = new RestartButton(
                new Coordinate2D(getWidth() / 2, getHeight()/ 3 * 2),
                waterworld
        );
    }
}
