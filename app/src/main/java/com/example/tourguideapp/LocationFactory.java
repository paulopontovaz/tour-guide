package com.example.tourguideapp;

import android.content.Context;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

class LocationFactory {

    static ArrayList<Location> getRestaurants(Context context) {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                context.getText(R.string.oxford_pub_name).toString(),
                                URI.create(context.getText(R.string.oxford_pub_uri).toString()),
                                context.getText(R.string.oxford_pub_address).toString(),
                                R.drawable.oxfordpub
                        ),
                        new Location(
                                context.getText(R.string.judys_pflug_name).toString(),
                                URI.create(context.getText(R.string.judys_pflug_uri).toString()),
                                context.getText(R.string.judys_pflug_address).toString(),
                                R.drawable.judyspflug
                        ),
                        new Location(
                                context.getText(R.string.guts_and_glory_name).toString(),
                                URI.create(context.getText(R.string.guts_and_glory_uri).toString()),
                                context.getText(R.string.guts_and_glory_address).toString(),
                                R.drawable.gutsandglory
                        ),
                        new Location(
                                context.getText(R.string.borsalino_name).toString(),
                                URI.create(context.getText(R.string.borsalino_uri).toString()),
                                context.getText(R.string.borsalino_address).toString(),
                                R.drawable.borsalino
                        ),
                        new Location(
                                context.getText(R.string.cafe_galerie_name).toString(),
                                URI.create(context.getText(R.string.cafe_galerie_uri).toString()),
                                context.getText(R.string.cafe_galerie_address).toString(),
                                R.drawable.cafegalerie
                        )
                )
        );
    }

    static ArrayList<Location> getCinemas(Context context) {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                context.getText(R.string.filmpalast_name).toString(),
                                URI.create(context.getText(R.string.filmpalast_uri).toString()),
                                context.getText(R.string.filmpalast_address).toString(),
                                R.drawable.filmpalast
                        ),
                        new Location(
                                context.getText(R.string.schauburg_name).toString(),
                                URI.create(context.getText(R.string.schauburg_uri).toString()),
                                context.getText(R.string.schauburg_address).toString(),
                                R.drawable.schauburg
                        ),
                        new Location(
                                context.getText(R.string.universum_name).toString(),
                                URI.create(context.getText(R.string.universum_uri).toString()),
                                context.getText(R.string.universum_address).toString(),
                                R.drawable.universumcitykinos
                        )
                )
        );
    }

    static ArrayList<Location> getMalls(Context context) {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                context.getText(R.string.ettlinger_tor_name).toString(),
                                URI.create(context.getText(R.string.ettlinger_tor_uri).toString()),
                                context.getText(R.string.ettlinger_tor_address).toString(),
                                R.drawable.ettlingertor
                        ),
                        new Location(
                                context.getText(R.string.durlach_center_name).toString(),
                                URI.create(context.getText(R.string.durlach_center_uri).toString()),
                                context.getText(R.string.durlach_center_address).toString(),
                                R.drawable.durlachcenter
                        ),
                        new Location(
                                context.getText(R.string.postgalerie_name).toString(),
                                URI.create(context.getText(R.string.postgalerie_uri).toString()),
                                context.getText(R.string.postgalerie_address).toString(),
                                R.drawable.postgalerie
                        )
                )
        );
    }

    static ArrayList<Location> getLandmarks(Context context) {
        return new ArrayList<>(
                Arrays.asList(
                        new Location(
                                context.getText(R.string.karlsruhe_castle_name).toString(),
                                URI.create(context.getText(R.string.karlsruhe_castle_uri).toString()),
                                context.getText(R.string.karlsruhe_castle_address).toString(),
                                R.drawable.karlsruhecastle
                        ),
                        new Location(
                                context.getText(R.string.zoo_name).toString(),
                                URI.create(context.getText(R.string.zoo_uri).toString()),
                                context.getText(R.string.zoo_address).toString(),
                                R.drawable.karlsruhezoo
                        ),
                        new Location(
                                context.getText(R.string.turmberg_name).toString(),
                                URI.create(context.getText(R.string.turmberg_uri).toString()),
                                context.getText(R.string.turmberg_address).toString(),
                                R.drawable.turmberg
                        ),
                        new Location(
                                context.getText(R.string.botanical_gardens_name).toString(),
                                URI.create(context.getText(R.string.botanical_gardens_uri).toString()),
                                context.getText(R.string.botanical_gardens_address).toString(),
                                R.drawable.botanicalgardens
                        ),
                        new Location(
                                context.getText(R.string.friedrichsplatz_name).toString(),
                                URI.create(context.getText(R.string.friedrichsplatz_uri).toString()),
                                context.getText(R.string.friedrichsplatz_address).toString(),
                                R.drawable.friedrichsplatz
                        ),
                        new Location(
                                context.getText(R.string.marktplatz_name).toString(),
                                URI.create(context.getText(R.string.marktplatz_uri).toString()),
                                context.getText(R.string.marktplatz_address).toString(),
                                R.drawable.marktplatz
                        ),
                        new Location(
                                context.getText(R.string.ludwigsplatz_name).toString(),
                                URI.create(context.getText(R.string.ludwigsplatz_uri).toString()),
                                context.getText(R.string.ludwigsplatz_address).toString(),
                                R.drawable.ludwigsplatz
                        ),
                        new Location(
                                context.getText(R.string.werderplatz_name).toString(),
                                URI.create(context.getText(R.string.werderplatz_uri).toString()),
                                context.getText(R.string.werderplatz_address).toString(),
                                R.drawable.werderplatz
                        )
                )
        );
    }

}
