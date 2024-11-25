public class ApplePieRecipe {

    public String nameStep;

    Ingredient ingredient = new Ingredient("200", "gram", "ongezouten roomboter");
    Ingredient ingredient1 = new Ingredient("200", "gram", "witte bastard suiker");
    Ingredient ingredient2 = new Ingredient("400", "gram", "zelfrijzend bakmeel");
    Ingredient ingredient3 = new Ingredient("1", "stuk(s)", "ei");
    Ingredient ingredient4 = new Ingredient("8", "gram", "vanillesuiker");
    Ingredient ingredient5 = new Ingredient("1", "snuf", "zout");
    Ingredient ingredient6 = new Ingredient("1.5", "kilo", "zoetzure appels");
    Ingredient ingredient7 = new Ingredient("75", "gram", "kristal suiker");
    Ingredient ingredient8 = new Ingredient("3", "theelepels", "kaneel");
    Ingredient ingredient9 = new Ingredient("15", "gram", "paneermeel");

//    public ApplePieRecipe() {}

    public void printIngredients() {
        System.out.println("Appeltaart ingredienten");
        System.out.println("");
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        System.out.println(ingredient1.getAmount() + " " + ingredient1.getUnit() + " " + ingredient1.getName());
        System.out.println(ingredient2.getAmount() + " " + ingredient2.getUnit() + " " + ingredient2.getName());
        System.out.println(ingredient3.getAmount() + " " + ingredient3.getUnit() + " " + ingredient3.getName());
        System.out.println(ingredient4.getAmount() + " " + ingredient4.getUnit() + " " + ingredient4.getName());
        System.out.println(ingredient5.getAmount() + " " + ingredient5.getUnit() + " " + ingredient5.getName());
        System.out.println(ingredient6.getAmount() + " " + ingredient6.getUnit() + " " + ingredient6.getName());
        System.out.println(ingredient7.getAmount() + " " + ingredient7.getUnit() + " " + ingredient7.getName());
        System.out.println(ingredient8.getAmount() + " " + ingredient8.getUnit() + " " + ingredient8.getName());
        System.out.println(ingredient9.getAmount() + " " + ingredient9.getUnit() + " " + ingredient9.getName());
        System.out.println("");
    }

    public void printRecipeSteps() {
        System.out.println("Appeltaart Recept");
        System.out.println("");
        recipeStepOne("stap 1: ");
        recipeStepTwo("stap 2: ");
        recipeStepThree("stap 3: ");
        recipeStepFour("stap 4: ");
        recipeStepFive("stap 5: ");
        recipeStepSix("stap 6: ");
        recipeStepSeven("stap 7: ");
        recipeStepEight("stap 8: ");
        recipeStepNine("stap 9: ");
        recipeStepTen("stap 10: ");
        System.out.println("");
    }

    public void recipeStepOne(String nameStep) {
        System.out.println(nameStep + "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void recipeStepTwo(String nameStep) {
        System.out.println(nameStep + "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void recipeStepThree(String nameStep) {
        System.out.println(nameStep + "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void recipeStepFour(String nameStep) {
        System.out.println(nameStep + "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void recipeStepFive(String nameStep) {
        System.out.println(nameStep + "Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void recipeStepSix(String nameStep) {
        System.out.println(nameStep + "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void recipeStepSeven(String nameStep) {
        System.out.println(nameStep + "Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void recipeStepEight(String nameStep) {
        System.out.println(nameStep + "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void recipeStepNine(String nameStep) {
        System.out.println(nameStep + "Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void recipeStepTen(String nameStep) {
        System.out.println(nameStep + "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}
