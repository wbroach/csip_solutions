package csip.solutions.freshperson; 

public class SumDigits {

    public int sumDigits(int num) {
	int sum = 0; 
        
        while (num > 9) {
             
            while (num > 0) {
                sum += num % 10;
                num /= 10; 
            }
            
            num = sum;
            sum = 0; 

        }
        
        return num;
    }

}