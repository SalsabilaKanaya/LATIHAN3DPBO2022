class Processor():
    #private members
    __name = ""
    __price = 0

    def __init__(self, name = "", price = 0):
        self.__name = name 
        self.__price= price

    #setter getter
    def setName(self, name):
        self.__name = name 
    
    def getName(self):
        return self.__name

    def setPrice(self, price):
        self.__price = price 
    
    def getPrice(self):
        return self.__price
    
    def printProcessor(self):
        print("Processor~ ")
        print("Name  : %s" % (self.__name))
        print("Price : Rp %d" %(self.__price))