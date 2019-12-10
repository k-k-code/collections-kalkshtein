package com.brunoyam.unit_8.utils;

import java.util.*;

public class CollectionsUtil {

    /* === УРОВЕНЬ 1 === */

    public void fillSet(Set<String> set) {
        //Заполните set переданный в качестве параметра
    }

    public void fillList(List<String> list) {
        //Заполните list переданный в качестве параметра
    }

    public void fillQueue(Queue<String> queue) {
        //Заполните queue переданный в качестве параметра
    }

    public void fillDeque(Deque<String> deque) {
        //Заполните deque переданный в качестве параметра
    }

    /* === УРОВЕНЬ 2 === */

    public <T> boolean equals(Collection<T> collection1, Collection<T> collection2) {
        // Если переданные коллекции содержат одни и те же элеметы, верните true,
        // если элементы внутри коллекций отличаются - верните false
        return false;
    }

    public <T> Collection<T> unite(Collection<T>... collections) {
        //Объедините все переданные в параметре коллекции в одну и верните ее.
        //Возвращенная коллекция должна содержать все элементы всех переданных в качестве параметра коллекций.
        return Collections.EMPTY_LIST;
    }

    public <T> Collection<T> retain(Collection<T>... collections) {
        //Вычислите и верните коллекцию, содержащую только общие для всех переданных коллекций элементы.
        //То есть в полученной коллекции должны быть только те элементы, которые присутствуют во ВСЕХ коллекциях,
        // переданных в параметре.
        return Collections.EMPTY_LIST;
    }

    public <T> Collection<T> removeAll(final Collection<T> baseCollection, Collection<T>... toRemove) {
        //Создайте и верните коллекцию, содержащую только те элементы baseCollection, которых нет ни в одной коллекции
        // из массива toRemove.
        return Collections.EMPTY_LIST;
    }

}
