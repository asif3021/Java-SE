public class Factorial {

    int fact(int number){
        if (number == 1){
            return number;
        }
        else {
            return number * fact(number-1);
        }
    }
}
