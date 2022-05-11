package Composers;

import Composers.cnf.DataComposer;
import Composers.composer.Composer;
import Composers.composer.ConfigComposer;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConfigComposerTest {

    private List<Composer> composers;
    ConfigComposer configComposer;
    DataComposer dataComposer;

    @Before
    public void setUp() {
        dataComposer = new DataComposer();
        composers = dataComposer.getComposers();
        configComposer = new ConfigComposer();
    }

//    private Composer composer1;
//    private Composer composer2;
//    private Composer composer3;
//    private Composer composer4;
//    private Composer composer5;
//    private Composer composer6;
//    private Composer composer7;
//    private Composer composer8;
//    private Composer composer9;
//
//    ConfigComposer configComposer;
//    DataComposer dataComposer;




//    @Before
//
//    public void setUp(){
//        configComposer = new ConfigComposer();
//        dataComposer = new DataComposer();

//        composer1 = dataComposer.getHans();
//        composer2 = dataComposer.getThomas();
//        composer3 = dataComposer.getJohn();
//        composer4 = dataComposer.getEnnio();
//        composer5 = dataComposer.getJames();
//        composer6 = dataComposer.getNino();
//        composer7 = dataComposer.getJerry();
//        composer8 = dataComposer.getHoward();
//        composer9 = dataComposer.getAlan();


    @Test
            public void nameAndAge() {
        assertEquals("Hans 61", configComposer.nameAndAge(composers.get(0)));
        assertEquals("Alan 69", configComposer.nameAndAge(composers.get(8)));
        assertEquals("James 61", configComposer.nameAndAge(composers.get(4)));
    }

    @Test
            public void nameAndAgeHigherThanMenken(){
        assertEquals("Jerry 75", configComposer.nameAndAgeHigherThanMenken(composers.get(6), composers.get(8)));
        assertEquals("John 86", configComposer.nameAndAgeHigherThanMenken(composers.get(2), composers.get(8)));
        assertEquals( null, configComposer.nameAndAgeHigherThanMenken(composers.get(4), composers.get(8)));
    }

    @Test
            public void averageAge(){
        assertEquals(71.55, configComposer.averageAge(composers),2);

    }

    @Test
            public void maxRating(){
        assertEquals("Nino",configComposer.maxRating(composers));
    }





}
