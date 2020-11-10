x,y = input().split()
x = int(x)
y = int(y)
def bilash(a,b):
    if a == 1 :
        print("Total: R$ {0:.2f}".format(4.00 * b))
    elif a == 2 :
        print("Total: R$ {0:.2f}".format(4.50 * b))
    elif a == 3 :
        print("Total: R$ {0:.2f}".format(5.00 * b))
    elif a == 4 :
        print("Total: R$ {0:.2f}".format(2.00 * b))
    elif a == 5 :
        print("Total: R$ {0:.2f}".format(1.50 * b))
    return;
bilash(x,y)
