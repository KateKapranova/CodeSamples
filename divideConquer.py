#implementation of divide and conquer
#find the largest number in the list

def divide(L,start_ind,end_ind):
    #Base case: if a list has one element, this element is max
    if (start_ind==end_ind):
        return L[start_ind]
    #Recursion case: split the list into two parts
    mid = (start_ind+end_ind) // 2
    #calling function recursively on both parts
    u = divide(L,start_ind,mid)
    v = divide(L,mid+1,end_ind)
    #the largest element is returned
    if (u<v):
        return v
    return u

L=[0,3,6,765,9,5,2,1,11,564]
print(divide(L,0,len(L)-1))
