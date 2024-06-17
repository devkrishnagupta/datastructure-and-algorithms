# Check If two Line segments Intersect
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given the coordinates of the endpoints(p1,q1, and p2,q2) of the two line segments. Check if they intersect or not. If the Line segments intersect return <strong>true</strong>&nbsp;otherwise return&nbsp;<strong>false.</strong></span></p>
<p><span style="font-size: 14pt;"><em>Note</em>: Please check the intersection lies within the <strong>line segments</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>p1=(1,1), q1=(10,1), p2=(1,2), q2=(10,2)
<strong>Output: false</strong>
<strong>Explanation:</strong>The two line segments formed by p1-q1 and p2-q2 do not intersect.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>p1=(10,0), q1=(0,10), p2=(0,0), q2=(10,10)
<strong>Output: true</strong>
<strong>Explanation: </strong>The two line segments formed by p1-q1 and p2-q2 intersect.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>p1=(5,-2), q1=(13,2), p2=(2,-3), q2=(3,0)
<strong>Output: false</strong>
<strong>Explanation: </strong>The two line segments formed by p1-q1 and p2-q2 are intersecting beyond endpoints, so it is not considerable.</span></pre>
<p><span style="font-size: 14pt;"><strong>Expected Time Complexity:&nbsp;</strong>O(1)<br><strong>Expected Auxillary Space:&nbsp;</strong>O(1)</span></p>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>-10<sup>6</sup>&lt;=X,Y(for all points)&lt;=10<sup>6</sup></span></p></div>