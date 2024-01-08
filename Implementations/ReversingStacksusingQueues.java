package Implementations;

import Stacks.Stacks;
import Queues.Queue;

public class ReversingStacksusingQueues {
    public static void reverseStack(Stacks st) {
        Queue reverse = new Queue(st.size() + 1);
        int capacity = st.size();

        for (int i = 0; i < capacity; i++) {
            reverse.enqueue(st.pop());
        }

        for (int i = 0; i < capacity; i++) {
            st.push(reverse.dequeue());
        }
    }
}
