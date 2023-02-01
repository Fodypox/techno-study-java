package unit10.abstractclassandinterface.day40.interfaceintro;

public class GameStation {
    public static void main(String[] args) {
        FifaWorldCup2022 fifaGame = new FifaWorldCup2022();
        fifaGame.squareButton();
        fifaGame.triangleButton();
        fifaGame.circleButton();
        fifaGame.xButton();
        NBA2K23 nba = new NBA2K23();
        nba.circleButton();
        nba.triangleButton();
        nba.squareButton();
        nba.xButton();
    }
}
