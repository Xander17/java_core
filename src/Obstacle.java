class Obstacle {
    private int hardAmount;
    private String type;
    private String units;

    String getType() {
        return type;
    }

    int getHardAmount() {
        return hardAmount;
    }

    void setType(String type) {
        this.type = type;
    }

    void setHardAmount(int hardAmount) {
        this.hardAmount = hardAmount;
    }

    String getUnits() {
        return units;
    }

    void setUnits(String units) {
        this.units = units;
    }
}
