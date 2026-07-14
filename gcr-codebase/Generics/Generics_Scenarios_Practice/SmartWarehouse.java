// Subtopic: Generics - Smart Warehouse Management System
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

public class SmartWarehouse {
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getName());
        }
    }
}