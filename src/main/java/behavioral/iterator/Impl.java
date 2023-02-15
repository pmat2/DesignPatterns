package behavioral.iterator;

import java.util.List;

public class Impl {

    public void iterate(){
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        DepthFirstIterator<Integer> dfs = new DepthFirstIterator<>(v0);
        while (dfs.hasNext()) {
            System.out.println(dfs.getNext());
        }
    }
}
