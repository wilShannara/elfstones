package fletch.chess.game;


public class ChessGame {

    private String myState;

    public static void main(String... args){
        ChessGame game = new ChessGame();
        game.myState = "dslkjdsfljk";

        ChessGame game2 = new ChessGame();
        game2.myState = "something";

        ChessGame game3 = new ChessGame();
        game3.myState = "somethingElse";

        game.doBobStuff();
        game2.doBobStuff();
        game3.doBobStuff();



        game.doBobStufff("dsflkjfsd");
        game.doBobStuff();
    }

    private void doBobStufff(String bob){

    }

    private void doBobStuff(){
        System.out.println(myState);
    }

    private  String bob(){
         return "Bob";
    }

    private  void bob2(){

    }
}
