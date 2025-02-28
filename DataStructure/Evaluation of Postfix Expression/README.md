# Evaluation of Postfix Expression
## Medium
<div class="problems_problem_content__Xm_eO"><p>You are given an array of strings <strong>arr</strong> that represents a valid arithmetic expression written in <strong>Reverse Polish Notation (Postfix Notation)</strong>. Your task is to evaluate the expression and return an integer representing its value.</p>
<p><strong>Key Details</strong>:</p>
<ol>
<li>The valid operators are <strong>'+'</strong>, <strong>'-'</strong>, <strong>'*'</strong>, and <strong>'/'</strong>.</li>
<li>Each operand is guaranteed to be a valid integer or another expression.</li>
<li>The division operation between two integers always rounds the result towards zero, discarding any fractional part.</li>
<li>No division by zero will occur in the input.</li>
<li>The input is a valid arithmetic expression in Reverse Polish Notation.</li>
<li>The result of the expression and all intermediate calculations will fit in a 32-bit signed integer.</li>
</ol>
<p><strong>Examples:</strong></p>
<pre><strong>Input: </strong>arr = ["2", "3", "1", "*", "+", "9", "-"]<br><strong>Output:</strong> -4<br><strong>Explanation:</strong> If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.</pre>
<pre><strong>Input:</strong> arr = ["100", "200", "+", "2", "/", "5", "*", "7", "+"]<br><strong>Output:</strong> 757<br><strong>Explanation:</strong> If the expression is converted into an infix expression, it will be ((100 + 200) / 2) * 5 + 7  = 150 * 5 + 7 = 757.</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 &lt;= arr.size() &lt;= 10<sup>5</sup></li>
<li>arr[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-10<sup>4</sup>, 10<sup>4</sup>]</li>
</ul></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Stack" target="_blank" class="ui label problems_tag_label__A4Ism">Stack</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>