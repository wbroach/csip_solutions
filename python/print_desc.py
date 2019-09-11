# Printing a string in descending then ascending order

def print_desc(str):
    str_arr = str.split()
    str_len = len(str_arr)
    curr = str_len

    # Descending loop
    while curr > 1:  # To eliminate middle word being repeated twice
        for i in range(curr):
            print(str_arr[i], end=' ')
        curr -= 1
        if curr is not 0:
            print()  # for spacing

    # Ascending loop
    while curr <= str_len:
        for i in range(curr):
            print(str_arr[i], end=' ')
        curr += 1
        print()


some_string = "I love athens"

print_desc(some_string)
