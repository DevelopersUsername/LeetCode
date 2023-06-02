class ParkingSystem {

    private final int[] space = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        this.space[0] = big;
        this.space[1] = medium;
        this.space[2] = small;
    }

    public boolean addCar(int carType) {
        return --space[carType -1] >= 0;
    }
}

/*
 *
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */