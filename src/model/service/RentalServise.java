package model.service;

import model.entities.CarRental;

public class RentalServise {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrasilTaxService taxService;

    public RentalServise(Double pricePerDay, Double pricePerHour, BrasilTaxService taxService) {
        super();
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

    }
}
