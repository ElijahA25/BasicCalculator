public class Calculator {

    public Calculator(){


    }
    public double add(double a, double b){

        return a+b;

    }
    public double subtract(double a, double b){
        return a-b;

    }
    public double multiply(double a, double b){
        return a*b;


    }
    public double divide(double a, double b){
       return a/b;

    }
    public double square(int a){

        return a*a;


    }
    public double cube(int a){
        return a*a*a;


    }
    public double exponent(double num, int exponent){
        double answer=num;
        if(exponent!=0) {
            System.out.println("IM HERE");
            for (int i = 1; i < exponent; i++) {
                answer = answer * num;

            }
        }
        if(exponent == 0){
            answer = 1;

        }
        return answer;


    }


}
