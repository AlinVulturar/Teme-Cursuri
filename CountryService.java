import java.util.ArrayList;
import java.util.List;

public class CountryService {

    private List<Country> countries;

    public CountryService(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> listAllCountries() {
        return countries;
    }

    public List<String> listAllCountryNames() {
        List<String> countryNames = new ArrayList<>();
        for (Country country : countries) {
            countryNames.add(country.getName());
        }
        return countryNames;
    }

    public String getCapitalOfCountry(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getCapital();
            }
        }
        return null;
    }

    public long getPopulationOfCountry(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getPopulation();
            }
        }
        return 0;
    }

    public List<Country> getCountriesInContinent(String continent) {
        List<Country> continentCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country.getContinent().equals(continent)) {
                continentCountries.add(country);
            }
        }
        return continentCountries;
    }

    public List<String> getCountryNeighbours(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getNeighbours();
            }
        }
        return null;
    }

    public List<Country> getCountriesInContinentWithPopulationLargerThan(String continent, long population) {
        List<Country> continentCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country.getContinent().equals(continent) && country.getPopulation() > population) {
                continentCountries.add(country);
            }
        }
        return continentCountries;
    }

    public List<Country> getCountriesThatNeighborXButNotNeighborY(String xCountryName, String yCountryName) {
        List<Country> neighborCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country.getNeighbours().contains(xCountryName) && !country.getNeighbours().contains(yCountryName)) {
                neighborCountries.add(country);
            }
