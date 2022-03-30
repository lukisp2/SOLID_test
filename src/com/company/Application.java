package com.company;

import com.company.domains.RentRequest;
import com.company.services.CarRentalRepository;
import com.company.services.CarRentalService;
import com.company.services.MailService;
import com.company.services.RentRequestRetriever;
import com.company.services.RentalProcessor;

public class Application {

    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }

}