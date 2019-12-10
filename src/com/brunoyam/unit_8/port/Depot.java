package com.brunoyam.unit_8.port;

import java.util.LinkedList;
import java.util.Queue;

// Склад
class Depot {

    //Определите переменную containers подходящего типа, хранящую коллекцию контейнеров
    //private /*тип переменной*/ containers

    void addContainer(Container container) {
        //Добавьте переданный контейнер container в коллекцию containers
    }

    boolean hasContainers() {
        // Верните true если коллекция containers содержит хотя бы один элемент
        //В противном случае верните false.
        return false;
    }

    Container observeContainer() {
        //Верните ссылку на следующий контейнер не удаляя его из коллекции containers
        return null;
    }

    Container takeContainer() {
        //Верните ссылку на следующий контейнер и удалите его из коллекции containers
        return null;
    }

}
