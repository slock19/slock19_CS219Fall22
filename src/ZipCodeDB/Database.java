package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Store data about all the zipcodes.
 */
public class Database {

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();
    }

    // fill the zipcode array list with real data
    private void load_zips() {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // read zipcode file line by line
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] parts = line.split(",");
            Zipcode z = new Zipcode(
                    parts[1].substring(1,parts[1].length() - 1),
                    parts[2].substring(1,parts[2].length() - 1),
                    parts[3].substring(1,parts[3].length() - 1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6])
            );
            codes.add(z); // put z at the end of the array list
        }

        // sort by zipcode
        Collections.sort(this.codes);
    } //end of load_zips
    //write a function to search for a zipcode data by a zipcode
    public Zipcode findbyZip(String code){
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode()))
                return zipcode;
        }
        return null;
    }

    public Zipcode getNorthern(){
        Zipcode north = zipcode 00000;
        for (Zipcode zipcode : this.codes){
            for (zipcode = 00000; zipcode <= 99999; zipcode++){
                if lat >= north;
                north = zipcode;
            }
        } //what i want it to do is start at the first zipcode and
        // then check if lat is greater than the base case and repeat until all zipcodes have been searched
    }

    private Zipcode bsearch(String target, int low, int high){
        if (low > high){
            return null;
        }
        int mid = (low + high)/2;

        if (this.codes.get(mid).equals(target)){
            return this.codes.get(mid);
        }
        else if (this.codes.get(mid).getCode().compareTo(target) < 0) // returns -1 if mid less than target, 0 if equal, 1 if mid greater than target
            return bsearch(target,mid+1,high);
        else
            return bsearch(target,low,mid-1);
    }

    //provides a simple interface to bsearch function
  public Zipcode search(String code){
        //return bsearch(code, 0, codes.size()-1);
      int pos = Collections.binarySearch(this.codes, new Zipcode(code, "", "", 0, 0, 0));
      if (pos != -1)
          return this.codes.get(pos);
      else
          return null;
    }

}

