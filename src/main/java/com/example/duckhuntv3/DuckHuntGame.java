package com.example.duckhuntv3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class DuckHuntGame extends Application {
    public static BorderPane mainBP = new BorderPane();
    public static Canvas gameCanvas = new Canvas(256*4, 240*4);





    @Override
    public void start(Stage stage){
        mainBP.setCenter(gameCanvas);
        Duck peter = new Duck();














        Scene scene = new Scene(mainBP, 256*4, 240*4);
        stage.setTitle("help me!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}