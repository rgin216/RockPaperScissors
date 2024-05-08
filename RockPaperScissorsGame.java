package secondhalf.Revision;
public class RockPaperScissorsGame {

    private void printReady() {
      System.out.print("Ready?");
      try {
        Thread.sleep(50);
        for (int i = 1; i <= 3; i++) {
          System.out.print(i);
          Thread.sleep(50);
          for (int k = 0; k < 5; k++) {
            System.out.print(".");
            Thread.sleep(50);
          }
        }
        System.out.println("GO!");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  
    public void play() {
  
      String res;
      Human human = new Human();
      CPU cpu = new CPU();
      do {
        // printReady();
        // get result
        Action humanHand = human.play();
        Action cpuHand = cpu.play();
        System.out.println("human: " + humanHand.toString() + " cpu: " + cpuHand.toString());
        System.out.println("Do you want to play again?");
        res = Utils.scanner.next();
        while (!res.equals("yes") && !res.equals("no")) {
          System.out.println("Wrong input! please type either \"yes\" or \"no\"");
          res = Utils.scanner.next();
        }
      } while (res.equals("yes"));
      Utils.scanner.close();
    }
  }
  