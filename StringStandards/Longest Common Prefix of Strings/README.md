# Longest Common Prefix of Strings
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of strings <strong>arr.</strong>&nbsp;Return the <strong>longest common prefix</strong> among all strings present in the array. </span><span style="font-size: 18px;">If there's no prefix common in all the strings, return "<strong>-1</strong>".</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
<strong>Output:</strong> gee
<strong>Explanation</strong>: "gee" is the longest common prefix in all the given strings.<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = ["hello", "world"]
<strong>Output:</strong> -1
<strong>Explanation</strong>: There's no common prefix in the given strings.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(n*min(|arr<sub>i</sub>|))<br><strong>Expected Space Complexity: </strong>O(min(|arr<sub>i</sub>|))</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |arr| ≤ 10<sup>3</sup><br>1 ≤ |arr[i]| ≤ 10<sup>3</sup></span></p></div>