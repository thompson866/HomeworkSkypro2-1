public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(cat);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var aBoxWeight = 78.2;
        var bBoxWeight = 82.7;
        var overallBox = aBoxWeight + bBoxWeight;
        System.out.println("Общий вес Боксеров " + overallBox + " кг" );
        System.out.println("Разница в весе бойцов " + (bBoxWeight - aBoxWeight) + " кг");



    }
}