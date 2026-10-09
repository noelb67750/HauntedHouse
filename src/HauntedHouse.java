import org.junit.Test;

public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }

    public void refillCandyBowl(int amount) {
        if ( amount <= 0) {
        //  System.out.println("you cannot add negative candy to a bowl IDIOT");

        } else {
            candyCount += amount;
        }
    }

    public void trickOrTreat(int people){
        if(people < 0)
        {
            throw new IllegalArgumentException("people cannot be negative");
        }
        if(people > candyCount) {
        candyCount = 0;
        } else {
            candyCount = candyCount - people;
        }
        runningLow();
    }

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    public void runningLow() {
        if(candyCount == 0)
        {
          System.out.println("Candy count is running low!, replenishing 10!");
          refillCandyBowl(10);
        }
    }
    public void haunt() {
        ghostPresent = true;
    }

    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}

