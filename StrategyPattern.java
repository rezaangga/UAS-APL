public class StrategyPattern {
    private AnimalLiar animalLiar;

    public void setAnimalLiar(AnimalLiar animalLiar) {
        this.animalLiar = animalLiar;
    }

    public AnimalLiar getAnimalLiar() {
        return this.animalLiar;
    }

    public void hewanLiar() {
        animalLiar.hewanLiar();
    }
}
