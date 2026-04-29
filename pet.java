public abstract class Pet {
    private String name;
    private boolean available = true;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void Sound(); 

    public void displayInfo() {
        System.out.println("Pet Name: " + name + " | Available: " + available);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }
}
