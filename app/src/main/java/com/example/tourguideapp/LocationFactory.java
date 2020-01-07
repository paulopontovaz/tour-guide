package com.example.tourguideapp;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

public class LocationFactory {

    static ArrayList<Location> getRestaurants() {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                "Oxford Pub - Beer & Burger",
                                URI.create("https://www.oxfordpub.de/"),
                                "Fasanenstrasse 6, 76131 Karlsruhe",
                                R.drawable.oxfordpub
                        ),
                        new Location(
                                "Judy's Pflug",
                                URI.create("https://judys-pflug.de/"),
                                "Ochsentorstrasse 24, 76227 Karlsruhe",
                                R.drawable.judyspflug
                        ),
                        new Location(
                                "Guts & Glory",
                                URI.create("https://gutsandglory.bar"),
                                "Hirschhof 5, 76133 Karlsruhe",
                                R.drawable.gutsandglory
                        ),
                        new Location(
                                "Borsalino",
                                URI.create("https://www.borsalino-ka.de"),
                                "An der RaumFabrik 33C, 76227 Karlsruhe",
                                R.drawable.borsalino
                        ),
                        new Location(
                                "Cafe Galerie",
                                URI.create("https://cafegalerie.eatbu.com"),
                                "Karlsruher Allee 1, 76227 Karlsruhe",
                                R.drawable.cafegalerie
                        )
                )
        );
    }

    static ArrayList<Location> getCinemas() {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                "Filmpalast",
                                URI.create("https://www.filmpalast.net/"),
                                "Brauerstraße 40, 76135 Karlsruhe",
                                R.drawable.filmpalast
                        ),
                        new Location(
                                "Schauburg",
                                URI.create("http://www.schauburg.de/"),
                                "Marienstraße 16, 76137 Karlsruhe",
                                R.drawable.schauburg
                        ),
                        new Location(
                                "Universum-City Kinos",
                                URI.create("https://www.kinopolis.de/ka"),
                                "Kaiserstraße 152-154, 76133 Karlsruhe",
                                R.drawable.universumcitykinos
                        )
                )
        );
    }

    static ArrayList<Location> getMalls() {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                "Ettlinger Tor",
                                URI.create("https://www.ettlinger-tor.de/"),
                                "Karl-Friedrich-Str. 26, 76133 Karlsruhe",
                                R.drawable.ettlingertor
                        ),
                        new Location(
                                "Durlach Center",
                                URI.create("http://www.durlachcenter.de/"),
                                "Durlacher Allee 111, 76137 Karlsruhe",
                                R.drawable.durlachcenter
                        ),
                        new Location(
                                "Postgalerie",
                                URI.create("https://postgalerie.de"),
                                "Kaiserstrasse 217, 76133 Karlsruhe",
                                R.drawable.postgalerie
                        )
                )
        );
    }

    static ArrayList<Location> getLandmarks() {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                "Karlsruhe Castle",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Karlsruhe-Palace"),
                                "Schloßbezirk 10, 76131 Karlsruhe",
                                R.drawable.karlsruhecastle
                        ),
                        new Location(
                                "Zoological Gardens Karlsruhe",
                                URI.create("https://www.karlsruhe.de/b3/freizeit/zoo.de"),
                                "Bahnhofpl. 4, 76137 Karlsruhe",
                                R.drawable.karlsruhezoo
                        ),
                        new Location(
                                "Turmberg Castle Ruins",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Turmberg-Castle-Ruins"),
                                "Reichardtstraße 22, 76227 Karlsruhe",
                                R.drawable.turmberg
                        ),
                        new Location(
                                "Botanical Gardens",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Botanical-Gardens"),
                                "Hans-Thoma-Straße 6, 76131 Karlsruhe",
                                R.drawable.botanicalgardens
                        ),
                        new Location(
                                "Friedrichsplatz",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Friedrichsplatz-Friedrich-Square"),
                                "Ritterstraße, 76133 Karlsruhe",
                                R.drawable.friedrichsplatz
                        ),
                        new Location(
                                "Marktplatz",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Market-Square-Marktplatz-and-the-Pyramid"),
                                "Marktplatz, 76133 Karlsruhe",
                                R.drawable.marktplatz
                        ),
                        new Location(
                                "Ludwigsplatz",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Ludwigsplatz"),
                                "Ludwigsplatz, 76133 Karlsruhe",
                                R.drawable.ludwigsplatz
                        ),
                        new Location(
                                "Werderplatz",
                                URI.create("https://www.karlsruhe-erleben.de/en/media/attractions/Werderplatz"),
                                "Werderplatz, 76137 Karlsruhe",
                                R.drawable.werderplatz
                        )
                )
        );
    }

}
