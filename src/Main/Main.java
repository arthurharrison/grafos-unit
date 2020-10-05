//package Main;

import GraphTree.GraphTree;
import GraphTree.Nodes;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GraphTree<String> grafo = new GraphTree<>();
        Nodes<String> A = grafo.NodeInsertion("A");
        Nodes<String> B = grafo.NodeInsertion("B");
        Nodes<String> C = grafo.NodeInsertion("C");
        Nodes<String> D = grafo.NodeInsertion("D");
        Nodes<String> E = grafo.NodeInsertion("E");
        Nodes<String> F = grafo.NodeInsertion("F");
        grafo.orientedConnection(A, F);
        grafo.orientedConnection(A, B);
        grafo.orientedConnection(B, C);
        grafo.orientedConnection(C, D);
        grafo.orientedConnection(D, B);
        grafo.orientedConnection(D, E);
        grafo.orientedConnection(E, F);
    }
}
