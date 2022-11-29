package ZipCodeDB;

/*
 *  Hold data about one zipcode
 */
public class Zipcode implements Comparable<Zipcode>, Distance {


    private String code;
    private String state; // two character code abbreviation
    private String city;
    private double lng;
    private double lat;
    private int pop;

    public Zipcode(String code, String state, String city, double lng, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
        this.pop = pop;
    }

    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }

    public String getCode() {
        return code;
    }

    @Override
    public int compareTo(Zipcode zc) {
        return this.code.compareTo(zc.code);
    }

    @Override
    public double distance(Zipcode zip) {
        return 0; // fancy great circle distance
    }

    public WeatherObservation getWeatherdata(){}

    // http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt

    String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" + this.lat+ "&lng="+this.lng+"4&username=edharcourt";
}

