package com.github.hanyaeger.tutorial;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.scenes.EndScene;
import com.github.hanyaeger.tutorial.scenes.GameLevel;
import com.github.hanyaeger.tutorial.scenes.TitleScene;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Waterworld extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Je oma");
        setSize(new Size(800,600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new GameLevel(this));
        addScene(2, new EndScene(this));

    }



}
