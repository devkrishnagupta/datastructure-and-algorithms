# Root to leaf path sum
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary <strong>tree </strong>and an integer <strong>target</strong>, check whether there is a root-to-leaf path with its sum as <strong>target</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>tree = 1, target = 2
            /   \
          2     3</span>
<span style="font-size: 18px;"><strong>Output:</strong> false</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>There is no root to leaf path with sum 2.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>tree = 1,  target = 4
            /   \
          2     3</span>
<span style="font-size: 18px;"><strong>Output:</strong> true</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The sum of path from leaf node 3 to root 1 is 4.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(n)<br><strong>Expected Auxiliary Space:</strong> O(height of tree)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>4</sup><br>1 ≤ target ≤ 10<sup>6</sup></span></p></div>