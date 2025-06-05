public interface ClinicMethods {
    public void evaluateAnimal(Integer roomId, Animal animal) throws IncompatibleAnimals, ClinicFull;
    public void occupyRoom(Integer roomId, Animal animal) throws ClinicFull;
    public void leaveRoom(String name);
}
