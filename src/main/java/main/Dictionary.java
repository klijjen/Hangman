package main;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private static final List<String> words = Arrays.asList(
            "ACTOR", "GOLD", "PAINTING",
            "ADVERTISEMENT", "GRASS", "PARROT",
            "AFTERNOON", "GREECE", "PENCIL",
            "AIRPORT", "GUITAR", "PIANO",
            "AMBULANCE", "HAIR", "PILLOW",
            "ANIMAL", "HAMBURGER", "PIZZA",
            "ANSWER", "HELICOPTER", "PLANET",
            "APPLE", "HELMET", "PLASTIC",
            "ARMY", "HOLIDAY", "PORTUGAL",
            "AUSTRALIA", "HONEY", "POTATO",
            "BALLOON", "HORSE", "QUEEN",
            "BANANA", "HOSPITAL", "QUILL",
            "BATTERY", "HOUSE", "RAIN",
            "BEACH", "HYDROGEN", "RAINBOW",
            "BEARD", "ICE", "RAINCOAT",
            "BED", "INSECT", "REFRIGERATOR",
            "BELGIUM", "INSURANCE", "RESTAURANT",
            "BOY", "IRON", "RIVER",
            "BRANCH", "ISLAND", "ROCKET",
            "BREAKFAST", "JACKAL", "ROOM",
            "BROTHER", "JELLY", "ROSE",
            "CAMERA", "JEWELLERY", "RUSSIA",
            "CANDLE", "JORDAN", "SANDWICH",
            "CAR", "JUICE", "SCHOOL",
            "CARAVAN", "KANGAROO", "SCOOTER",
            "CARPET", "KING", "SHAMPOO",
            "CARTOON", "KITCHEN", "SHOE",
            "CHINA", "KITE", "SOCCER",
            "CHURCH", "KNIFE", "SPOON",
            "CRAYON", "LAMP", "STONE",
            "CROWD", "LAWYER", "SUGAR",
            "DAUGHTER", "LEATHER", "SWEDEN",
            "DEATH", "LIBRARY", "TEACHER",
            "DENMARK", "LIGHTER", "TELEPHONE",
            "DIAMOND", "LION", "TELEVISION",
            "DINNER", "LIZARD", "TENT",
            "DISEASE", "LOCK", "THAILAND",
            "DOCTOR", "LONDON", "TOMATO",
            "DOG", "LUNCH", "TOOTHBRUSH",
            "DREAM", "MACHINE", "TRAFFIC",
            "DRESS", "MAGAZINE", "TRAIN",
            "EASTER", "MAGICIAN", "TRUCK",
            "EGG", "MANCHESTER", "UGANDA",
            "EGGPLANT", "MARKET", "UMBRELLA",
            "EGYPT", "MATCH", "VAN",
            "ELEPHANT", "MICROPHONE", "VASE",
            "ENERGY", "MONKEY", "VEGETABLE",
            "ENGINE", "MORNING", "VULTURE",
            "ENGLAND", "MOTORCYCLE", "WALL",
            "EVENING", "NAIL", "WHALE",
            "EYE", "NAPKIN", "WINDOW",
            "FAMILY", "NEEDLE", "WIRE",
            "FINLAND", "NEST", "XYLOPHONE",
            "FISH", "NIGERIA", "YACHT",
            "FLAG", "NIGHT", "YAK",
            "FLOWER", "NOTEBOOK", "ZEBRA",
            "FOOTBALL", "OCEAN", "ZOO",
            "FOREST", "OIL", "GARDEN",
            "FOUNTAIN", "ORANGE", "GAS",
            "FRANCE", "OXYGEN", "GIRL",
            "FURNITURE", "OYSTER", "GLASS",
            "GARAGE", "GHOST"
    );

    public static String getWord() {
        return words.get(new Random().nextInt(words.size()));
    }
}
