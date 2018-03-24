package com.bridgeit.datastructures;

public class BinaryTreeMethods 
{
	BinaryTreeNode root,root1,node;
	int total = 0;
	public void insert(int value){
		insert(this.root,value);
	}

	
	public void insert(BinaryTreeNode current,int value){
		node = new BinaryTreeNode(value);
		if(root==null){
			root = node;
			total++;
			System.out.println("Root is: "+root.data);
		 }
		else{
			root1 = current;
			if(root1 == null){
				root1 = node;
				total++;
				System.out.println("Root1 is: "+root1.data);
			}

			
			else if(value<root1.getData()){
				if(root1.getLeft()==null){
					root1.setLeft(node);
					total++;
					System.out.println("root node "+root1.data);
					System.out.println("left value: "+root1.getLeft().data);
				}
				else{
					root1 = root1.getLeft();
					this.insert(root1,value);
				}
			}

			
			else{
				if(root1.getRight()==null){
					root1.setRight(node);
					total++;
					System.out.println("root node "+root1.data);
					System.out.println("right value: "+root1.getRight().data);
				}
				else{
					root1 = root1.getRight();
					this.insert(root1,value);
				}
			}
	
		}
	}
	public int getTotal(){
		return total;
	}
public void getTreeCount(int number){
		int num = number;
		long result = count(num);
		System.out.println("Total Combinatios Possible: "+result);
	}

	public static long count(int num){
		int res = 0;
        if (num <= 1) {
            return 1;
        }
        for (int i = 0; i < num; i++) {
            res += count(i) * count(num - i - 1);
        }
        return res;
}
}
