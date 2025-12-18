# Sort in specific order
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an array <strong>arr[]</strong> of positive integers. Your have to sort them so that the first part of the array contains <strong>odd numbers</strong> sorted in <strong>descending order</strong>, and the rest of the portion contains <strong>even numbers</strong> sorted in <strong>ascending order</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3, 5, 4, 7, 10]
<strong>Output:</strong> [7, 5, 3, 1, 2, 4, 10]
</span><strong><span style="font-size: 18px;">Explanation: </span></strong><span style="font-size: 18px;">7, 5, 3, 1 are odd numbers in descending order and 2, 4, 10 are even numbers in ascending order.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0, 4, 5, 3, 7, 2, 1]</span>
<span style="font-size: 18px;"><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">[7, 5, 3, 1, 0, 2, 4]<br><strong>Explanation: </strong>7, 5, 3, 1 are odd numbers in descending order and 0, 2, 4 are even numbers in ascending order.</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong></span><span style="font-size: 14pt;">1 ≤ arr.size() ≤ 10<sup>5</sup><br>0 ≤ arr<sub>i </sub>≤ 10<sup>9</sup></span></p></div>

Expected Complexities
Time Complexity: O(n log n)
Auxiliary Space: O(1)


Topic Tags
ArraysSortingData StructuresAlgorithmsNumbers