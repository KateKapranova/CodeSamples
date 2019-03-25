#include <iostream>
#include <vector>

/*
FOUR-ELEMENT PROBLEM: Given an array of integers, find a combination of four elements
in the array whose sum is equal to a given value X.
 sample input:
 1 #number of test cases
 7 #size of a first case
 4 5 1 4 1 0 1 # array
 7 #value X
 output should be 1 (if a 4-element combination is present) or 0
*/

using namespace std;

/*void prettyPrint(vector<int>& arr){
    cout<<"array: ";
    for(int k=0;k<arr.size();k++){
        cout << arr[k] << " "; }

    cout<< "\n";
}*/

int main(void){
#ifndef ONLINE_JUDGE
    if (std::freopen("C:\\Users\\Katiebear\\Documents\\Studium\\4. Semester\\CodeSchool\\testCase.in", "r", stdin) == nullptr) {
        std::perror("freopen");
        std::exit(1);
    }
#endif  // ONLINE_JUDGE

    int cases, size, elem, token,sum;
    char success;

    cin>>cases;
    for(int i=0;i<cases;i++){
        cin>>size;
        vector<int> arr;

        for(int n=0;n<size;n++){
            cin>>elem;
            arr.push_back(elem);
        }
        cin>>token;
        success='n';sum=0;
        //prettyPrint(arr);

        for(int k=0;k<size;k++){
            if(sum==token){break;}

            for(int j=k+1;j<size;j++){
                if(sum==token){break;}

                for(int l=j+1;l<size;l++){
                    if(sum==token){break;}

                    for(int m=l+1;m<size;m++){
                        //cout<< "sum = " << arr[k]<< "+" << arr[j] << "+" << arr[l] << "+" << arr[m] << "\n";
                        sum = arr[k]+arr[j]+arr[l]+arr[m];

                        if (sum != token){sum=0;}
                        else if(sum==token){success='y';break;}
                    }
                }
            }
        }

        if (success == 'y'){cout<<"1"<<"\n";}
        else{cout<<"0"<<"\n";}
    }
    return 0;
}