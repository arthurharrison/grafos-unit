package GraphTree;

import java.util.ArrayList;
import java.util.Collections;

public class Nodes<E> {
    ArrayList<Connectivity<E>> input;
    ArrayList<Connectivity<E>> output;
    int inputDegree;
    int outputDegree;
    E value;
    
    //Booleano que diz se o nó já foi visitado
    boolean seen;

    public Nodes(E value) 
    {
        this.input =   new ArrayList<>();
        this.output =     new ArrayList<>();
        this.value = value;
        this.inputDegree = 0;
        this.outputDegree = 0;
    }


    public void NodeRemoval(Nodes<E> node) 
    {
        output.removeAll(
            Collections.singleton(new Connectivity<>(node))
            );
    }

    void nodesConnection(Nodes<E> node) 
    {
        node.inputDegree++;
        outputDegree++;
        
        output.add(new Connectivity<>(node));
        node.input.add(new Connectivity<>(this));
    }
    void nodesConnection(Nodes<E> node, float value) 
    {
        node.inputDegree++;
        outputDegree++;
        
        output.add(new Connectivity<>(node, value));
        node.input.add(new Connectivity<>(this, value));
    }

    void orientedConnection(Nodes<E> node) 
    {
        node.inputDegree++;
        outputDegree++;
        
        nodesConnection(node);
        node.nodesConnection(this);
    }
    void orientedConnection(Nodes<E> node, float value) 
    {
        node.inputDegree++;
        outputDegree++;
        
        nodesConnection(node, value);
        node.nodesConnection(this, value);
    }

    void degreeReset () 
    {
        inputDegree  = output.size();
        outputDegree = input.size();
    }


    //Get & Set

    public ArrayList<Connectivity<E>> getInput() {
        return input;
    }
    public void setInput(ArrayList<Connectivity<E>> input) {
        this.input = input;
    }

    public ArrayList<Connectivity<E>> getOutput() {
        return output;
    }
    public void setOutput(ArrayList<Connectivity<E>> output) {
        this.output = output;
    }

    public E getValor() {
        return value;
    }
    public void setValor(E value) {
        this.value = value;
    }

    public int getInputDegree() {
        return inputDegree;
    }
    public int getOutputDegree() {
        return outputDegree;
    }

    public boolean isSeen() {
        return seen;
    }
    public void setSeen(boolean seen) {
        this.seen = seen;
    }

}
