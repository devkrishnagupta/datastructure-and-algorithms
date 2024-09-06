# Kadane's Algorithm
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer array <strong>arr[].</strong> Find the contiguous sub-array(containing at least one number) that has the&nbsp;maximum sum and return its sum.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [1, 2, 3, -2, 5]</span><span style="font-size: 18px;">
<strong>Output: </strong>9<strong>
Explanation: </strong>Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [-1, -2, -3, -4]</span><span style="font-size: 18px;">
<strong>Output: </strong>-1<strong>
Explanation: </strong>Max subarray sum is -1 of element (-1)</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [5, 4, 7]</span><span style="font-size: 18px;">
<strong>Output: </strong>16<strong>
Explanation: </strong>Max subarray sum is 16 of element (5, 4, 7)</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(n)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong>1 ≤ arr.size() ≤ 10<sup>5</sup><strong><br></strong></span><span style="font-size: 18px;">-10<sup>7</sup> ≤ arr[i] ≤ 10<sup>7</sup></span></p></div>