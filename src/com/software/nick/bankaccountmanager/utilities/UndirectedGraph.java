package com.software.nick.bankaccountmanager.utilities;

import java.util.*;

public class UndirectedGraph {

    private Map<String, List<String>> vertexMap = new HashMap<>();

    public boolean hasVertex(String vertexName){
        return vertexMap.containsKey(vertexName);
    }

    public boolean hasEdge(String vertexName1, String vertexName2) {
        if (!hasVertex(vertexName1)) return false;
        List<String> edges = vertexMap.get(vertexName1);
        return Collections.binarySearch(edges, vertexName2) != -1;
    }

    public void addVertex(String vertexName){
        if(!hasVertex(vertexName)){
            vertexMap.put(vertexName, new ArrayList<String>());
        }
    }



}
