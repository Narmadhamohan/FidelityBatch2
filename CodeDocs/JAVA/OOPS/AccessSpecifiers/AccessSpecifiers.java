class AccessSpecifiers {
    public int publicVar = 1;       // Accessible everywhere
    protected int protectedVar = 2;  // Accessible in the same package and subclasses
    private int privateVar = 3;      // Accessible only within this class
    int defaultVar = 4;              // Package-private, accessible within the same package
}
