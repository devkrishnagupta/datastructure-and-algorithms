# Make array elements unique
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr[ ]</strong>, your task is to find the <strong>minimum</strong> number of <strong>increment</strong> operations required to make all the elements of the array <strong>unique</strong>. i.e.- no value in the array should occur more than once. In one operation, a value can be incremented by 1 only.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 2]
<strong>Output: </strong>1
<strong>Explanation: </strong>If we increase arr[2] by 1 then the resulting array becomes {1, 2, 3} and has all unique values.Hence, the answer is 1 in this case.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 1, 2, 3]
<strong>Output: </strong>3
<strong>Explanation: </strong>If we increase arr[0] by 3, then all array elements will be unique. Hence, the answer is 3 in this case.<br></span></pre>
<pre><strong>Input: </strong>arr[] = [5, 4, 3, 2, 1]
<strong>Output: </strong>0
<strong>Explanation: </strong>All elements are unique.</pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">1 ≤ arr.size() ≤ 10<sup>6<br></sup></span><span style="font-size: 18px;">0 ≤ arr[i] ≤ 10<sup>6</sup></span></p></div>