package week2.Kiosk.service;

import week2.Kiosk.repository.KioskRepository;

public class KioskService {
    private final KioskRepository kioskRepository;

    public KioskService(KioskRepository kioskRepository) {
        this.kioskRepository = kioskRepository;
    }
}
