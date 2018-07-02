package sample;

import javafx.scene.layout.VBox;

public class TokioBox extends VBox{
    public TokioBox(){
        super();

        MyRoomHBox room1 = new MyRoomHBox(5,500);
        MyRoomHBox room2 = new MyRoomHBox(6,700);
        MyRoomHBox room3 = new MyRoomHBox(8,800);
        MyRoomHBox room4 = new MyRoomHBox(10,1000);
        MyRoomHBox room5 = new MyRoomHBox(12,1400);
        MyRoomHBox room6 = new MyRoomHBox(15,1700);

        this.getChildren().addAll(room1,room2,room3,room4,room5,room6);
    }
}
