
class Node:
    def __init__(self,val):
        self.l = None
        self.r = None
        self.data = val



# ================ Traversals ===================

def inorder(root):
    if root:
        inorder(root.l)
        print(root.data,end = ' ')
        inorder(root.r)

def preorder(root):
    if root:
        print(root.data,end = ' ')
        preorder(root.l)
        preorder(root.r)

def postorder(root):
    if root:
        postorder(root.l)
        postorder(root.r)
        print(root.data,end = ' ')


# level order implementation

def find_height(root):
    if root is None:
        return 0
    left_height = find_height(root.l)
    right_height = find_height(root.r)
    if left_height > right_height :
        return left_height + 1
    else:
        return right_height + 1

def get_level_data(root,level):
    if root is None:
        return
    
    if level == 1:
        print(root.data,end=' ')
    else:
        get_level_data(root.l,level-1)
        get_level_data(root.r,level-1)


def levelorder(root):
    height = find_height(root)
    for i in range(1,height+1):
        get_level_data(root,i)

# print all traversals
def traversals(root):
    print("Inorder: ",end=' ')
    inorder(root)
    print()
    print("Preorder: ",end=' ')
    preorder(root)
    print()
    print("Postrder: ",end=' ')
    postorder(root)
    print()
    

# ================ Binary Trees ===================

# delete node in tree

def deleteDeepest(root,d_node): 
    q = [] 
    q.append(root) 
    while(len(q)): 
        temp = q.pop(0) 
        if temp is d_node: 
            temp = None
            return
        if temp.r: 
            if temp.r is d_node: 
                temp.r = None
                return
            else: 
                q.append(temp.r) 
        if temp.l: 
            if temp.l is d_node: 
                temp.l = None
                return
            else: 
                q.append(temp.l) 
   
def deletion(root, key): 
    if root == None : 
        return None
    if root.l == None and root.r == None: 
        if root.key == key :  
            return None
        else : 
            return root 
    key_node = None
    q = [] 
    q.append(root) 
    while(len(q)): 
        temp = q.pop(0) 
        if temp.data == key: 
            key_node = temp 
        if temp.l: 
            q.append(temp.l) 
        if temp.r: 
            q.append(temp.r) 
    if key_node :  
        x = temp.data 
        deleteDeepest(root,temp) 
        key_node.data = x 
    return root



print("========= Trees ========")
root = Node(1)

root.l = Node(2)
root.r = Node(3)
root.l.l = Node(4)
root.l.r = Node(5)

print("========= Before deletion ========")
traversals(root)

print("Height of Tree: ", find_height(root))

root= deletion(root,4) # delete 4 

print("========= After deletion ========")
traversals(root)
print("Height of Tree: ", find_height(root))


# ================ Binary Search Tree ===================


# delete node in BST

def findmax(root):
    if root==None:
        return
    while(root.r!=None):
        root=root.r
    return root

def del_node(root,data):
    if root is None:
        return None
    if root.data > data:
        root.l=del_node(root.l,data)
    elif root.data < data:
        root.r=del_node(root.r,data)
    else:
        if root.r==None:
            return root.l
        elif root.l==None:
            return root.r
        else:
            if root.r == None and root.l==None:
                return None
            root.data=findmax(root.l).data
            root.l=del_node(root.l,root.data)
    return root


# return binary search tree

def bst(rootd,data):
    if rootd is None:
        return Node(data)
    if(data > rootd.data):
        rootd.r=bst(rootd.r,data)
    elif(data < rootd.data):
        rootd.l=bst(rootd.l,data)
    return rootd

inp = [10,8,12,7,9,11,13]
root_bst = None
for i in inp:
    root_bst=bst(root_bst,i)

# returns mirror img of tree
def mirror(root):
    if root is None:
        return
    root.l,root.r=root.r,root.l
    root.l=mirror(root.l)
    root.r=mirror(root.r)
    return root

# checks if a tree is BST
def check_bst(root):
    if root is None:
        return True
    res=check_bst(root.l) and check_bst(root.r)
    if not res:
        return False
    else:
        if root.l == None and root.r == None:
                return True
        elif root.l == None:
            if root.r.data>root.data:
                return True
        elif root.r == None:
            if root.l.data < root.data:
                return True
        elif root.l != None and root.r != None:
            if root.r.data>root.data and root.l.data < root.data:
                return True
        elif root.l == None and root.r == None:
                return True
        return False

# gets postorder from inorder and preorder
def getpost(ino,preo,n):
    if preo[0] in ino:
        ind = ino.index(preo[0])
    if ind!=0:
        getpost(ino[:ind],preo[1:ind+1],len(ino[:ind]))
    if ind!=n-1:
        getpost(ino[ind+1:],preo[ind+1:],len(ino[ind+1:]))
    print(preo[0],end=' ')


        
print("========= BST ========")

print("-----Before deletion-------")
traversals(root_bst)
root_bst=del_node(root_bst,10) # delete 10


print('------check BST-------')
print(check_bst(root_bst))
print(check_bst(root))


print("-----After deletion-------")
traversals(root_bst)



print('---- Mirror -----')
root_mirror=mirror(root_bst)
traversals(root_mirror)

print('----print postOrder from given inOrder and preorder-----')

getpost([13,12,11,9,8,7],[ 9 ,12, 13, 11, 8, 7],len(inp))
print()