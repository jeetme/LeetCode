class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        complements: dict[int, int] = {} # complement -> index
        for i, num in enumerate(nums):
            complement: int = target - num;
            if complement in complements:
                return [complements.get(complement), i]
            complements[num] = i
        return [-1, -1]

        