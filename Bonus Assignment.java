// Abdelrahmn mostafa
// 20216362

    public abstract class Animal {
        protected int legs;

        protected Animal(int legs) {
            this.legs = legs;
        }

        public abstract void eat();

        public void walk() {
            System.out.println("This animal walks on " + legs + " legs.");
        }
    }

--------------------------------------------------------------------------------
// Abdelrahmn mostafa
// 20216362

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider is eating.");
    }
}

---------------------------------------------------------------------------------
// Abdelrahmn mostafa
// 20216362

public interface Pet {
    void play();
    void beFriendly();
}

--------------------------------------------------------------------------------
// Abdelrahmn mostafa
// 20216362

    public class cat extends Animal implements Pet{
     private String name;
     public cat(String name){
         super(4);
         this.name=name;
     }
     public cat(){
         this("");}
        @Override
        public void eat() {
            System.out.println("The cat is eating.");
        }

        @Override
        public void play() {
            System.out.println("The cat is playing.");
        }

        @Override
        public void beFriendly() {
            System.out.println("The cat is being friendly.");
        }
    }

-------------------------------------------------------------------------------
// Abdelrahmn mostafa
// 20216362

public class Fish extends Animal {
    public Fish() {
        super(0); // Fish don't have legs
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating.");
    }


    @Override
    public void walk() {
        System.out.println("Fish cannot walk.");
    }
}

--------------------------------------------------------------------------------
// Abdelrahmn mostafa
// 20216362

    public class TestAnimals {
    public static void main(String[] args) {

        Fish fish = new Fish();
        cat cat = new cat("Whiskers");
        Spider spider = new Spider();

        fish.eat();
        cat.eat();
        cat.play();
        spider.eat();

        Animal animal1 = fish;
        Animal animal2 = cat;
        Animal animal3 = spider;

        animal1.walk();
        animal2.walk();
        animal3.walk();

        cat.eat();
        cat.walk();
    }
}
