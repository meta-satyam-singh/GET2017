import java.util.ArrayList;
@SuppressWarnings("rawtypes")
class Node <E>
{
    E key;
   
	Node left, right;
 
    public Node(E item)
    {
        key = item;
        left = right = null;
    }
}
@SuppressWarnings("rawtypes")
class BinaryTree<E>
{
    Node root;
    Node root1;
    BinaryTree()
    {
        root = null;
        root1=null;
    }
    ArrayList<Object> printPostorder(Node node , ArrayList<Object> treePostOder )
    {
        if (node == null)
            return null;
       
        printPostorder(node.left,treePostOder);
        printPostorder(node.right,treePostOder);
        //System.out.print(node.key + " ");
        treePostOder.add(node.key);
        return treePostOder;
    }
    
    boolean areMirror(Node tree1, Node tree2) 
    {
        if (tree1 == null && tree2 == null)
            return true;
        if (tree1 == null || tree2 == null) 
            return false;
        return tree1.key == tree2.key
                && areMirror(tree1.left, tree2.right)
                && areMirror(tree1.right, tree2.left);
    }
    ArrayList<Object> printPreorder(Node node,ArrayList<Object> testPreOder)
    {
        if (node == null)
            return null;
        testPreOder.add(node.key);
        printPreorder(node.left, testPreOder);
        printPreorder(node.right,testPreOder);
        return testPreOder;
    }
    ArrayList<Object> printPostorder( ArrayList<Object>treePostOder)  
    {     
    	printPostorder(root,treePostOder);  
    	return treePostOder;
    }

    ArrayList<Object> printPreorder(ArrayList<Object> testPreOder)   
    {     
    	printPreorder(root,testPreOder);
    	return testPreOder;  
	}
 
    ArrayList<Object> printPostorderroot1(ArrayList<Object>treePostOder)  
    {     
    	printPostorder(root1,treePostOder);  
    	return treePostOder;
    }

    ArrayList<Object> printPreorderroot1(ArrayList<Object> testPreOder)   
    {     
    	printPreorder(root1,testPreOder);
    	return testPreOder;  
	}
    @SuppressWarnings("unchecked")
	public static void main(String[] args)
    {
		BinaryTree tree = new BinaryTree();
        Object[] arr = {1,2,3,4,5,null,null};
        Object [] arr1 = {1,3,2,null,null,5,4};
        tree.root1 = treeCreate(arr,0);
        tree.root = treeCreate(arr1,0);
        ArrayList<Object> testPreOder = new ArrayList<Object>();
        ArrayList<Object> testPostOder = new ArrayList<Object>();
        if(tree.areMirror(tree.root1,tree.root))
        	System.out.println("mirror  binary tree  ");
        System.out.println("Preorder traversal of binary tree is ");
        testPreOder =  tree.printPreorder(testPreOder);
        for(Object t : testPreOder)
        	System.out.print(t+" ");
        System.out.println();
        System.out.println("Postorder traversal of binary tree is ");
        testPostOder = tree.printPostorder(testPostOder);
        for(Object t : testPostOder)
        	System.out.print(t+" ");
        System.out.println();
        
        System.out.println("Preorder traversal of binary tree is ");
        ArrayList<Object> testPreOder1 = new ArrayList<Object>();
        testPreOder1 =  tree.printPreorderroot1(testPreOder1);
        for(Object t : testPreOder1)
        	System.out.print(t+" ");
        System.out.println();
        
        System.out.println("Postorder traversal of binary tree is ");
        ArrayList<Object> testPostOder2 = new ArrayList<Object>();
        testPostOder2 = tree.printPostorderroot1(testPostOder2);
        for(Object t : testPostOder2)
        	System.out.print(t+" ");
        System.out.println();
    }
    @SuppressWarnings("unchecked")
	private static Node treeCreate(Object arr[], int i)
    {
    	Node temp = new Node(arr[i]);
    	int leftOftree = i*2 + 1;
    	int rightOfTree = i*2 + 2 ;
    	if( leftOftree < arr.length)
    	{
    		temp.left = treeCreate(arr, leftOftree);
    	}
    	if( rightOfTree < arr.length )
    	{
    		temp.right = treeCreate(arr, rightOfTree);
    	}	
		return temp;
    }
}


