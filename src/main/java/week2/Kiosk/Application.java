package week2.Kiosk;

import week2.Kiosk.controller.KioskController;
import week2.Kiosk.repo.ItemRepository;
import week2.Kiosk.service.KioskService;

public class Application {
    public static void main(String[] args) {
        // To-Do Singleton pattern으로 구현하시오.
        KioskController kiosk = new KioskController(service());
        kiosk.run();
    }

    public static KioskService service(){
        return new KioskService(repo());
    }

    public static ItemRepository repo(){
        return new ItemRepository();
    }
}
