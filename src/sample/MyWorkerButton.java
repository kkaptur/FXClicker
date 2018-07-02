package sample;

import javafx.scene.control.Button;

import static sample.Score.*;

public class MyWorkerButton extends Button {


    boolean buttonClicked;
    int workerIncome;
    int workerPrice;
    int numberCLicked;

    public MyWorkerButton(int workerPrice, int workerIncome) {
        super();
        numberCLicked = 0;
        this.buttonClicked = false;
        this.workerPrice = workerPrice;
        this.workerIncome = workerIncome;
        this.setText(Integer.toString(workerPrice) + "$");
        this.getStyleClass().add("WorkerButton");
    }


    @Override
    public void fire() {

        super.fire();
        if (!buttonClicked && score >= workerPrice) {
            if (workerIncome * 10 > workerPrice)
                this.getStyleClass().add("BestWorkerButtonClicked");
            else
                this.getStyleClass().add("WorkerButtonClicked");
            increaseIncome(workerIncome);
            decreaseScore(workerPrice);
            buttonClicked = true;
        }
    }

    public int getWorkerIncome() {
        return workerPrice;
    }

}