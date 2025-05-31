Strategy Pattern

- Use when we are implementing from interface/class and both childs have code diff from interface
    but have same to each other. So code duplicacy is there.
class StrategyPattern {

    class Vehicle {
        void drive() {
            Sysout("Normal drive strategy");
        }
    }

    class OffroadVehicle extends Vehicle {
        void drive() {
            Sysout("Sports drive strategy");
        }
    }

    class SportsVehicle extends Vehicle {
        @java.lang.Override
        void drive() {
            Sysout("Sports drive strategy");
        }
    }

    Here, both subclasses have same function so code duplicacy happening and will increase as more vehicles added.

    To solve this we will create a driveStrategy interface.

    interface DriveStrategy {
        void drive();
    }

    class NormalDriveStrategy implements DriveStrategy {
        @java.lang.Override
        public void drive() {
            Sysout("Normal drive strategy");
        }
    }

    class SportsDriveStrategy implements DriveStrategy {
        @java.lang.Override
        public void drive() {
            Sysout("Sports drive strategy");
        }
    }

    class Vehicle {
        DriveStrategy driveStrategy;

        Vehicle(DriveStrategy driveStrategy) {
            this.driveStrategy = driveStrategy;
        }

        public void drive() {
            driveStrategy.drive();
        }
    }

    class SportsVehicle extends Vehicle {
        SportsVehicle() {
            super(new SportsDriveStrategy());
        }
    }

    class GoodsVehicle extends Vehicle {
        GoodsVehicle() {
            super(new NormalDriveStrategy());
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }

}