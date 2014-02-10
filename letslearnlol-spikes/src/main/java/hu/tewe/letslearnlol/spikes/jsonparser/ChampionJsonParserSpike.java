package hu.tewe.letslearnlol.spikes.jsonparser;

import hu.tewe.letslearnlol.datagatherer.leaguechampion.LeagueChampionDetails;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URL;

/**
 * @author: tewe
 */
public class ChampionJsonParserSpike {


    public static void main(String[] args) throws IOException {
                /* JSON provider */
        URL url = new URL("http://ddragon.leagueoflegends.com/cdn/4.1.13/data/en_US/champion/Ahri.json");

        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        LeagueChampionDetails leagueChampionDetails = mapper.readValue(url, LeagueChampionDetails.class);
        System.out.println(leagueChampionDetails);

        /* Get all computers */
//        Object json = mapper.readValue(url, Object.class);
//        JsonNode rootNode = mapper.readValue(url, JsonNode.class);
//        JsonNode champion = rootNode.get("data").get("Ahri");

//        JsonFactory jsonFactory = new JsonFactory();
//        JsonParser jsonParser = jsonFactory.createJsonParser(url);
//        while (jsonParser.nextToken() != null) {
//            if ("Ahri".equals(jsonParser.getCurrentName())) {
//                Object object = mapper.readValue(jsonParser, Object.class);
//                System.out.println(object);
//            }
//        }

        /* Print each computer (previously overriding "toString()" method) */
//        System.out.println(mapper.writeValueAsString(champion));

    }

}
