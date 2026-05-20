package Eksamen_2025;

public class Restaurantbesøk implements Runnable {
    Monitor restaurant;
    Gjestegruppe gjesteGruppe;

    public Restaurantbesøk(Restaurant r, Gjestegruppe gruppe) {
        restaurant = r;
        gjesteGruppe = gruppe;
    }   

    @Override
    public void run() {
        try {
            restaurant.taIMotGjester(gruppe);
            Thread.sleep(5000); // La gjestene spise i 5 sekunder
            restuarant.forlatBordet();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.exit(1);
        } 
    }
}
