package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import static sample.Score.score;

public class MyRoomHBox extends HBox {

    int roomPrice;
    Button buyRoomButton = new Button(Integer.toString(roomPrice));
    MyWorkerButton roomScoreButton = new MyWorkerButton(10000000, 0);
    int roomIncome;
    ArrayList<MyWorkerButton> buttonList;


    public MyRoomHBox(int weigth, int roomPrice) {
        super();
        //locked layout
        getStyleClass().add("RoomLocked");
        this.roomPrice = roomPrice;

        buyRoomButton.setText(Integer.toString(roomPrice) + "$");
        buyRoomButton.getStyleClass().add("RoomPriceButton");
        this.getChildren().addAll(buyRoomButton);


        //unlocked layout
        int workerPrice = weigth * 150;
        int workerIncome = weigth * 14;
        int bestWorkerPrice = weigth * 200;
        int bestWorkerIncome = weigth * 25;

        buttonList = new ArrayList();
        buttonList.add(new MyWorkerButton(workerPrice, workerIncome));
        buttonList.add(new MyWorkerButton(workerPrice, workerIncome));
        buttonList.add(new MyWorkerButton(workerPrice, workerIncome));
        buttonList.add(new MyWorkerButton(workerPrice, workerIncome));
        buttonList.add(new MyWorkerButton(bestWorkerPrice, bestWorkerIncome));
        buttonList.add(roomScoreButton);

        roomScoreButton.getStyleClass().add("ScoreRoomButton");
        roomScoreButton.setText(Integer.toString(roomIncome) + "$/s");

        //unlocking
        buyRoomButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (score >= roomPrice) {
                    score -= roomPrice;
                    getChildren().remove(buyRoomButton);
                    getChildren().addAll(buttonList);
                    getStyleClass().add("RoomUnlocked");

                }
            }
        });


        //displaying income for 1 room
        for (MyWorkerButton button : buttonList
                ) {
            button.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent event) {
                    if (!button.buttonClicked && score >= button.workerPrice) {
                        roomIncome += button.workerIncome;
                        roomScoreButton.setText(Integer.toString(roomIncome) + "$/s");
                    }
                }
            });
        }

    }
}