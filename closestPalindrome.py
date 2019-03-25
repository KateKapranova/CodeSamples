#Closest palindrome algorithm
#Task retrieved from https://practice.geeksforgeeks.org/problems/closest-palindrome/0
#Input: a string of digits N
#Output: the closest palindrome
#Condition: if the distance between N and two closest palindrome numbers
#           is equal then we pick the smaller value
#Sample input: 102, expected output: 101
#Beware of tricky inputs: 5 (expected 5), 10 (expected 11), 984 (expected 979),
#                       0005001 (expected 0005000), 500999 (expected 501109)


#help function to check if a string a palindrome
def palindromeCheck(n):
    left_part=''
    right_part=''
    left_part=n[:(len(n)//2)]
    if len(n)%2==0:
        right_part=n[(len(n)//2):]
    else:
        right_part=n[((len(n)//2)+1):]
    if left_part is right_part:
        return 1
    else:
        reverse=right_part[::-1]
        if reverse == left_part:
            return 1
        else:
            return 0

def closestPalindrome():
    T = int(input()) #number of test cases
    for i in range(1,T+1):
        N = input() #test case
        #calculate the pivot at which the input string can be separated
        #pivots for odd and even cases are different
        if len(N)%2==0: #even
            pivot = (len(N) // 2) - 1
            palindrome = N[:(pivot + 1)]
            for i in range(pivot, -1, -1):
                palindrome += N[i] #naive palindrome
        else:  #odd
            pivot = len(N) // 2 #we calculate the index of pivot
            palindrome = N[:(pivot + 1)]
            for i in range(pivot-1, -1, -1):
                palindrome += N[i] #naive palindrome
        #calculate difference between value N and naive palindrome
        palDif = abs(int(N) - int(palindrome))
        #look at all values between (N+palDif) and (N-palDif)
        #and check if there are closer palindromes than the naive palindrome
        for counter in range(1, palDif+1):
            palindromeUp=int(N)+counter #values higher than N
            palindromeDown=int(N)-counter #values lower than N
            #check if they are palindromes
            resultUp=palindromeCheck(str(palindromeUp))
            resultDown=palindromeCheck(str(palindromeDown))
            #3 cases are possible:
            if (resultUp == 1 and resultDown == 0):
                palindrome = str(palindromeUp)
                break
            elif resultUp == 0 and resultDown == 1:
                palindrome = str(palindromeDown)
                break
            #tricky case: 2 palindromes are found at the same distance from N
            elif resultUp == 1 and resultDown==1:
                #we need to pick the smallest value
                if palindromeDown<palindromeUp:
                    #but only if this value has the same number of digits as N
                    if (len(str(palindromeUp))==len(str(palindromeDown))):
                        palindrome=str(palindromeDown)
                        break
                    else:
                        palindrome=str(palindromeUp)
                        break

        print(palindrome)
    return palindrome

closestPalindrome()
