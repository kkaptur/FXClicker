package sample;

public  class Score  {
    static int score;
    static int income;

    public  Score() {
        score=300;
        income=0;
    }

    public static void increaseIncome(int increasedIncome){
       income+=increasedIncome;
    }

    public static String getScore(){
        return Integer.toString(score) + "$";
    }

    public static void decreaseScore(int price){
        score-=price;
    }


}
