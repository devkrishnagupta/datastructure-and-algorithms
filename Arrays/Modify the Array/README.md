# Modify the Array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr</strong>. Return the modified array in such a way that if the current and next numbers are <strong>valid</strong> numbers and are equal then <strong>double </strong>the current number value and <strong>replace </strong>the next number with<strong> 0</strong>. After the modification, rearrange the array such that all 0's are shifted to the end.</span></p>
<p><strong><span style="font-size: 18px;">Note:</span></strong></p>
<ol>
<li><span style="font-size: 18px;">Assume ‘<strong>0</strong>’ as the invalid number and all others as a valid number.</span></li>
<li><span style="font-size: 18px;">The <strong>sequence </strong>of the valid numbers is present in the same order.</span></li>
</ol>
<p><span style="font-size: 18px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [2, 2, 0, 4, 0, 8] <br><strong>Output:</strong> [4, 4, 8, 0, 0, 0] <br><strong>Explanation: </strong>At index 0 and 1 both the elements are the same. So, we will change the element at index 0 to 4 and the element at index 1 is 0 then we will shift all the zeros to the end of the array. So, the array will become [4, 4, 8, 0, 0, 0].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [0, 2, 2, 2, 0, 6, 6, 0, 0, 8]<strong>&nbsp;<br>Output:</strong> [4, 2, 12, 8, 0, 0, 0, 0, 0, 0]<br><strong>Explanation:&nbsp;</strong>At index 5 and 6 both the elements are the same. So, we will change the element at index 5 to 12 and the element at index 6 is 0. We will change the element at index 1 to 4 and the element at index 2 is 0. Then we shift all the zeros to the end of the array. So, array will become [4, 2, 12, 8, 0, 0, 0, 0, 0, 0].<br></span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5<br></sup>1 ≤ arr[i] ≤ 10<sup>6</sup><sup><br>&nbsp;</sup></span></p></div>