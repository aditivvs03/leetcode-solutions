class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        merged=sorted(nums1 + nums2)
        n=len(merged)
        return (merged[n//2] + merged[~n//2])/2.0
        