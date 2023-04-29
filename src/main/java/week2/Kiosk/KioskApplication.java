package week2.Kiosk;

import week2.Kiosk.controller.KioskController;
import week2.Kiosk.repository.KioskRepository;
import week2.Kiosk.service.KioskService;

public class KioskApplication {
    public static void main(String[] args) {
        KioskController controller = new KioskController(service());
        controller.run();
    }

    public static KioskService service(){
        return new KioskService(repo());
    }

    public static KioskRepository repo(){
        return new KioskRepository();
    }
}

