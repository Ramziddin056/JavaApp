public class Main {  // public final class Main {  - то этот класс не может иметь наследников из-за final ...git

    public static void main(String[] args){

        final float pi = 3.14f; //костанта, нельзя менять
        Person.write("Shermatov");
        Person.summ = 1999; // Меняя static переменные, меняем не для одного объекта а для всего класса
        System.out.println(Person.summ);

        Person Max = new Person(180, 78.4f);
        //Max.height = 180;
        //Max.weight = 74.8f;
        Max.say("Hi, I'm Max. My height is: ");
        System.out.println(Max.height);

        Person Ivan = new Person ();
        Ivan.height = 190;
        Max.say("Hi, I'm Ivan. My height is: ");
        System.out.println(Ivan.height);

        Student Ramzi = new Student(178, 65.5f, 3);
        Ramzi.say("Hi, I'm Ramziddin");

        /*int [] arr = new int [] {56,489, 325};
        int [] [] arr2 = new int [] [] {
                {23, 78, 65, 78},
                {23, 55, 65, 78},
                {23, 78, 65, 78}
        };
        */

        //arr2[1][1] = 234;
        //System.out.print(arr2[1][1]);

        /*for (int i = 0; i < 3; i ++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr2[i][j] + "    ");

            }
            System.out.println(" ");

        }
         */
        //  arr[0] = 23;
        //  arr[2] = 657;

       /* for(int i = 0; i < 4; i++){
            System.out.println ("Element " + i + " is " + arr[1]);

        }
       */
        //  System.out.print(arr[1]);

        /*int temp = func(23,74);
        System.out.print("Result is: " + temp);
        */
    }

    /*public static int func(int a, int b) {
        int res;
        res = a + b;
        //System.out.print("Result is: " + res);
        return res;
    }
    */
}

