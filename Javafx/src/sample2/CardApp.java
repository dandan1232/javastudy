package sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.applet.Applet;

import static javafx.application.Application.launch;

public class CardApp extends Application {
    @Override
    public void start(Stage primaryStage) throws  Exception{
        Parent root=
        FXMLLoader.load(getClass().getResource(("main.fxml")));
          primaryStage.setTitle("卡片布局效果");
          Scene scene=new Scene(root,1000,600);
          scene.getStylesheets().add(CardApp.class.getResource("style.css").toExternalForm());
          primaryStage.setScene(scene);
          primaryStage.show();
    }
    public static  void main(String[]args){
        launch(args);
    }
}
