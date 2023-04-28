package week2.Kiosk.repo;

import week2.Kiosk.domain.Clothes;
import week2.Kiosk.domain.Type;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private static final Map<Type, Map<String,Clothes>> repo = new HashMap<>();

    public ItemRepository() {
        repo.put(Type.NEAT, new HashMap <>());
        repo.put(Type.JEAN, new HashMap<>());
        repo.put(Type.HOOD, new HashMap <>());
        repo.put(Type.T_Shirt, new HashMap <>());
    }
}

