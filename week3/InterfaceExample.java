
interface SwimmingCreature {
    public void swim();
}

interface WalkingCreature {
    public void walk();
}

class Fish implements SwimmingCreature {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

class Platypus implements SwimmingCreature, WalkingCreature {

    @Override
    public void swim() {
        System.out.println("Platypus is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Platypus is walking");
    }
}

abstract class AmphibiousCreature implements WalkingCreature, SwimmingCreature {

}

class Tortoise extends AmphibiousCreature {
    @Override
    public void swim() {
        System.out.println("Tortoise is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Tortoise is walking");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Platypus platypus = new Platypus();
        platypus.swim();
        platypus.walk();

        WalkingCreature walkingPlatypus = platypus;
        walkingPlatypus.walk();
        // walkingPlatypus.swim(); -- compile error


        // AmphibiousCreature amphibiousCreature = new AmphibiousCreature(); --compile error
        AmphibiousCreature amphibiousCreature = new Tortoise();
        amphibiousCreature.swim();
        amphibiousCreature.walk();
    }

}
