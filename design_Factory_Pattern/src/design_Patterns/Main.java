package design_Patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ItemFactory itemFactory = new ItemFactory();
        Item light = itemFactory.createItem("light");
        Item light2 = itemFactory.createItem("Light");
        Item paperRoll = itemFactory.createItem("paperRoll");
        Item cable = itemFactory.createItem("cable");

        System.out.println("light "+light.name()+" "+light.size());
        System.out.println("light2 "+light2.name()+" "+light2.size());
        System.out.println("paperRoll "+paperRoll.name()+" "+paperRoll.size());
        System.out.println("cable "+cable.name()+" "+cable.size());



    }
}
