

public class BinarySearchTree {
	private BTNode<Integer>root=null;
	public BinarySearchTree() {}
	
	public void insert(int e) {
		if(root==null) {
			root=new BTNode<Integer>(e);
			return;
		}
		BTNode <Integer> w=root;
		while(w!=null) {
			if(w.data<e) {
				if(w.rchild==null) {
					w.rchild=new  BTNode<Integer>(e);
					System.out.println(w.rchild.data);
					break;
				}
				w=w.rchild;
				
				
			}
			else {
				if(w.lchild==null) {
					w.lchild=new  BTNode<Integer>(e);
					break;
				}
				w=w.lchild;
			}
		}
	}
	
	public boolean search(int key) {
		return search(root,key);
	}
	private boolean search(BTNode<Integer>r,int e) {
		if(r==null)return false;
		if(r.data==e)return true;
		if(r.data<e)
			return search(r.rchild,e);
		return search(r.lchild,e);
	}
	
	public void InOrder() {
		System.out.print("InOrder:");
		InOrder(root);
		System.out.println();
	}
	
	private void InOrder(BTNode<Integer> r) {
		if(r==null) return;
		InOrder(r.lchild);
		System.out.print(r.data+" ");
		InOrder(r.rchild);
	}
	
	public void PostOrder() {
		System.out.print("PostOrder:");
		PostOrder(root);
		System.out.println();
	}
	
	private void PostOrder(BTNode<Integer> r) {
		if(r==null) return;
		PostOrder(r.lchild);
		PostOrder(r.rchild);
		System.out.print(r.data+" ");
	}
	

	public static BTNode delete(BTNode<Integer> r, int value) {

        if (r == null)
            return r;

        if (value < (int) r.data) {
            r.lchild = delete(r.lchild, value);
        } else if (value > (int) r.data) {
            r.rchild = delete(r.rchild, value);
        } else {

            if (r.lchild == null) {
                return r.rchild;
            } else if (r.rchild == null)
                return r.lchild;

            r.data = min(r.rchild);
            r.rchild = delete(r.rchild, (int) r.data);
        }

        return r;

    }

    public static int min(BTNode root) {
        int minimum = (int) root.data;
        while (root.lchild != null) {
            minimum = (int) root.lchild.data;
            root = root.lchild;
        }
        return minimum;
    }
	public	void delete(int  key) {
		
		
	}

	public static void main(String []s) {
		BinarySearchTree bst1=new BinarySearchTree();
		bst1.insert(9);
		bst1.insert(4);
		bst1.insert(5);
		bst1.insert(3);
		bst1.insert(7);
	
		bst1.InOrder();
		bst1.PostOrder();
	//	bst1.delete(4);
	

	}

	
}

	
