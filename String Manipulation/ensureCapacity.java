class ensureCapacity {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Initial capacity: " + sb.capacity()); // Default 21 (16 + 5)

        // Ensure the capacity is at least 50
        sb.ensureCapacity(50);

        // Print the new capacity
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
    }
}
