package com.brunoyam.unit_8.checkers;

import com.brunoyam.unit_8.factory.CollectionType;
import com.brunoyam.unit_8.factory.CollectionsFactory;
import com.brunoyam.unit_8.port.Port;
import com.brunoyam.unit_8.utils.CollectionsUtil;

import java.util.*;

public class CheckAssignment {

    public static boolean level1() {

        CollectionsFactory factory = new CollectionsFactory();
        CollectionsUtil collectionsUtil = new CollectionsUtil();

        Collection<String> stringSet = factory.getCollection(CollectionType.SET);
        if(!(stringSet instanceof Set)) return false;

        collectionsUtil.fillSet((Set<String>) stringSet);
        if(stringSet.isEmpty()) return false;

        Collection<String> stringList = factory.getCollection(CollectionType.LIST);
        if(!(stringList instanceof List)) return false;

        collectionsUtil.fillList((List<String>) stringList);
        if(stringList.isEmpty()) return false;

        Collection<String> stringQueue = factory.getCollection(CollectionType.QUEUE);
        if(!(stringQueue instanceof Queue)) return false;

        collectionsUtil.fillQueue((Queue<String>) stringQueue);
        if(stringQueue.isEmpty()) return false;

        Collection<String> stringDequeue = factory.getCollection(CollectionType.DEQUE);
        if(!(stringDequeue instanceof Deque)) return false;

        collectionsUtil.fillDeque((Deque<String>) stringDequeue);
        if(stringList.isEmpty()) return false;

        return true;
    }

    public static boolean level2() {

        Integer[] objs = new Integer[9];
        for(int i = 1; i <= objs.length; i++) {
            objs[i-1] = i;
        }

        CollectionsUtil collectionsUtil = new CollectionsUtil();

        Set<Integer> firstSet = new HashSet();
        firstSet.add(objs[0]);
        firstSet.add(objs[1]);
        firstSet.add(objs[2]);
        firstSet.add(objs[3]);
        firstSet.add(objs[4]);
        firstSet.add(objs[5]);
        Set<Integer> secondSet = new HashSet();
        secondSet.add(objs[4]);
        secondSet.add(objs[5]);
        secondSet.add(objs[6]);
        secondSet.add(objs[7]);

        if (collectionsUtil.equals(firstSet, secondSet)) return false;
        if (!collectionsUtil.equals(firstSet, firstSet)) return false;

        Set<Integer> thirdSet = new HashSet();
        thirdSet.add(objs[2]);
        thirdSet.add(objs[3]);
        thirdSet.add(objs[4]);
        thirdSet.add(objs[8]);

        Collection<Integer> unitedCollection = collectionsUtil.unite(firstSet, secondSet, thirdSet);

        if(unitedCollection.size() != 14) return false;


        Collection<Integer> retainedCollection = collectionsUtil.retain(firstSet, secondSet, thirdSet);

        if(retainedCollection.size() != 1) return false;


        Collection<Integer> removedCollection = collectionsUtil.removeAll(firstSet, secondSet, thirdSet);

        if(removedCollection.size() != 2) return false;


        return true;
    }

    public static boolean level3() {
        Port port = new Port();
        return port.openPort();
    }

}
