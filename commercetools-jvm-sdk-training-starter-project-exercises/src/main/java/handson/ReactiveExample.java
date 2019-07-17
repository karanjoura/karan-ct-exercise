package handson;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ReactiveExample {
	public int getM1() {
		return 1;
	}

	public int getM2() {
		return 2;
	}

	public static void main(String args[]) {
		ReactiveExample reactiveExample = new ReactiveExample();

		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> reactiveExample.getM1())
				.thenComposeAsync(i -> CompletableFuture.supplyAsync(() -> i + reactiveExample.getM2()));

		try {
			System.out.println(completableFuture.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
