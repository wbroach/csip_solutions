# Thanks and credit to John Shiver on Code Fellows
# https://www.codefellows.org/blog/implementing-a-singly-linked-list-in-python/
# His guide helped me create this


# The Node class. Each item in the linked list will be composed of one of these
# lowercase 'class' declare
class Node(object):

    # This is python's constructor. Every class needs to define this, it is what
    # will be called when the class is invoked
    # --
    # Also notice that the declarations for the variables are IN the constructor
    def __init__(self, data=None, next_node=None):
        self.data = data  # Saving the passed value
        self.next_node = next_node  # A complicated part

    def get_data(self):
        return self.data

    def get_next(self):
        return self.next_node

    def set_next(self, new_next):
        self.next_node = new_next

# --


class LinkedList(object):

    def __init__(self, head=None):
        self.head = head

    def insert(self, data):
        new_node = Node(data)
        new_node.set_next(self.head)
        self.head = new_node

    def size(self):
        size = 0
        tracker_node = self.head
        while tracker_node is not None:  # Spelled out, but unnecessary
            size += 1
            tracker_node = tracker_node.next_node
        return size

    def search(self, data):
        current = self.head
        found = False
        while current is not None and found is False:
            if current.get_data() == data:
                found = True
            else:
                current = current.get_next()
        if current is None:
            raise ValueError("Data not in list")
        return current

    def print(self):
        curr = self.head
        while curr.next_node is not None:
            print(curr.get_data(), end=' ')
            curr = curr.get_next()

# -------------

    """
        This method is solving the problem iteratively. The logic is as follows:
        Two nodes are declared, both point to head.
        We take one node and begin moving down the list.
        Each time we move down the list, we decrement the provided number.
        When that number reaches zero, each loop after that will ALSO move the other node.
        When the leading node becomes null, we have reached the end of the list, and the other node is our guy.
            """
    def nth_to_last_node_iter(self, num):
        nth = self.head
        curr = self.head

        # So what is get_next get_next all about?
        # It has to do with the node class
        # While node.get_next.get_data = None, node.get_next is NOT -- it just gives us an empty node
        # but an empty node still occupies space on the machine, so it is not void.
        # that check is basically ensuring that we get_next enough to obtain a None value when at the end of a list

        while curr.get_next().get_next():
            curr = curr.get_next()
            if num < 1:
                nth = nth.get_next()
            num -= 1

        return nth.get_data()


list = LinkedList()

for i in range(5):
    list.insert(i)

list.print()
print()  # for line break

print(list.nthToLastNodeIter(3))
