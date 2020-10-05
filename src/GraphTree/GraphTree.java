package GraphTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class GraphTree<E> {
    public ArrayList<Nodes<E>> nodes;

    public GraphTree() 
    {
        nodes = new ArrayList<>();
    }

    //Inserir um novo nó ao grafo
    public Nodes<E> NodeInsertion(E value) 
    {
        Nodes<E> node = new Nodes<E>(value);
        nodes.add(node);
        return node;
    }

    public void connection(Nodes<E> nodeA, Nodes<E> nodeB) 
    {
        nodeA.nodesConnection(nodeB);
    }
    public void connection(Nodes<E> nodeA, Nodes<E> nodeB, float value) 
    {
        nodeA.nodesConnection(nodeB, value);
    }

    public void orientedConnection(Nodes<E> nodeA, Nodes<E> nodeB) 
    {
        nodeA.orientedConnection(nodeB);
    }
    public void orientedConnection(Nodes<E> nodeA, Nodes<E> nodeB, float value) 
    {
        nodeA.orientedConnection(nodeB, value);
    }

    public void NodeRemoval(Nodes<E> node) 
    {
        nodes.remove(node);

        for (Nodes<E> n : nodes) {
            n.NodeRemoval(node);
        }
    }
}
