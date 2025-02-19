fun main() {

}

class MyLinkedList() {
    private var head: Node<Int>? = null

    fun get(index: Int) = findNodeAtIndex(head, index)?.value ?: -1

    fun addAtHead(`val`: Int) {
        val node = Node(`val`)
        if (head == null) {
            head = node
        } else {
            node.next = head
            head = node
        }
    }

    fun addAtTail(`val`: Int) {
        var curr = head
        val node = Node(`val`)
        while (curr?.next != null) {
            curr = curr.next!!
        }
        curr?.next = node
    }

    fun addAtIndex(index: Int, `val`: Int) {
        val node = Node(`val`)
        var prev = findNodeAtIndex(head,index - 1)
        node.next = prev?.next
        prev?.next = node

    }

    fun deleteAtIndex(index: Int) {
        var prev = findNodeAtIndex(head,index - 1)
        var nodeToDelete = prev?.next
        prev?.next = nodeToDelete?.next
    }

    private fun findNodeAtIndex(node: Node<Int>?, index: Int): Node<Int>? {
        var curr = node
        var index = index
        while (index > 0 && curr != null) {
            curr = curr.next
            index--
        }
        return curr
    }

    inner class Node<T>(val value: T) {
        var next: Node<T>? = null
    }

}
