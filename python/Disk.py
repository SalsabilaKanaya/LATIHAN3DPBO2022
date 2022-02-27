class Disk():
    #private members
    __type = ""
    __capacity = ""
    __price = 0

    def __init__(self, type = "", capacity = "", price = 0):
        self.__type = type 
        self.__capacity = capacity
        self.__price= price
    
    #setter getter
    def setType(self, type):
        self.__type = type 
    
    def getType(self):
        return self.__type

    def setCapacity(self, capacity):
        self.__capacity = capacity
    
    def getCapacity(self):
        return self.__capacity

    def setPrice(self, price):
        self.__price = price 
    
    def getPrice(self):
        return self.__price
    
    def printDisk(self):
        print("Disk~ ")
        print("Type     : %s" % (self.__type))
        print("Capacity : %s" %(self.__capacity))
        print("Price    : Rp %d" % (self.__price))