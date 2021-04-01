package io.cucumber.testeSelenium.steps;

import io.cucumber.java.pt.*;
import io.cucumber.testeSelenium.pages.VehicleDataPage;

public class VehicleDataStep extends VehicleDataPage {

    @Dado("que estou no site da tricents")
    public void que_estou_no_site_da_tricents() {
        abrir("http://sampleapp.tricentis.com/101/app.php");
        browser.manage().window().maximize();
    }

    @Dado("preencho o campo make")
    public void preencho_o_campo_make() {
        getMakeSelect().selectByIndex(2);
    }

    @Dado("preencho o campo model")
    public void preencho_o_campo_model() {
        getModelSelect().selectByIndex(2);
    }

    @Dado("preencho o campo cylinder capacity")
    public void preencho_o_campo_cylinder_capacity() {
        getCylinderCapacityElement().sendKeys("1500");
    }

    @Dado("preencho o campo engine performance")
    public void preencho_o_campo_engine_performance() {
        getEnginePerformanceElement().sendKeys("80");
    }

    @Dado("preencho o campo date of manufacture")
    public void preencho_o_campo_date_of_manufacture() {
        getDateOfManufactureElement().sendKeys("01/01/2021");
    }

    @Dado("preencho o campo number of seats")
    public void preencho_o_campo_number_of_seats() {
        getSeatSelect().selectByIndex(4);
    }

    @Dado("preencho o campo right hand drive")
    public void preencho_o_campo_right_hand_drive() {
        getHandDriveElement().click();
    }

    @Dado("preencho o campo number of seats moto")
    public void preencho_o_campo_number_of_seats_moto() {
        getSeatMotorcycleSelect().selectByIndex(2);
    }

    @Dado("preencho o campo fuel type")
    public void preencho_o_campo_fuel_type() {
        getFuelSelect().selectByIndex(1);
    }

    @Dado("preencho o campo payload")
    public void preencho_o_campo_payload() {
        getPayloadElement().sendKeys("500");
    }

    @Dado("preencho o campo total weight")
    public void preencho_o_campo_total_weight() {
        getTotalWeightElement().sendKeys("10000");
    }

    @Dado("preencho o campo list price")
    public void preencho_o_campo_list_price() {
        getListPriceElement().sendKeys("50000");
    }

    @Dado("preencho o campo license plate number")
    public void preencho_o_campo_license_plate_number() {
        getLicensePlateNumberElement().sendKeys("GST-1603");
    }

    @Dado("preencho o campo annual mileage")
    public void preencho_o_campo_annual_mileage() {
        getAnnualMileageElement().sendKeys("50000");
    }

    @Entao("eu clico no botao next para ir para a aba Insurant Data")
    public void eu_clico_no_botao_next_para_ir_para_a_aba_insurant_data() {
        getNextElement().click();
    }
}