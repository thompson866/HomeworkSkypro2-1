public class Main {
    public static void main(String[] args) {

        ///Задача 1 //
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2//
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3//
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        //Задача 4//
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5//
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6//
        System.out.println("Задача 6");

        var aBoxWeight = 78.2;
        var bBoxWeight = 82.7;
        System.out.println("Общий вес Боксеров " + (aBoxWeight + bBoxWeight) + " кг" );
        System.out.println("Разница весов " + (bBoxWeight - aBoxWeight) + " кг" );

        //Задача 7//
        System.out.println("Задача 7");


        System.out.println("Разница в весе бойцов (1 способ) " + (bBoxWeight - aBoxWeight) + " кг");
        System.out.println("Разница в весе бойцов (2 способ) " + (bBoxWeight % aBoxWeight) + " кг");

        //Задача 8//
        System.out.println("Задача 8");

        var hours = 640;
        var hoursDay = 8;
        var managers = hours / hoursDay;
        System.out.println("Всего работников в компании - " + managers + " человек.");
        managers = managers + 94;
        hours = managers * hoursDay;
        System.out.println("«Если в компании работает " + managers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками»");




    }
}