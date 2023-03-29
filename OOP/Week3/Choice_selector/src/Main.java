public class Main {
    public static void main(String[] args) {
        OptionSelector menu = new OptionSelector();

        menu.addOption(new Person("Hans"));
        menu.addOption(new Person("Pieter"));

        Person selectedPerson = menu.promptMenu();

        System.out.println("The person selected was: " + selectedPerson);

    }
}