fun main() {

}


class Solution {
    fun hasCycleHashMap(head: ListNode?): Boolean {
        val listMap = mutableMapOf<ListNode?, Int>()
        var curr = head

        while (curr != null) {
            if (listMap[curr] != null) {
                return true
            } else listMap[curr] = curr.value
            curr = curr.next
        }
        return false
    }

    class ListNode(val value: Int) {
        var next: ListNode? = null
    }

    fun hasCycleTwoPointer(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow?.next

            if (slow == fast)
                return true
        }
        return false
    }
}

