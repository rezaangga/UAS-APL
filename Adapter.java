public class Adapter implements AnimalLiar {
    AnimalJinak animalJinak;

    public Adapter(AnimalJinak animalJinak) {
        this.animalJinak = animalJinak;
    }

    @Override
    public void hewanLiar() {
        animalJinak.hewanJinak();
    }
    
}
