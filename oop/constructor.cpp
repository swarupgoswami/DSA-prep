#include<iostream>
#include<vector>
using namespace std;


// we use constructor - contrcutor is the special function that gtets involked automaticlly when the objcet is created from the class 
// constrcutor has no return type ans has the smae name as class 
// if there is no manually created contructor the compiler itselfs creates the constructor 
//3 types pof constrcutor 
//parameterized , non-parameterized , copy constructor 
//we create constructor insie the public access modifier 

class teacher{
    private:
      int salary;

    public:
     string name;
     string dept;
     teacher(){
        cout<<"the non parametrized contsructor"<<endl;

     };
      
     //parametrized constructor
     //since we created two constructor with same name one parmetized and other one as non parameterized this is called contrcutor overloading
     teacher(string name,string dept){
      cout<<"the parametrized constructor"<<endl;

      //this operator xcan be used to assign the value when the parametr and the object class data has the same name;
       this->name=name;
       this->dept=dept;

     }

     //copy constructor
     teacher(teacher &obj){
      cout<<"custom copy constructor"<<endl;
      this->name=obj.name;
      this->dept=obj.dept;
     }

     void getinfo(){
      cout<<name<<endl;
      cout<<dept<<endl;
     }

     void setsalary(int s){
      salary=s;
     }
      
     int getsalary(){
      return salary;
     }

};


int main(){
     teacher t1; // whenever the constructor is involked it creates memeory allocation 
     // the above line will print the constrcutor (the non parametrized constructor)
     teacher t2("ssa","engineering");
     cout<<t2.name<<endl;
     cout<<t2.dept<<endl;

     // when we want to have the one bject to have the smae data from another object we use the copy constructor
     teacher t3(t2); // this copy constructor is not custom it is made automatically 
     t3.getinfo(); // it will return the data same as t2 becauise the object is made from t2 object 

     //now using cutome copy constructor we are creating another object
     teacher t4(t3);
     t4.getinfo();

     
}


