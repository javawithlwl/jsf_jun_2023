package com.careerit.jsf.cj.basics.iplstats.util;

import com.careerit.jsf.cj.basics.iplstats.domain.TeamDetails;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JsonReaderUtil {

        private static final String FILE_NAME = "/ipl_2020_data.json";
        public static List<TeamDetails> loadFromJsonFile() {
            ObjectMapper objectMapper = new ObjectMapper();
            List<TeamDetails> teamDetails = new ArrayList<>();
            try{
                TypeReference<List<TeamDetails>> typeReference = new TypeReference<>(){};
                teamDetails = objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream(FILE_NAME), typeReference);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return teamDetails;
        }
}
