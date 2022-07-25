package homeworkweek1;

import java.math.BigDecimal;

public class birthday {
	public static void main(String[] arg){
        int day = 365;

        double rate = 50;
        int sum_people = birth_paradox(day,rate);

        System.out.println("when there is "+day+" days");
        System.out.println("when there is "+sum_people+" days，the rate can be 50%");
    }

    public static int birth_paradox(double day,double rate){
       
        int sum_people;
        BigDecimal Pb = new BigDecimal(1);

        
        for (sum_people = 1; sum_people <= day+1 ; sum_people++){
            
            double Pa = ((day)-sum_people+1)/day;
           
            Pb = Pb.multiply(new BigDecimal(Pa)).setScale(200,BigDecimal.ROUND_HALF_UP);
            
            BigDecimal subtract = new BigDecimal(1).subtract(Pb);
            
            if (subtract.compareTo(new BigDecimal(rate/100))>=0){
                return sum_people;
            }
            
        }

        return sum_people;
    }


}
