package homework.course_project.cars.showroom;

import homework.course_project.cars.audi.audifactory.AudiFactory;

import homework.course_project.cars.audi.enums.AudiColor;
import homework.course_project.cars.audi.enums.AudiModel;
import homework.course_project.cars.audi.enums.AudiVolumeEng;
import homework.course_project.cars.audi.enums.AudiWheelSize;
import homework.course_project.cars.bmw.bmwfactory.BMWFactory;

import homework.course_project.cars.bmw.enums.BMWColor;
import homework.course_project.cars.bmw.enums.BMWModel;
import homework.course_project.cars.bmw.enums.BMWVolumeEng;
import homework.course_project.cars.bmw.enums.BMWWheelSize;
import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.*;

import homework.course_project.cars.ford.enums.FordColor;
import homework.course_project.cars.ford.enums.FordModel;
import homework.course_project.cars.ford.enums.FordVolumeEng;
import homework.course_project.cars.ford.enums.FordWheelSize;
import homework.course_project.cars.ford.fordfactory.FordFactory;
import homework.course_project.cars.services.ChangeColorService;
import homework.course_project.cars.services.ChangeOptionService;
import homework.course_project.cars.services.ChangeWheelService;


import java.util.List;
import java.util.Set;

import static homework.course_project.cars.utils.Utility.checkRequiredParameter;

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

    public Car orderCar(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize,
                        VolumeEng volumeEng, Wrapper wrapper) throws  NullPointerException {
        CarFactory factory = null;

        if (brand.toString().equalsIgnoreCase("AUDI")) {
            if (checkRequiredParameter(List.of(AudiColor.values()), color)
                    && checkRequiredParameter(List.of(AudiModel.values()), model)
                    && checkRequiredParameter(List.of(AudiWheelSize.values()), wheelSize)
                    && checkRequiredParameter(List.of(AudiVolumeEng.values()), volumeEng)
            ) {
                factory = audiFactory;
            } else {
                System.err.println("ERROR! You entered an invalid value at " + brand );
            }
        } else if (brand.toString().equalsIgnoreCase("BMW")) {
                if (checkRequiredParameter(List.of(BMWColor.values()), color)
                        && checkRequiredParameter(List.of(BMWModel.values()), model)
                        && checkRequiredParameter(List.of(BMWWheelSize.values()), wheelSize)
                        && checkRequiredParameter(List.of(BMWVolumeEng.values()), volumeEng)
                ) {
                    factory = bmwFactory;
                } else {
                    System.err.println("ERROR! You entered an invalid value at " + brand );
                }

            } else if (brand.toString().equalsIgnoreCase("FORD")) {
                if (checkRequiredParameter(List.of(FordColor.values()), color)
                        && checkRequiredParameter(List.of(FordModel.values()), model)
                        && checkRequiredParameter(List.of(FordWheelSize.values()), wheelSize)
                        && checkRequiredParameter(List.of(FordVolumeEng.values()), volumeEng)
                ) {
                    factory = fordFactory;
                } else {
                    System.err.println("ERROR! You entered an invalid value at " + brand );
                }
            }
            
            return  factory.createCar(brand, color, model, yearOfIssue, wheelSize, volumeEng, wrapper, factory.getStock());

    }

    public void changeColor(Car car, Color color) {
        try {
            changeColorService.changeColor(car, color);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at changeColor method! " + e);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR! At the changeColor method has been passed an illegal or inappropriate argument." + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void changeWheelSize(Car car, WheelSize wheelSize) {
        try {
            changeWheelService.changeWheels(car, wheelSize);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at changeWheelSize method!  " + e);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR! At the changeWheelSize method has been passed an illegal or inappropriate argument." + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void addOption(Car car, Option option) {
        try {
            changeOptionService.addOption(car, option);
        } catch (NullPointerException e) {
            System.err.println("ERROR! You have null at addOption method!  " + e);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR! At the addOptions method has been passed an illegal or inappropriate argument." + e);
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
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR! At the changeOptions method has been passed an illegal or inappropriate argument." + e);
        } catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    public void printCarFactoryLists(CarFactory factory) {
        factory.printListForProduction();
    }


}
