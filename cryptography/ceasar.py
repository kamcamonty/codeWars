#Task description: https://www.codewars.com/kata/598e045b8c13926d8c0000e8

import re
from string import ascii_lowercase

max_shift = len(ascii_lowercase)

def encode_word(word, shift):
    result = ''
    for char in word:
        old_index = ascii_lowercase.index(char)
        new_index = old_index - shift
        new_index = new_index + max_shift if new_index  < 0 else new_index
        result = result + ascii_lowercase[new_index]
    return result

def count_existing(words, shift):
    count = 0
    for el in words:
        converted_el = encode_word(el, shift)
        if(converted_el in WORDS):
            count += 1
    return count
    

def break_caesar(message):
    words = re.sub('[^a-z]+', ' ', message.lower()).split(" ")
    words = list(filter(None, words))
    counts = []
    for i in range(max_shift):
        actual_count = count_existing(words, i)
        if (actual_count ==  len(words)):
            return i
        counts.append(actual_count)
    return counts.index(max(counts))