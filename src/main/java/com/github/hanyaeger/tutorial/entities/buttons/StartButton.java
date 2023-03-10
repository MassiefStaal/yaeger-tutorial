package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.geometry.Bounds;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends TextEntity implements MouseButtonPressedListener {
    private Waterworld waterworld;

    public StartButton(Coordinate2D initialLocation, Waterworld waterworld){
        super(initialLocation,"Play game");
        this.waterworld = waterworld;
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }


    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }

    @Override
    public void attachMousePressedListener() {
        MouseButtonPressedListener.super.attachMousePressedListener();
    }

    @Override
    public void setRotate(double degrees) {
        super.setRotate(degrees);
    }

    @Override
    public void beforeInitialize() {
        super.beforeInitialize();
    }

    @Override
    public Bounds getBoundingBox() {
        return super.getBoundingBox();
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
    public void notifyRemove() {
        super.notifyRemove();
    }

    @Override
    public double getSceneWidth() {
        return super.getSceneWidth();
    }

    @Override
    public double getSceneHeight() {
        return super.getSceneHeight();
    }
}
