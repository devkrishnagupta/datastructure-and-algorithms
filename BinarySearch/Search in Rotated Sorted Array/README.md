# Search in Rotated Sorted Array
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a sorted (in ascending order) and rotated array <strong>arr</strong> of distinct elements which may be rotated at some point and given an element <strong>key, </strong>the task is to find the index of the given element <strong>key</strong> in the array <strong>arr</strong>. The whole array </span><strong style="font-size: 18px;">arr </strong><span style="font-size: 18px;">is given as the range to search.</span></p>
<blockquote>
<p><span style="font-size: 18px;"><span style="font-size: 18px;">Rotation shifts elements of the array by a certain number of positions, with elements that fall off one end reappearing at the other end.</span></span></p>
</blockquote>
<p><span style="font-size: 18px;">Note:- 0-based indexing is followed &amp; returns <strong>-1</strong> if the key is not present.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 10
<strong>Output</strong>: 5
<strong>Explanation</strong>: 10 is found at index 5.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [3, 5, 1, 2], key = 6</span><span style="font-size: 18px;"><strong>
Output</strong>: -1</span><span style="font-size: 18px;"><strong>
Explanation</strong>: There is no element that has value 6.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity</strong>: O(log n)<br><strong>Expected Auxiliary Space</strong>: O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints</strong>:<br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>0 ≤ arr[i] ≤ 10<sup>6</sup><br>1 ≤ key ≤ 10<sup>5</sup></span></p></div>