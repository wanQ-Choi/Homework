package week2.Kiosk.service;

import week2.Kiosk.repo.ItemRepository;

public class KioskService<T> {
    private final ItemRepository itemRepository;

    public KioskService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem() {

    }
}
