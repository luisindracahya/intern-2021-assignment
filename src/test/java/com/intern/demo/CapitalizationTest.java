package com.intern.demo;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.intern.demo.Capitalization.convertToMap;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class CapitalizationTest {

    @Test
    public void convertToMapTest() {
//        //TODO COMPLETE THIS
        ImportedBook importedBook1 = new ImportedBook("jK roWlIn", "hArrY pOttEr dAn baTu AkiK", "bAmBanG");
        ImportedBook importedBook2 = new ImportedBook("aRsEne lUpiN", "dEtEcTiVe coNAn", "sIaPa iNi");

        LocalBook localBook1 = new LocalBook("jK roWlIn", "suNIb cUrHaT", "gramEDia");

        List<Book> inputs = Arrays.asList(importedBook1, importedBook2, localBook1);

        Map<String, List<String>> result = convertToMap(inputs);
        System.out.println(result);
        assertNotNull(result);
    }
}
