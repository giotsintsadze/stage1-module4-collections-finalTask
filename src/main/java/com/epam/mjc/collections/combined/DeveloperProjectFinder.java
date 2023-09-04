package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(developer))
                .sorted((entry1, entry2) -> {
                    int nameLengthComparison = Integer.compare(
                            entry2.getKey().length(), entry1.getKey().length());
                    if (nameLengthComparison != 0) {
                        return nameLengthComparison;
                    } else {
                        return entry2.getKey().compareTo(entry1.getKey());
                    }
                })
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
