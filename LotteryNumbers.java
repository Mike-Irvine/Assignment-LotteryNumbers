import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int number;
    // Quantity of lottery numbers to be generated: 7
    private int length = 7;
    // Lottery numbers to be generated between 1 and 39
    private int drawRange = 39;
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        // Generate the required quantity of numbers
        while (i < length) {
            //return this.random.nextInt(this.drawRange)+1;
            this.number = this.random.nextInt(this.drawRange)+1;
            if (!containsNumber(this.number)) {
                this.numbers.add(this.number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
        return false;
        }
    }
}
