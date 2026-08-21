class MyHashMap {

    boolean[] keys;
    int[] values;

    public MyHashMap() {
        this.keys = new boolean[1000001];
        this.values = new int[1000001];
    }
    
    public void put(int key, int value) {
        this.keys[key] = true;
        this.values[key] = value;
    }
    
    public int get(int key) {
        if(keys[key] == false) {
            return -1;
        }
        return this.values[key];
    }
    
    public void remove(int key) {
        this.keys[key] = false;
        this.values[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */