def smash(words):
    concat = ''
    for i in range(len(words)):
        if i == 0:
            concat = words[i]
        else:
            concat = concat + ' ' + words[i]
    return concat
