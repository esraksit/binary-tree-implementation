;

public class Tree {
	
	
	private static void Preorder (BTNode root) {
		if(root==null) return;
		System.out.print(root.data+"->");
		Inorder(root.lchild);		
		Inorder(root.rchild);
	}
	
	private static void Inorder (BTNode root) {
		if(root==null) return;
		Inorder(root.lchild);
		System.out.print(root.data+"->");
		Inorder(root.rchild);
		
	}
	private static boolean  Postorder (BTNode root) {
		
		if(root==null) return false;
		Inorder(root.lchild);	
		Inorder(root.rchild);
		System.out.print(root.data+"->");
		return true;
	}
	
	private static void Levelorder (BTNode root) {
		

		if(root==null) return ;
		Inorder(root.lchild);	
		Inorder(root.rchild);
		System.out.print(root.data+"->");
		return ; 
		
	}
	
	
	private static int countNode1(BTNode root) {
		return countNode1(root);
	}
	
	private static int countNode(BTNode root) {
		if(root==null) return 0;
		return countNode1(root.lchild)+countNode1(root.rchild)+1;
	}
	 
	
		
	public static void main (String[] args) {      
				
		BTNode root=new BTNode(9);		
		root.lchild=new BTNode(4);
		root.rchild=new BTNode(5);
		root.lchild.lchild=new BTNode(3);
		root.lchild.rchild=new BTNode(7);
		
		System.out.print("Inorder: ");
		Inorder(root);
		System.out.print("Preorder: ");
		Preorder(root);
		System.out.print("Postorder: ");
		Postorder(root);
		System.out.println();
		System.out.print("Levelorder: ");
		//Levelorder(root);
	//	System.out.println("# of Nodes:"+countNode(root));
	}
}
