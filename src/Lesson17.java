public class Lesson17 {

    public static void main(String[] args) {
        System.out.println("Hello to lesson 17");

        Cat myCat = new Cat();

        myCat.setName("Sebastian");
        myCat.sleep();
        // Set age
        myCat.setAge(3);

        System.out.println("My cat's age is " + myCat.getAge());

        myCat.setAge(4);
        System.out.println("yay! it is my cat's birthday! he is now " + myCat.getAge() + " years old");


        Cat myNeighbourCat = new Cat("Puka", "Stray", "brown", true, 7);

        System.out.println(myNeighbourCat.toString());

    }
}
