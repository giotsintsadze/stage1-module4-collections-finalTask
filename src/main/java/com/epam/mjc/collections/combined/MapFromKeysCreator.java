package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (String key : sourceMap.keySet()) {
            int keyLength = key.length();
            Set<String> valueSet = resultMap.computeIfAbsent(keyLength, k -> new HashSet<>());
            valueSet.add(key);
        }

        return resultMap;
    }
}
