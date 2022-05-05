package questions;

public class FizzBuzz {

    public String fizzBuzz(int num) {
        for (int i=1; i<=num; i++) {
            if (i%3==0 && i%5==0){
                return "FizzBuzz";
            }
            else if (i%3==0){
                return "Fizz";
            }
            else if (i%5==0){
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        }

        return null;
    }
}
