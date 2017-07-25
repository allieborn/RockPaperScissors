import java.util.Random;

public class Robo extends Players {


    @Override
    public void name(String name) {
        System.out.println("Mr. Robot");
    }

    @Override
    public void result() {

    }

    public String result2(){
        String roboResult = " ";
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        if (n == 1) {
            roboResult.equals("rock");
            System.out.println("rock");
        } else if (n == 2) {
            roboResult.equals("paper");
            System.out.println("paper");
        } else if (n == 3) {
            roboResult.equals("scissors");
            System.out.println("scissors");
        } return roboResult;
    }

}
