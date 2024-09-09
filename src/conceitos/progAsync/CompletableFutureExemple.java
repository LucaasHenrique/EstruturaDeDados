package conceitos.progAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExemple {
    public void run() throws ExecutionException, InterruptedException {
        /*CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("pikachu");
            pokemonAbilityFetchfetch.fetch();
        }).get();*/

        /*CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("charmander");
            String response = pokemonAbilityFetchfetch.fetch();
            return response;
        }).thenAccept((result) -> {
            System.out.println("resultado da busca: " + result)
        }
        );*/

        CompletableFuture pikachu1 = CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetch = new PokemonAbilityFetch("pikachu");
            String response = pokemonAbilityFetch.fetch();
        });

        //supplyAsync caso exista algum retorno
        CompletableFuture pikachu = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("pikachu");
            String response = pokemonAbilityFetchfetch.fetch();
            return response;
        });
        CompletableFuture charmander = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("charmander");
            String response = pokemonAbilityFetchfetch.fetch();
            return response;
        });

        CompletableFuture bulbasaur = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("bulbasaur");
            String response = pokemonAbilityFetchfetch.fetch();
            return response;
        });

        CompletableFuture ditto = CompletableFuture.supplyAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("ditto");
            String response = pokemonAbilityFetchfetch.fetch();
            return response;
        });

        pikachu1.join();

        CompletableFuture allpokemons = CompletableFuture.allOf(pikachu, charmander, bulbasaur, ditto);
        allpokemons.thenRun(() -> {
            try {
                System.out.println("Pikachu: " + pikachu.get());
                System.out.println("Charmander: " + charmander.get());
                System.out.println("Bulbasaur: " + bulbasaur.get());
                System.out.println("Ditto: " + ditto.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).get();

        /* .thenRun() -> chamado quando uma task e executado mas sem retorna o o reultado
        ex: .thenRun(() -> ) {
              System.out.println("busca no banco de dados completada")
        }).get();
         */
    }
}


