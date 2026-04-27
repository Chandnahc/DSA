class LFUCache {

    class Node {
        int key, value, freq;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    private int capacity;
    private int minFreq;

    private Map<Integer, Node> keyMap; // key -> Node
    private Map<Integer, LinkedHashSet<Node>> freqMap; // freq -> nodes

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) return -1;

        Node node = keyMap.get(key);
        updateFreq(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }

        // Evict if needed
        if (keyMap.size() == capacity) {
            LinkedHashSet<Node> minFreqSet = freqMap.get(minFreq);
            Node evict = minFreqSet.iterator().next(); // LRU in min freq
            minFreqSet.remove(evict);
            if (minFreqSet.isEmpty()) {
                freqMap.remove(minFreq);
            }
            keyMap.remove(evict.key);
        }

        // Insert new node
        Node newNode = new Node(key, value);
        keyMap.put(key, newNode);

        freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
        minFreq = 1;
    }

    private void updateFreq(Node node) {
        int freq = node.freq;
        LinkedHashSet<Node> set = freqMap.get(freq);

        set.remove(node);
        if (set.isEmpty()) {
            freqMap.remove(freq);
            if (minFreq == freq) {
                minFreq++;
            }
        }

        node.freq++;

        freqMap.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */