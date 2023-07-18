# include<iostream>
using namespace std; 

int primenumber(); 
int printcompositenumber();

int main(){ 
    primenumber();
    printcompositenumber();

}
int primenumber(){
    int a ; 
    cout<<"Enter the number"<<endl;
    cin>>a; 
    if(a % 2 == 0){
        cout<<"It is a composite number"<<endl;
    }else {
        cout<<"It is a prime number"<<endl;

    }
    return a;
}
int printcompositenumber(){
    int b; 
    cout<<"Enter the number of integer"<<endl;
    cin>>b;
    for(int i=0; i<=b ; i++){
        if(i % 2 == 0){
            cout<<"COMPOSITE number "<< i <<endl;
        }
      /*  else {
            cout<<"PRIME NUMBER "<<i<<endl;
        } */
    }
    return b;
}