# Sorting Elements of an Array by Frequency
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 12pt;">Given an array<strong> </strong>of integers <strong>arr</strong>, sort<strong> </strong>the array according to the <strong>frequency </strong>of elements, i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, then the <strong>smaller number comes first</strong>.</span></p>
<p><span style="font-size: 12pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>arr[] = [5, 5, 4, 6, 4]
<strong>Output:</strong> [4, 4, 5, 5, 6]<strong>
Explanation: </strong>The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same the smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6. The output is <strong>4 4 5 5 6.</strong>
</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>arr[] = [9, 9, 9, 2, 5]
<strong>Output: </strong>[9, 9, 9, 2, 5]<strong>
Explanation: </strong>The highest frequency here is 3. Element 9 has the highest frequency So 9 9 9 comes first. Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is <strong>9 9 9 2 5.</strong></span></pre>
<p><span style="font-size: 12pt;"><strong>Expected Time Complexity:&nbsp;</strong>O(n*logn)<br><strong>Expected Space&nbsp;</strong><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Complexity</strong><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">O(n)</span></span></p>
<p><span style="font-size: 12pt;"><strong>Constraints:</strong></span><br><span style="font-size: 12pt;">1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i]≤ 10<sup>5</sup></span></p></div>