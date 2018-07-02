package sample;

import javafx.scene.layout.VBox;

public class RzymBox extends VBox {
    public RzymBox(){

        super();

        MyRoomHBox room1 = new MyRoomHBox(1,100);
        MyRoomHBox room2 = new MyRoomHBox(5,500);
        MyRoomHBox room3 = new MyRoomHBox(6,700);
        MyRoomHBox room4 = new MyRoomHBox(9,900);
        MyRoomHBox room5 = new MyRoomHBox(11,1200);
        MyRoomHBox room6 = new MyRoomHBox(19,2000);

        this.getChildren().addAll(room1,room2,room3,room4,room5,room6);

    }
}
