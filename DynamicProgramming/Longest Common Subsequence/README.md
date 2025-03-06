# Longest Common Subsequence
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given two strings <strong><code>s1</code></strong> and <strong><code>s2</code></strong>, return the length of their <strong>longest common subsequence </strong>(LCS). If there is no common subsequence, return <strong>0</strong>.</span></p>
<p><span style="font-size: 14pt;"><em><span style="box-sizing: border-box; margin: 0px; padding: 0px; border: 0px; vertical-align: baseline; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; text-align: justify; background-color: #f9f9f9;"><span style="color: #273239; font-family: Nunito, sans-serif;"><span style="letter-spacing: 0.162px;">A subsequence is a sequence that can be derived from the given string by deleting some or no elements without changing the order of the remaining elements. </span></span><span style="color: #273239; font-family: Nunito, sans-serif;"><span style="letter-spacing: 0.162px;">For example, "ABE" is a subsequence of "ABCDE".</span></span></span></em></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "ABCDGH", s2 = "AEDFHR"
<strong>Output: </strong>3<strong>
Explanation: </strong>The longest common subsequence of "ABCDGH" and "AEDFHR" is "ADH", which has a length of 3.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "ABC", s2 = "AC"
<strong>Output: </strong>2<strong>
Explanation: </strong>The longest common subsequence of "ABC" and "AC" is "AC", which has a length of 2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "XYZW", s2 = "XYWZ"
<strong>Output: </strong>3<strong>
Explanation: </strong>The longest common subsequences of "XYZW" and "XYWZ" are "XYZ" and "XYW", both of length 3.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1&lt;= s1.size(), s2.size() &lt;=10<sup>3<br></sup>Both strings s1 and s2 contain only uppercase English letters.</span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Dynamic Programming" target="_blank" class="ui label problems_tag_label__A4Ism">Dynamic Programming</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n * m)</div><div target="_blank" class="ui label">Auxiliary Space: O(n)</div></div></div></div>