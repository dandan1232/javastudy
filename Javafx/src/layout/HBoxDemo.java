package layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

/*水平布局demo
* */
public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox 布局练习");
        HBox hBox=new HBox();
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(50,50,50,50));
        for(int i=1;i<=10;i++){
            Button button=new Button("按钮"+i);
            hBox.getChildren().add(button);
        }
        /*
        Button button1 = new Button("按钮1");
        Button button2=new Button("按钮2");
        Button button3=new Button("按钮3");
        HBox hBox=new HBox(button1,button2,button3);
         */


        Scene scene= new Scene(hBox,800,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static  void  main(String[]args){
        Application.launch(args);
    }
}
