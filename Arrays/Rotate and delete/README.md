# Rotate and delete
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr</strong> integers. Assume <strong>sz&nbsp;</strong>to be the initial size of the array. Do the following operations exactly <strong>sz/2</strong> times. In every&nbsp;<strong>kth </strong>(1&lt;= k &lt;= sz/2) operation:</span></p>
<ul>
<li><span style="font-size: 18px;">Right-rotate the array clockwise by <strong>1</strong>.</span></li>
<li><span style="font-size: 18px;">Delete the<strong> <span style="color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">(n– k + 1)</span><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; font-size: 13.5px; vertical-align: baseline; line-height: 0; position: relative; top: -0.5em; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">th</span>&nbsp;</strong>element from begin.</span></li>
</ul>
<p><span style="font-size: 18px;">Now, Return the first element of the array.<br><strong>Note:</strong> Here n keeps on decreasing with every operation.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr<strong> = </strong>[1, 2, 3, 4, 5, 6]</span>
<span style="font-size: 18px;"><strong>Output: </strong>3</span>
<span style="font-size: 18px;"><strong>Explanation: </strong></span><span style="font-size: 18px;">Rotate the array clockwise i.e. after rotation the array arr = [6, 1, 2, 3, 4, 5] and delete the last element that is 5 that will be arr = [6, 1, 2, 3, 4]. Again rotate the array for the second time and deletes the second last element that is 2 that will be A = [4, 6, 1, 3], doing similar operation when we perform 4th operation, 4th last element does not exist. Then we deletes 1st element ie 1 that will be arr = [3, 6]. So, continuing this procedure the last element in arr is 2. So, the output will be 3.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr<strong> = </strong>[1, 2, 3, 4]
<strong>Output: </strong>2
<strong>Explanation:</strong> Rotate the vector clockwise i.e. after rotation the vector arr = [4, 1, 2, 3] and delete the last element that is 3 that will be arr = [4, 1, 2]. After doing all the operations, the output will be 2.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n<sup>2</sup>)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>3</sup><br>1 &lt;= arr[i] &lt;= 10<sup>6</sup></span></p></div>