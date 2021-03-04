import java.util.Arrays;

public class Program {
    public static void main(String[] args){

        //exercise 1
        String word = ExerciseOnString.encode("AbcaBd");
        System.out.println(word);

        //exercise 2
        int[] arr2 = {0,0,1,1,1,2,5};
        int n = ExerciseOnArrays.EraseDuplicate(arr2 , arr2.length);
        printArray(arr2, n);

        //exercise 3
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,3,4,9};
        int sum = BestSell.bestProfit(prices);
        System.out.println(sum);

        //exercise 4
        int[] arr4 = {1,2,3,4,5,6,7};
        int k=3;
        ExerciseOnArrays.rotateArrBy_K_Steps(arr4 , k);
        printArray(arr4 , arr4.length);

        //exercise 5
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(9);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(15);
        treeNode1.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode2.left = treeNode5;
        System.out.println(ExerciseBinaryTree.maxDepth(treeNode1));

        //exercise 6
        TreeNode btsNode1 = new TreeNode(1);
        TreeNode btsNode2 = new TreeNode(1);
//      TreeNode btsNode3 = new TreeNode(3);
//      TreeNode btsNode4 = new TreeNode(7);
//      TreeNode btsNode5 = new TreeNode(15);
//      btsNode1.right = btsNode3;
        btsNode1.left = btsNode2;

        System.out.println(ExerciseBinaryTree.isValidBST(btsNode1));

        //exercise 7
        int [] nums ={3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(ExerciseOnArrays.findIndexesOfSumOfTarget(nums, target)));

        //exercise 8
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);
        ListNode node14 = new ListNode(9);

        node1.next=null;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = null;

        ListNode sumOfLinkedList = new ListNode();
        sumOfLinkedList = ExerciseLinkedList.addTwoNumbers(node1, node2);

        while(sumOfLinkedList != null){
            System.out.print(sumOfLinkedList.val);
            sumOfLinkedList = sumOfLinkedList.next;
        }




    }

    private static void printArray(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if(i == n -1)   System.out.print(arr[i]);
            else            System.out.print(arr[i] + ", ");
        }
        System.out.println("]" + "\n");
    }
}
