package lambda;

import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Product> productList = ProductList.getProductList();

        productList.forEach(
                (Product product) -> {
                    System.out.println(product);
                }
        );

        System.out.println("Stream :");

        productList.forEach(System.out::println);

        Stream<Product> productStream = productList.stream();

        productStream.forEach(System.out::println);


        productList.stream()
                .map((Product product) -> {
                    return product.getPrice();
                })
                .forEach((Double price) -> {
                    System.out.println(price);
                });


        productList.stream()
                .map(Product::getName)
                .forEach(System.out::println);
    }
}
