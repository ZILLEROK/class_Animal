public class Zoo {
    public static void main(String[] args) {
    Wolf koba = new Wolf(1, "lol", 15, 165);
        koba.sleep();
        koba.eat();
        koba.voice();
        koba.move();
    }
}
    class Animal {
        int age;
        String name;
    public Animal(int age, String name) {
            this.age = age;
            this.name = name;
        }

        void voice(){}
        void sleep(){
            System.out.println("Лёжа");
        }
        void move(){
            System.out.println("Бегают");
        }
}
        interface Eat {
           void eat();
        }

        class Grass_feeding extends Animal implements Eat{
            int weight;
            int height;
            public void voice(){
                System.out.println("Wee-wee");
            }
            public Grass_feeding(int age, String name, int weight, int height) {
                super(age, name);
                this.weight = weight;
                this.height = height;
            }

            public void eat(){
                System.out.println("Едят траву");
            }
        }
        class Rabbit extends  Grass_feeding implements Eat{
            public Rabbit(int age, String name, int weight, int height) {
                super(age, name, weight, height);
            }
            public void voice(){
                System.out.println("AAAa");
            }
            public void move(){
                System.out.println("Прыгают");
            }
            public void eat() {
                System.out.println("Едят морковь");
            }
        }
        class Gazelle extends Grass_feeding implements Eat{
            public Gazelle(int age, String name, int weight, int height) {
                super(age, name, weight, height);
            }
            public void voice(){
                System.out.println("YYYYYY");
            }
            public void move(){
                System.out.println("Скачут");
            }
            public void eat() {
                System.out.println("Едят листья");
            }
        }
         class Predators extends Animal implements Eat{
            int weight;
            int height;
             public Predators(int age, String name, int weight, int height) {
                 super(age, name);
                 this.weight = weight;
                 this.height = height;
             }
             public void move(){
                 System.out.println("Бегают");
             }
             public void voice(){
                 System.out.println("РРРР");
             }
             public void eat() {
                 System.out.println("Едят других животных");
             }
         }
         class Wolf extends Predators implements Eat{
             public Wolf(int age, String name, int weight, int height) {
                 super(age, name, weight, height);
             }
         }
        class Fox extends Predators implements Eat{
            public Fox(int age, String name, int weight, int height) {
                super(age, name, weight, height);
             }
        }
        class Omnivores extends Animal implements Eat{
            int weight;
            int height;
            public Omnivores(int age, String name, int weight, int height) {
                super(age, name);
                this.height=height;
                this.weight=weight;
            }
            public void eat() {
                System.out.println("Едят всё");
            }
        }
        class Bear extends Omnivores implements Eat{
            public Bear(int age, String name, int weight, int height) {
                super(age, name, weight, height);
            }
        }

