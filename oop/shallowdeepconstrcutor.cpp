#include<iostream>
#include<vector>
using namespace std;


class teacher{
    public:
      string name;
      int* salaryPtr; // a pointer that will point to the slary 

      teacher(string name,int salary){
        this->name=name;
        salaryPtr= new int; //aloocating  a dynamic memory to the slaryptr
        *salaryPtr=salary; //now assigning  the value of the
        //salaryptr as salary from the parameter
      }


      //copy constrcutor
      teacher(teacher &object){
        this->name=object.name;
        salaryPtr=new int; //to avoid the shallow copy 
        *salaryPtr=*object.salaryPtr; // to create the assign the value of new heap memory as ths same value as the object 1
      }

      void getinfo(){
        cout<<name<<endl;
        cout<<*(salaryPtr)<<endl;
      }

};

int main(){
    teacher t1("ssa",55000);
    teacher t2(t1);
    
    t1.getinfo();
    t2.name="aypupe";
    *(t2.salaryPtr)=56000;
    t2.getinfo();
    t1.getinfo();
    return 0;
}