package advance;

// https://www.youtube.com/watch?v=4HC_WyBSDGA

public class LamdaCheck {

    public static void main(String[] args) {

        System.out.println("---------------no parameter----------------");
        LamdaCheckInterface obj = () -> {
            System.out.println("first line");
            System.out.println("Second line");
        };
        obj.show();
        obj.show();
        System.out.println("---------------two parameter,object call two times with diff parameter----------------");
        // mul paramater first object
        LamdaCheckInterfaceWithMulParms obj1 =(i,s)->{
            System.out.println("id of "+s+" is "+i);
        };
        obj1.play(1,"muthu");
        // mul paramater second object
        obj1.play(2,"serma");
    }
}
