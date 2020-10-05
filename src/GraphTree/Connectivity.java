package GraphTree;

public class Connectivity<E> {

    Nodes<E> node;
    float value;

    public Connectivity(Nodes<E> node) 
    {
        this.node = node;
        value = 0;
    }
    public Connectivity(Nodes<E> node, Float value) 
    {
        this.node = node;
        this.value = value;
    }

    @Override
    public int hashCode() 
    {
        return node.hashCode();
    }
    @Override
    public boolean equals(Object arg0) 
    {
        return arg0.hashCode() == this.hashCode();
    }
}
