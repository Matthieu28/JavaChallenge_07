public class Hangar {
    public static void main(String[] arg) {
        Car clio = new Car("clio", 1122225);
        Boat titanic = new Boat("Titanic", 426251);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
