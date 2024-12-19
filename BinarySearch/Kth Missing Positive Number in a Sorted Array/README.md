# Kth Missing Positive Number in a Sorted Array
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; font-size: 18px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">Given a sorted array of distinct positive integers </span><strong style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; font-size: 18px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;"><strong style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline;">arr[]</strong></strong><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; font-size: 18px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">, we need to find the <strong>kth</strong> positive number that is missing from arr[].&nbsp;&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 3, 4, 7, 11], k = 5<br><strong>Output: </strong>9<strong>
Explanation: </strong>Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 2, 3], k = 2
<strong>Output: </strong>5<strong>
Explanation: </strong>Missing are 4, 5, 6… and 2nd missing number is 5.<br></span></pre>
<pre><strong>Input: </strong>arr[] = [3, 5, 9, 10, 11, 12], k = 2
<strong>Output: </strong>2<strong>
Explanation: </strong>Missing are 1, 2, 4, 6… and 2nd missing number is 2.</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>5<br></sup>1 &lt;= k &lt;= 10<sup>5</sup><br>1 &lt;= arr[i]&lt;= 10<sup>6</sup><sup><br></sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Binary Search" target="_blank" class="ui label problems_tag_label__A4Ism">Binary Search</a><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>