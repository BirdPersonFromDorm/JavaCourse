package JavaCourse.javaStarter.variables;

public class Main {
    public static void main(String[] args) {
        //003_Variables(Task 1)
        int x = 10, y =12, z = 3;

        x+=y-x++*z;
        System.out.println("x+=y-x++*z: " + x);
        z =--x-y*5;
        System.out.println("z=--x-y*5: " + z);
        y/=x+5%z;
        System.out.println("y/=x+5%z: " + y);
        z= x++ +y*5;
        System.out.println("z= x++ +y*5: " + z);
        x = y-x++ *z;
        System.out.println("x = y-x++ *z: " + x);

        //003_Variables (Task 5)

        //int uberflu? = 14;          //Данное имя для переменной нельзя использовать
        int  _Identifier = 14;      //Данное имя для переменной можно использовать
        //int  \u006fIdentifier = 14; //Данное имя для переменной нельзя использовать
        //int  &myVar = 14;           //Данное имя для переменной нельзя использовать
        int  myVariab1le = 14;      //Данное имя для переменной можно использовать

    }
}
