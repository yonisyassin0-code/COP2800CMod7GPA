// SpeciesCounter.java
// Yonis yassin
// 2-23-26
// Encapsulates species data and related operations

public class SpeciesCounter {

    // Constants
    static final String FILE_NAME = "PalmerPenguins.csv";

    public static final int NUM_SPECIES = 3;
    public static final String SP_CHINSTRAP = "Chinstrap";
    public static final String SP_GENTOO = "Gentoo";
    public static final String SP_ADELIE = "Adelie";

    // Private fields for encapsulation
    private String[] speciesData;
    private int[] speciesCount;

    // Reads species data from CSV file
    public void readSpeciesData() {
        speciesData = CSVReader.readFile(FILE_NAME, 1);
    }

    // Initializes species count array
    public void initializeSpeciesCount() {
        speciesCount = new int[NUM_SPECIES];
    }

    // Checks if species data is empty
    public boolean isDataEmpty() {
        return speciesData == null || speciesData.length == 0;
    }

    // Counts occurrences of each species
    public void countSpecies() {

        for (int i = 0; i < speciesData.length; i++) {

            if (speciesData[i].equals(SP_CHINSTRAP)) {
                speciesCount[0]++;

            } else if (speciesData[i].equals(SP_GENTOO)) {
                speciesCount[1]++;

            } else if (speciesData[i].equals(SP_ADELIE)) {
                speciesCount[2]++;
            }
        }
    }

    // Prints the species counts
    public void printSpeciesCount() {

        System.out.println(SP_CHINSTRAP + " count = " + speciesCount[0]);
        System.out.println(SP_GENTOO + " count = " + speciesCount[1]);
        System.out.println(SP_ADELIE + " count = " + speciesCount[2]);
    }
}