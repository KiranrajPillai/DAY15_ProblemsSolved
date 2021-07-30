public class SearchBinaryTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public static boolean flag = false;

    public SearchBinaryTree(){
        root = null;
    }

    public void searchNode(Node temp, int value){
        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
        }
        else{
            if(temp.data == value){
                flag = true;
                return;
            }

            if(flag == false && temp.left != null){
                searchNode(temp.left, value);
            }

            if(flag == false && temp.right != null){
                searchNode(temp.right, value);
            }
        }
    }

    public static void main(String[] args) {

        SearchBinaryTree bt = new SearchBinaryTree();

        bt.root = new Node(56);
        bt.root.left = new Node(30);
        bt.root.right = new Node(70);

        bt.searchNode(bt.root, 70);

        if(flag)
            System.out.println("Element is present in the binary tree");
        else
            System.out.println("Element is not present in the binary tree");
    }
}