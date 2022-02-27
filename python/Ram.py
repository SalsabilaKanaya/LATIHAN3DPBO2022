class Ram():
    #private members
    __capacity = ""
    __price = 0

    def __init__(self, capacity = "", price = 0):
        self.__capacity = capacity
        self.__price= price
    
    #setter getter
    def setCapacity(self, capacity):
        self.__capacity = capacity
    
    def getCapacity(self):
        return self.__capacity

    def setPrice(self, price):
        self.__price = price 
    
    def getPrice(self):
        return self.__price
    
    def printRam(self):
        print("Ram~ ")
        print("Capacity : %s" %(self.__capacity))
        print("Price    : Rp %d" % (self.__price))