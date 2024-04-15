public class Overriding
{
	public static void main(String[] args) {
		Dog d1 = new Dog();
        d1.soundAnimal();

	}
}

class Animal{
    public void soundAnimal(){
        System.out.println("Animals can also speak");
    }
}
class Dog extends Animal{
    public void soundAnimal(){
        System.out.println("Dogs Bark");
    }
}