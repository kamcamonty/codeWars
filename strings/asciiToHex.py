#Task description: https://www.codewars.com/kata/52fea6fd158f0576b8000089
import re

class Converter():
    @staticmethod
    def to_ascii(h):
        n = 2
        hex_arr = [h[i:i+n] for i in range(0, len(h), n)]
        char_arr = [chr(int(hex, 16)) for hex in hex_arr]
        return ''.join(char_arr)

    @staticmethod
    def to_hex(s):
        hex_arr = [re.sub('^0x', '', hex(ord(char))) for char in s]
        return ''.join(hex_arr)