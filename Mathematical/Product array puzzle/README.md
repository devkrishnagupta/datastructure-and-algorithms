# Product array puzzle
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>nums[]</strong>, construct a Product Array nums[] such that<strong> nums[i]</strong> is equal to the product of all the elements of <strong>nums</strong> except nums[i].</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>nums[] = [10, 3, 5, 6, 2]
<strong>Output: </strong>[180, 600, 360, 300, 900]<strong>
Explanation: </strong>For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>nums[] = [12,0]
<strong>Output: </strong>[0, 12]</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(n)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= nums.size() &lt;= 1000<br>0 &lt;= nums[i] &lt;= 200</span><br><span style="font-size: 18px;">nums[i] may contain duplicates.</span></p></div>