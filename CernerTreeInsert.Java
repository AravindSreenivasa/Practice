//Insert function for the BST

void insert(Node tree, char value){
		if(tree == null){
			tree = new Node(value);
			return tree;
		}
		
		if(value < tree.data)
			tree.left = insert(tree.left,value);
		else
			tree.right = insert(tree.right,value);
	}

/*

Based on the character input, following function creates a binary tree.

For the word "CERNER", the tree would look like this.

C
  \
    E
      \
        R
      /   \
   N        R
 /
E



*/
