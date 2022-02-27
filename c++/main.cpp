#include <bits/stdc++.h>
#include <string>

using namespace std;

#include "Processor.cpp"
#include "Disk.cpp"
#include "Ram.cpp"
#include "Pc.cpp"

int main(){
    //Buat objek Processor 
    Processor nameprice("Intel(R) Pentium(R) CPU 5405U", 1500000);

    //Buat objek Disk
    Disk tcp("HDD", "16GB", 500000);

    //Buat objek Ram
    Ram caprice("4GB", 2000000);

    Pc komputer(nameprice, tcp, caprice);

    komputer.printPc();

    return 0;

}