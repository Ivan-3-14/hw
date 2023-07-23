package homework.course_project.cars.showroom;

import homework.course_project.cars.audi.audifactory.AudiFactory;

import homework.course_project.cars.bmw.bmwfactory.BMWFactory;

import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.*;

import homework.course_project.cars.ford.fordfactory.FordFactory;
import homework.course_project.cars.services.ChangeColorService;
import homework.course_project.cars.services.ChangeOptionService;
import homework.course_project.cars.services.ChangeWheelService;


import java.util.Set;

public class ShowroomABF {

    private final ChangeColorService changeColorService;
    private final ChangeWheelService changeWheelService;
    private final ChangeOptionService changeOptionService;
    private final AudiFactory audiFactory;
    private final BMWFactory bmwFactory;
    private final FordFactory fordFactory;

    public ShowroomABF(ChangeColorService changeColorService, ChangeWheelService changeWheelService,
                       ChangeOptionService changeOptionService, AudiFactory audiFactory, BMWFactory bmwFactory,
                       FordFactory fordFactory) {
        this.changeColorService = changeColorService;
        this.changeWheelService = changeWheelService;
        this.changeOptionService = changeOptionService;
        this.audiFactory = audiFactory;
        this.bmwFactory = bmwFactory;
        this.fordFactory = fordFactory;
    }

    public Car orderCar(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Wrapper wrapper) {
        CarFactory factory = null;
        if (brand.toString().equalsIgnoreCase("AUDI")) {
            factory = audiFactory;
        } else if (brand.toString().equalsIgnoreCase("BMW")) {
            factory = bmwFactory;
        } else if (brand.toString().equalsIgnoreCase("FORD")) {
            factory = fordFactory;
        }
        assert factory != null;
        return factory.createCar(brand, color, model, yearOfIssue, wheelSize, volumeEng, wrapper, factory.getStock());
    }

    public void changeColor(Car car, Color color) {
        try {
            changeColorService.changeColor(car, color);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at changeColor method! " + e);
        }
    }

    public void changeWheelSize(Car car, WheelSize wheelSize) {
        try {
            changeWheelService.changeWheels(car, wheelSize);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at changeWheelSize method!  " + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void addOption(Car car, Option option) {
        try {
            changeOptionService.addOption(car, option);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at addOption method!  " + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void deleteOption(Car car, Option option) {
        try {
            changeOptionService.deleteOption(car, option);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at deleteOption method!  " + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public <T> void changeOptions(Car car, Set<T> options) {
        try {
            car.getOptions().clear();
            changeOptionService.changeOptions(car, (Set<Option>) options);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at changeOptions method!  " + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void printCarFactoryLists(CarFactory factory) {
        factory.printListForProduction();
    }


}
