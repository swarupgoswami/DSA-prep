#include<iostream>
#include<vector>
using namespace std;


// creating class - which is the blueprint for objects
class teacher{
    // first we need to give the access modifiers which is by default private
    private:
        double salary; 

    public:
        string name;
        string dept;

        string getname(){
            return name;
        }

        // since we cant acess the private slary but we can indirectly access and ge it with function or methods written inside the public class

        void setsalary(double s){
            salary=s;
        }

        double getsalary(){
            return salary;
        }


};

int main(){
    teacher t1;
    t1.name="ssa";
    cout<<t1.getname()<<endl;
    t1.setsalary(51700.5);
    cout<<t1.getsalary()<<endl;
    return 0;

}