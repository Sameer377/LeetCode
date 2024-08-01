#include <iostream>

using namespace std;

class Triangle
{
public:
    void fibonacci(int row)
    {
        int n1 = 0, n2 = 1, n3;

        int c=0;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < i; j++)
            {
                
                if(c<2){
                     cout << c << " ";
                }else{
                n3 = n1 + n2;
                cout << n3 << " ";
                n1 = n2;
                n2 = n3;
                }
               
                c++;
            }
            cout << endl;
        }
    }

    void display()
    {
        cout << "This is a triangle." << endl;
    }
};

int main()
{
    Triangle t;
    t.fibonacci(5);
}
