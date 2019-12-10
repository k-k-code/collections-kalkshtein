package com.brunoyam.unit_8.port;

//Порт
public class Port {

    private final Depot depot = new Depot();
    private final Crane crane = new Crane();
    private final Sluice sluice = new Sluice();

    public boolean openPort() {
        fillDepot();
        openSluice();

        while (sluice.hasNextScow() && depot.hasContainers()) {
            Scow scow = sluice.getNextScow();
            crane.uploadScow(depot, scow);
            System.out.println(scow.getName());
        }

        return !depot.hasContainers() && sluice.hasNextScow();

    }

    private void fillDepot() {
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(10));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(15));
        depot.addContainer(new Container(10));
    }

    private void openSluice() {
        sluice.addScow(new Scow("Queen Elizabeth", 30));
        sluice.addScow(new Scow("Maria", 35));
        sluice.addScow(new Scow("Izabella", 30));
        sluice.addScow(new Scow("Elionore", 25));
        sluice.addScow(new Scow("Princess Olga", 25));
        sluice.addScow(new Scow("Countess Anna", 30));
        sluice.addScow(new Scow("Unsinkable", 20));
        sluice.addScow(new Scow("Queen Agness", 20));
    }

}
