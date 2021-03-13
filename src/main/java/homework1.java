import org.w3c.dom.ls.LSOutput;

public class homework1 {


    public static void main(String[] args) {
        // задание1
        System.out.println(".......задание 1........");
        float task1;
        task1 = mathematic(10,15,20,60);
        System.out.println(task1);

        //задание2
        System.out.println(".......задание 2........");
        System.out.println(" " +isSumBetween(7,10));
        System.out.println(" " +isSumBetween(15,10));
        System.out.println(" " +isSumBetween(15,-10));

        // задание3
        System.out.println(".......задание 3........");
        isUpzero(666);
        isUpzero(-1000);
        isUpzero(0);
        //задание4
        System.out.println(".......задание 4........");
        String name = "geekbrains";
        privet(name);
        privet("Новая любимая работа");
        //задание5
        System.out.println(".......задание 5........");
        highgradeyear(5);
        highgradeyear(100);
        highgradeyear(400);
        highgradeyear(2000);


    }
    //задание 1     a * (b + (c / d))
     private static float mathematic(int a,int b,int c,int d) {
           // float result;
//            result = (1.0f*c/d);
//            result = result + b;
//            result = result * a;
            //result = a * (b + (1.0f*c/d));
        return a * (b + (1.0f*c/d));
    }

    //задание 2    сумма двух чисел в интервале между 10 и 20
      static boolean isSumBetween(int a,int b){
        int sum = a + b;
        if (sum>=10&&sum<=20) return true;
        else return false;
     }

     //задание 3   проверка целого числа на >=0
     static void isUpzero(int a) {
        if (a>=0) System.out.println("число " + a + " положительное");
        else System.out.println("число " + a + " отрицательное");

     }

     //задание 4     приветственный метод
    static void privet(String name) {
        System.out.println("Привет, " + name +"!");
    }

    //задание 5   определение высокосного года
    static void highgradeyear(int year){
        if (year%4==0) {
            if (year%100==0) {
                    if (year % 100 == 0 && year % 400 == 0) {
                        System.out.println("год высокосный (это каждый 400-й)");
                    }
                    if (year % 100 == 0 && year % 400 != 0) {
                        System.out.println("год не высокосный (каждый 100-й)");
                    }
            } else System.out.println("год высокосный, (не 100-й)");
        }else System.out.println("год не высокосный");


    }


}
