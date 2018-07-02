package sample;

import javafx.scene.layout.VBox;

public class RadomBox extends VBox {
    public RadomBox(){
        super();

        MyRoomHBox room1 = new MyRoomHBox(1,100);
        MyRoomHBox room2 = new MyRoomHBox(2,300);
        MyRoomHBox room3 = new MyRoomHBox(3,400);
        MyRoomHBox room4 = new MyRoomHBox(4,600);
        MyRoomHBox room5 = new MyRoomHBox(5,800);
        MyRoomHBox room6 = new MyRoomHBox(6,1000);

        this.getChildren().addAll(room1,room2,room3,room4,room5,room6);
    }
}
