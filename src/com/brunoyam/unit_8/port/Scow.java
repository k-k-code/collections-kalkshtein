package com.brunoyam.unit_8.port;

//Баржа
class Scow {

    private String name;
    private int capacity; //Грузоподъемность
    private int uploaded = 0; //Вес уже погруженных контейнеров

    Scow(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    String getName() {
        return name;
    }

    int getCapacity() {
        return capacity;
    }

    int getUploaded() {
        return uploaded;
    }

    //Метод иммитирует погрузку контейнера на баржу.
    void upload(Container container) {
        //Вес уже погруженных контейнеров (uploaded) должен увеличиваться на вес переданного в параметре контейнера.
    }

}
