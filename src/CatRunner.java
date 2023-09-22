public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bubbles", 2, 4.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Monster", 8, 6.5);
        cat2.introduce();
        cat2.printCatInfo();
}
    }
