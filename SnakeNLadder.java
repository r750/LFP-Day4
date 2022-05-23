public class SnakeNLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder game.");

        int start = 0;
        int Position = 0;
        int newP = 0;
        int winP = 100;
        int count = 0;

        while (Position <= winP) {
            int DieRolled = (int) (Math.random() * 6) + 1;
            int checkOption = (int) (Math.random() * 3);

            switch (checkOption) {
                case NO_PLAY:
                    newP = 0;
                    break;
                case LADDER:
                    newP = DieRolled;
                    break;
                case SNAKE:
                    newP = -DieRolled;
            }
            Position = Position + newP;
            if (Position < 0) {
                Position = 0;
            }
            if (Position > 100){
                Position = 0;
            }
            System.out.println("You are now at " + Position + "th" + " position");
        }
        System.out.println("after Die Rolled " + count+"position");
    }
}



          //  System.out.println("Welcome to Snake And Ladder game.");

            //int start=0;

