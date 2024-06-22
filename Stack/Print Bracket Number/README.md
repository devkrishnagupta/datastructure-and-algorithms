# Print Bracket Number
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a string <strong>str</strong>, the task is to find the bracket numbers, i.e., for each bracket in str, return <strong>i</strong> if the bracket is the <strong>i<sup>th</sup></strong> opening or closing bracket&nbsp;to appear in the string.&nbsp;</span></p>
<p><strong><span style="font-size: 18px;">&nbsp;Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>  str = "(aa(bdc))p(dee)</span><span style="font-size: 18px;">"
<strong>Output:</strong> 1 2 2 1 3 3
<strong>Explanation:</strong> The highlighted brackets in
the given string <strong>(</strong>aa<strong>(</strong>bdc<strong>))</strong>p<strong>(</strong>dee<strong>)</strong> are
assigned the numbers as: 1 2 2 1 3 3.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong>  str = "(((()("
<strong>Output:</strong> 1 2 3 4 4 5
<strong>Explanation:</strong> The highlighted brackets in
the given string <strong>(((()(</strong> are assigned
the numbers as: 1 2 3 4 4 5</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(|str|)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(|str|)</span></p>