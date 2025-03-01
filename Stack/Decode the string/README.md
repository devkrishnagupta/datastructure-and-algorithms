# Decode the string
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an encoded string&nbsp;<strong>s</strong>, the task is to decode it.&nbsp;</span><span style="font-size: 18px;">The encoding rule is :</span></p>
<ul>
<li><span style="font-size: 18px;"><strong>k[encodedString],</strong>&nbsp;where the&nbsp;<strong>encodedString</strong>&nbsp;inside the square brackets is being repeated exactly&nbsp;<strong>k</strong>&nbsp;times. Note that&nbsp;<strong>k</strong>&nbsp;is guaranteed to be a positive integer.<br></span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Note:&nbsp;</strong></span><span style="font-size: 18px;">The test cases are generated so that the length of the output string will never exceed&nbsp;</span><span style="font-size: 18px;">10</span><sup>5</sup><span style="font-size: 18px;">&nbsp;.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "1[b]"
<strong>Output:</strong> "b"
<strong>Explanation:</strong> "b" is present only one time.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "3[b2[ca]]"
<strong>Output:</strong> "bcacabcacabcaca"
<strong>Explanation:<br></strong>1. Inner substring “2[ca]” breakdown into “caca”.<br>2. Now, new string becomes “3[bcaca]”
3. Similarly “3[bcaca]” becomes “bcacabcacabcaca ” which is final result.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>5</sup>&nbsp;</span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Recursion" target="_blank" class="ui label problems_tag_label__A4Ism">Recursion</a><a href="/explore?category[]=Stack" target="_blank" class="ui label problems_tag_label__A4Ism">Stack</a><a href="/explore?category[]=Backtracking" target="_blank" class="ui label problems_tag_label__A4Ism">Backtracking</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>