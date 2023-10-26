import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(10, "Жужа", 5, "Миау", 5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Butus");
        kotik2.setMeow("Миааау");
        kotik2.setPrettiness(10);
        kotik2.setWeight(8);
        System.out.println();
        kotik1.getSatiety();
        kotik1.liveAnotherDay();
        kotik1.getSatiety();
        System.out.println(Kotik.currentCreatedKotik);
        System.out.println(kotik1);
        System.out.println(kotik2);
        System.out.println(kotik1.getMeow().equals(kotik2.getMeow()));

    }
}
