package com.example.duckhuntv3;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Duck extends Circle {
    Canvas canvasToDrawOn;
    float[] pos;
    float speed;
    boolean deadFlag = false;
    void draw(){
        DuckHuntGame.gameCanvas.getGraphicsContext2D().setFill(Color.CYAN);
        DuckHuntGame.gameCanvas.getGraphicsContext2D().fillRect(0,0,255*4,255*4);
        DuckHuntGame.gameCanvas.getGraphicsContext2D().setFill(Color.GREEN);
        DuckHuntGame.gameCanvas.getGraphicsContext2D().fillOval(this.pos[0],this.pos[1],32/0.25,32/0.25);
    }
    public Duck(){
        pos = new float[2];
        pos[0] = new Random().nextFloat(800-125,1000-125);
        pos[1] = new Random().nextFloat(100,125);
        speed = new Random().nextFloat(5/2,10/2);
        duckMovement.start();
    }



    Thread duckMovement = new Thread(new Runnable() {
        @Override
        public void run() {
            while (!deadFlag){
                draw();
                pos[0] = (pos[0]+speed)%(4*255);
                System.out.println(pos[0]);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (new Random().nextInt(1000) == 5){
                    if (speed>0)
                        speed = new Random().nextInt(-5,0);
                    else
                        speed = new Random().nextInt(0,5);
                }
            }




        }

    });
}
