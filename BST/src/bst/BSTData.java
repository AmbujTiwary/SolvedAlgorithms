package bst;

public class BSTData {

	Node root;
	
	BSTData()
	{
		root = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTData bdata = new BSTData();
		bdata.insert(10);
		bdata.insert(9);
		bdata.insert(6);
		bdata.insert(16);
		bdata.insert(8);
		bdata.insert(15);
		bdata.insert(3);
		bdata.insert(20);
		bdata.insert(25);
		
		bdata.print();
	}

	private void print() {
		Node temp = root;
		 printData(temp);
	}
	
	void printData(Node temp)
	{
		if(temp !=null)
		{
		  printData(temp.left);
		  System.out.println("temp.data" + temp.data);
		  printData(temp.right);
		}
	}

	protected void insert(int data)
	{
	    root = insertData(root, data);
	}
	private Node insertData(Node root, int data) {
		
		
		if(root == null)
		{
			root = new Node(data);
			System.out.println("data in insertData " + root.data);
			return root;
		}
		if(data < root.data)
			root.left = insertData(root.left, data);
		else if(data > root.data)
			root.right= insertData(root.right, data);

		return root;	
	}
}
