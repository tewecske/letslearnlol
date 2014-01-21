package hu.tewe.letslearnlol.spikes.jsonparser;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @author: tewe
 */
public class JsonParserSpike {


    public static void main(String[] args) throws IOException {
                /* JSON provider */
        URL url = new URL("http://ddragon.leagueoflegends.com/realms/euw.json");

        ObjectMapper mapper = new ObjectMapper();

        /*
         * This allows the ObjectMapper to accept single values for a collection.
         * For example: "location" property in the returned JSON is a collection that
         * can accept multiple objects but, in deserialization process, this property just
         * have one object and causes an Exception.
         */
//        mapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        /*
         * If some JSON property is not present, avoid exceptions setting
         * FAIL_ON_UNKNOWN_PROPERTIES to false
         */
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        /* Get all computers */
        LeagueVersion leagueVersion = mapper.readValue(url, LeagueVersion.class);

        /* Print each computer (previously overriding "toString()" method) */
        System.out.println(leagueVersion);

    }

}
