package utilities.FizzBuzzTree;

import java.util.ArrayList;
import java.util.List;

public class Tree{

    public Node root;

    public Tree(){}

    public Tree(Node node){
        this.root =node;
    }



    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                "root=" + root.left +
                "root=" + root.right +
                '}';
    }
}