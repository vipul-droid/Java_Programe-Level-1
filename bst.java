import java.util.*;

public class bst {
    
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left = this.right = null;
        }
    }

    public static Node construction(int [] arr, int lo, int hi){
        if(lo>hi){
            return null;
        }
        
        int mid = (lo + hi)/2;

        int data = arr[mid];
        Node lc = construction(arr,0, mid-1);
        Node rc = construction(arr,mid+1, hi);

        Node node = new Node(data, lc, rc);
        return node;
    }

    public static void display(Node node){
        if(node==null){
            return;
        }

        String str = "";
        str +=node.left ==null ? "." : node.left.data + "";
        str += "<-" + node.data + "->";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(left);
        display(right);
    }

    public static void fun(){
        int [] data = {12,25,30,37,50,62,70,75,87};
        Node root = construction(data, 0, arr.length);
        display(root);
    }

    public static void main(Strings [] arg) {
        fun();
    }
}