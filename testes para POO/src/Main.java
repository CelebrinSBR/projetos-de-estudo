public class Main {
    public static void main(String[] args) {
        var male = new person();
        male.name = "João";
        male.age = 12;
        var female = new person();
        female.name = "Maria";
        female.age = 10;
        System.out.println(male.name + male.age);
        System.out.println(female.name + female.age);
    }
}