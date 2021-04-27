package utilities.FizzBuzzTree;

public class FizzBuzzTree {
    public  String game="";
    public  String fizzBuzz(Tree tree, Node node) {

        if (node !=null){
            if (((int)node.data % 15)==0){
                node.data = "FizzBuzz";
                game+=node.data +" - ";
            }
            else if (((int)node.data % 5)==0){
                node.data = "Buzz";
                game+=node.data +" - ";

            }
            else if (((int)node.data % 3)==0){
                node.data = "Fizz";
                game+=node.data +" - ";

            }else {
                game+=node.data +" - ";

            }
            if (tree.root.left!= null){
                fizzBuzz(tree, node.left);
            }

            if (tree.root.right!= null){
                fizzBuzz(tree, node.right);

            }
        }
        return game;
    }


}
