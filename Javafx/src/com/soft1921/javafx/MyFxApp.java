package com.soft1921.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MyFxApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX Application");
        Label label =new Label("My First JavaFX Application");
        Scene scene=new Scene(label, 600,  400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args){
        Application.launch(args);
    }
}
