# Count Pairs whose sum is less than target
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array&nbsp;<strong>arr[]</strong>&nbsp;and an integer&nbsp;<strong>target</strong>.&nbsp;</span><span style="background-color: #ffffff; color: #273239; font-family: Nunito, sans-serif; font-size: 18px; letter-spacing: 0.162px; text-align: justify;">You have to find the number of pairs in the array whose sum is strictly less than the&nbsp;<strong>target</strong>.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong></span><span style="font-size: 18px;">arr[] = [7, 2, 5, 3], target = 8</span><span style="font-size: 18px;">
<strong>Output: </strong>2<strong>
Explanation: </strong></span><span style="font-size: 18px;">There are 2 pairs with sum less than 8: (2, 5) and (2, 3). </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [5, 2, 3, 2, 4, 1], target = 5
<strong>Output: </strong>4<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
<strong>Output: </strong>6<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong>1 &lt;= arr.size() &lt;= 10<sup>5</sup><strong><br></strong></span><span style="font-size: 18px;">0 &lt;= arr[i]&nbsp;</span><span style="font-size: 18px;">&lt;= 10<sup>4</sup></span><span style="font-size: 18px;"><br></span><span style="font-size: 18px;">1 &lt;= target &lt;= 10<sup>4</sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Sorting" target="_blank" class="ui label problems_tag_label__A4Ism">Sorting</a><a href="/explore?category[]=two-pointer-algorithm" target="_blank" class="ui label problems_tag_label__A4Ism">two-pointer-algorithm</a><a href="/explore?category[]=Arrays" target="_blank" class="ui label problems_tag_label__A4Ism">Arrays</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n log n)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>