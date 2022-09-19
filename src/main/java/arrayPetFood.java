public class arrayPetFood {
    private String petName;
    private String petFood;
    //constructor for calling pets name & food
    public arrayPetFood(String petName,String petFood) {
        this.petName = petName;
        this.petFood = petFood;
    }
    public String getPetName(){
        return petName;
    }
    public String getPetFood(){
        return petFood;
    }

    @Override
    public String toString() {
        return "{" +
                "My pet's name is a, " + petName + '\''+
                ", & it eat's " + petFood + '\'' +
                '}';
    }
}