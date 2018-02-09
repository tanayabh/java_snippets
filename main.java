###Merge Sort ####Definition:

A comparison based sorting algorithm
Divides entire dataset into groups of at most two.
Compares each number one at a time, moving the smallest number to left of the pair.
Once all pairs sorted it then compares left most elements of the two leftmost pairs creating a sorted group of four with the smallest numbers on the left and the largest ones on the right.
This process is repeated until there is only one set.
####What you need to know:

This is one of the most basic sorting algorithms.
Know that it divides all the data into as small possible sets then compares them.
####Big O efficiency:

Best Case Sort: Merge Sort: O(n)
Average Case Sort: Merge Sort: O(n log n)
Worst Case Sort: Merge Sort: O(n log n)
###Quicksort ####Definition:

A comparison based sorting algorithm
Divides entire dataset in half by selecting the average element and putting all smaller elements to the left of the average.
It repeats this process on the left side until it is comparing only two elements at which point the left side is sorted.
When the left side is finished sorting it performs the same operation on the right side.
Computer architecture favors the quicksort process.
####What you need to know:

While it has the same Big O as (or worse in some cases) many other sorting algorithms it is often faster in practice than many other sorting algorithms, such as merge sort.
Know that it halves the data set by the average continuously until all the information is sorted.
####Big O efficiency:

Best Case Sort: Merge Sort: O(n)
Average Case Sort: Merge Sort: O(n log n)
Worst Case Sort: Merge Sort: O(n^2)
###Bubble Sort ####Definition:

A comparison based sorting algorithm
It iterates left to right comparing every couplet, moving the smaller element to the left.
It repeats this process until it no longer moves and element to the left.
####What you need to know:

While it is very simple to implement, it is the least efficient of these three sorting methods.
Know that it moves one space to the right comparing two elements at a time and moving the smaller on to left.
####Big O efficiency:

Best Case Sort: Merge Sort: O(n)
Average Case Sort: Merge Sort: O(n^2)
Worst Case Sort: Merge Sort: O(n^2)
####Merge Sort Vs. Quicksort

Quicksort is likely faster in practice.
Merge Sort divides the set into the smallest possible groups immediately then reconstructs the incrementally as it sorts the groupings.
Quicksort continually divides the set by the average, until the set is recursively sorted.
    
###Breadth First Search ####Definition:

An algorithm that searches a tree (or graph) by searching levels of the tree first, starting at the root.
It finds every node on the same level, most often moving left to right.
While doing this it tracks the children nodes of the nodes on the current level.
When finished examining a level it moves to the left most node on the next level.
The bottom-right most node is evaluated last (the node that is deepest and is farthest right of it's level).
####What you need to know:

Optimal for searching a tree that is wider than it is deep.
Uses a queue to store information about the tree while it traverses a tree.
Because it uses a queue it is more memory intensive than depth first search.
The queue uses more memory because it needs to stores pointers
####Big O efficiency:

Search: Breadth First Search: O(|E| + |V|)
E is number of edges
V is number of vertices
###Depth First Search ####Definition:

An algorithm that searches a tree (or graph) by searching depth of the tree first, starting at the root.
It traverses left down a tree until it cannot go further.
Once it reaches the end of a branch it traverses back up trying the right child of nodes on that branch, and if possible left from the right children.
When finished examining a branch it moves to the node right of the root then tries to go left on all it's children until it reaches the bottom.
The right most node is evaluated last (the node that is right of all it's ancestors).
####What you need to know:

Optimal for searching a tree that is deeper than it is wide.
Uses a stack to push nodes onto.
Because a stack is LIFO it does not need to keep track of the nodes pointers and is therefore less memory intensive than breadth first search.
Once it cannot go further left it begins evaluating the stack.
####Big O efficiency:

Search: Depth First Search: O(|E| + |V|)
E is number of edges
V is number of vertices
####Breadth First Search Vs. Depth First Search

The simple answer to this question is that it depends on the size and shape of the tree.
For wide, shallow trees use Breadth First Search
For deep, narrow trees use Depth First Search
####Nuances:

Because BFS uses queues to store information about the nodes and its children, it could use more memory than is available on your computer. (But you probably won't have to worry about this.)
If using a DFS on a tree that is very deep you might go unnecessarily deep in the search. See xkcd for more information.
Breadth First Search tends to be a looping algorithm.
Depth First Search tends to be a recursive algorithm.

//pair

public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) o;
        return Objects.equal(p.first, first) && Objects.equal(p.second, second);
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^ (second == null ? 0 : second.hashCode());
    }

    public static <A, B> Pair <A, B> create(A a, B b) {
        return new Pair<A, B>(a, b);
    }
}

//priority queue

PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(1000, new Comparator<Integer>() {  
    
                public int compare(Integer w1, Integer w2) {                         
                    return w1.compareTo(w2);  
                }      
            });

//Random generation

import java.util.Random;

Random rand = new Random();

int  n = rand.nextInt(50) + 1;
//50 is the maximum and the 1 is our minimum 


//using Math.Random

double random = Math.random() * 49 + 1;
or
int random = (int )(Math.random() * 50 + 1);

// infinity

Integer.MAX_VALUE

//Scanner

      // Use the Scanner class
      Scanner sc = new Scanner(System.in);  
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String
      */

//shuffle

void shuffleArray(long[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            long tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
}

//heap

public class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
    }
}

//quick sort

public class MyQuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
    }
}


//backtracking


Subsets : https://leetcode.com/problems/subsets/

public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
Subsets II (contains duplicates) : https://leetcode.com/problems/subsets-ii/

public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
} 
Permutations : https://leetcode.com/problems/permutations/

public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   // Arrays.sort(nums); // not necessary
   backtrack(list, new ArrayList<>(), nums);
   return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
   if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
   } else{
      for(int i = 0; i < nums.length; i++){ 
         if(tempList.contains(nums[i])) continue; // element already exists, skip
         tempList.add(nums[i]);
         backtrack(list, tempList, nums);
         tempList.remove(tempList.size() - 1);
      }
   }
} 
Permutations II (contains duplicates) : https://leetcode.com/problems/permutations-ii/

public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
    if(tempList.size() == nums.length){
        list.add(new ArrayList<>(tempList));
    } else{
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true; 
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, used);
            used[i] = false; 
            tempList.remove(tempList.size() - 1);
        }
    }
}
Combination Sum : https://leetcode.com/problems/combination-sum/

public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}
Combination Sum II (can’t reuse same element) : https://leetcode.com/problems/combination-sum-ii/

public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
    
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i + 1);
            tempList.remove(tempList.size() - 1); 
        }
    }
} 
Palindrome Partitioning : https://leetcode.com/problems/palindrome-partitioning/

public List<List<String>> partition(String s) {
   List<List<String>> list = new ArrayList<>();
   backtrack(list, new ArrayList<>(), s, 0);
   return list;
}

public void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
   if(start == s.length())
      list.add(new ArrayList<>(tempList));
   else{
      for(int i = start; i < s.length(); i++){
         if(isPalindrome(s, start, i)){
            tempList.add(s.substring(start, i + 1));
            backtrack(list, tempList, s, i + 1);
            tempList.remove(tempList.size() - 1);
         }
      }
   }
}

public boolean isPalindrome(String s, int low, int high){
   while(low < high)
      if(s.charAt(low++) != s.charAt(high--)) return false;
   return true;
} 


