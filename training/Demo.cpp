#include <iostream>

using namespace std;

class TelephoneBill {
private:
    string name;
    string address;
    string telno;
    int noOfCalls;

public:

    TelephoneBill(){

    }

    TelephoneBill(string name, string address, string telno, int noOfCalls)  {
        this->name = name;
        this->address = address;
        this->telno = telno;
        this->noOfCalls = noOfCalls;
    }

    string getName() {
        return name;
    }

    void display(){
    cout << "Name: " << name << endl;
    cout << "Address: " << address << endl;
    cout << "Telephone Number: " << telno << endl;
    cout << "Number of Calls: " << noOfCalls << endl;
    }

    float calculateBill() {
        float chargesPerCall = 2.0;
        return chargesPerCall * noOfCalls;
    }

    public : void prime(int n){
        int c=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }

        if(c==2){
            cout<<"Prime";
        }else{
            cout<<"Not a prime";
        }
    }
};

class Demo{

    

};

int main()
{
    TelephoneBill d;
    d.prime(6);
    return 0;
}
