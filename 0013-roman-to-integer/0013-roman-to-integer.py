class Solution:
    def romanToInt(self, s: str) -> int:
        roman_to_int: dict[str, int] = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }

        num: int = 0
        for i, char in enumerate(s[:-1]):
            curr = roman_to_int[char]
            nxt = roman_to_int[s[i+1]]
            num += curr if curr >= nxt else -curr
        
        return num + roman_to_int[s[-1]]


        