package conceitos.progAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFutureExemple completableFutureExemple = new CompletableFutureExemple();

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            PokemonAbilityFetch pokemonAbilityFetchfetch = new PokemonAbilityFetch("pikachu");
            pokemonAbilityFetchfetch.fetch();
        }); //chamada para a execução

        for (int i = 0; i<10; i++) {
            System.out.println("Main thread is not blocked");
            Thread.sleep(1000);
        }
        try {
            completableFuture.get(); // interrompe a thread principal
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
