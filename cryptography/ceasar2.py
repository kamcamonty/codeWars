#Task description: https://www.codewars.com/kata/55ec55323c89fc5fbd000019
import string

max_index = len(string.ascii_lowercase)

def encode_word(word, shift):
    result = ''
    for char in word:
        old_index = string.ascii_lowercase.index(char)
        new_index = old_index + shift
        multiplier = new_index//max_index
        new_index = new_index - (max_index * multiplier)
        result = result + string.ascii_lowercase[new_index]
    return result

def caesar_encode(phrase, shift):
    split = phrase.split()
    result = []
    for word in split:
        result.append(encode_word(word, shift))
        shift += 1
    return ' '.join(result)