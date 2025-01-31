package EdoMidali;

public class Pesce implements Preda, Predatore{
    @Override
    public void scappa() {
        System.out.println("Il pesce scappa via!");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce attacca!");
    }
}
