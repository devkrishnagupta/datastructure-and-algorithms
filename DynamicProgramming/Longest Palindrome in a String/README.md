# Longest Palindrome in a String
## medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a string <strong><code>s</code></strong>, your task is to find the longest palindromic substring within <code>s</code>. </span></p>
<blockquote>
<p><span style="font-size: 14pt;">A <strong>substring</strong> is a <strong>contiguous </strong>sequence of characters within a string, defined as <code>s[i...j]</code> where <code>0 ≤ i ≤ j &lt; len(s)</code>.</span></p>
<p><span style="font-size: 14pt;">A <strong>palindrome</strong> is a string that reads the <strong>same </strong>forward and backward. More formally, <code>s</code> is a palindrome if <code>reverse(s) == s</code>.</span></p>
</blockquote>
<p><span style="font-size: 14pt;"><strong>Note:</strong> If there are multiple palindromic substrings with the same length, return the <strong>first occurrence</strong> of the longest palindromic substring from left to right.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18.6667px;"><strong>Input: </strong>s = “forgeeksskeegfor” <strong>
Output: </strong>“geeksskeeg”<strong>
Explanation: </strong>There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.</span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input: </strong>s = “Geeks” <strong>
Output: </strong>“ee”
</span><strong style="font-size: 14pt;">Explanation</strong><span style="font-size: 14pt;">: <span style="background-color: #b4d7ff;">"ee" is the longest palindromic substring of "Geeks".</span></span><span style="font-size: 14pt;"> </span></span></pre>
<pre><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Input: </strong>s = “abc” <strong>
Output: </strong>“a”
</span><strong style="font-size: 14pt;">Explanation</strong><span style="font-size: 14pt;">: "a", "b" and "c" are longest palindromic substrings of same length. So,</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> the first occurrence is returned.</span></span></pre>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Constraints:</strong><br><span style="font-size: 14pt;">1 ≤ s.size() ≤ 10</span><sup><span style="font-size: 14pt;">3</span><br><span style="font-size: 14pt;">s consist of only lowercase English letters.</span><br></sup></span></p></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Topic Tags</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><a href="/explore?category[]=Strings" target="_blank" class="ui label problems_tag_label__A4Ism">Strings</a><a href="/explore?category[]=Dynamic Programming" target="_blank" class="ui label problems_tag_label__A4Ism">Dynamic Programming</a><a href="/explore?category[]=palindrome" target="_blank" class="ui label problems_tag_label__A4Ism">palindrome</a><a href="/explore?category[]=Data Structures" target="_blank" class="ui label problems_tag_label__A4Ism">Data Structures</a><a href="/explore?category[]=Algorithms" target="_blank" class="ui label problems_tag_label__A4Ism">Algorithms</a></div></div></div>

<div class="problems_accordion_tags__JJ2DX problems_active_tags__3RExF "><div class="active title problems_active_tag_title__cgl9e"><div class="problems_tag_container__kWANg"><strong>Expected Complexities</strong><button class="ui mini circular icon button problems_tag_dropdown__x6C2I"><i aria-hidden="true" class="dropdown icon"></i></button></div></div><div class="ui divider g-m-0"></div><div class="content active"><div class="ui labels"><div target="_blank" class="ui label">Time Complexity: O(n^2)</div><div target="_blank" class="ui label">Auxiliary Space: O(1)</div></div></div></div>