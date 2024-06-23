package com.e_commerce.demo.app;

import com.e_commerce.demo.dtos.ProductDto;
import com.e_commerce.demo.dtos.UserDto;
import com.e_commerce.demo.database.models.Product;
import com.e_commerce.demo.database.models.User;
import com.e_commerce.demo.service.GetData;
import com.e_commerce.demo.service.RequestFromApi;
import com.e_commerce.demo.service.UserService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.e_commerce.demo.utils.Validate.isExist;

public class App {
    private final Scanner reader = new Scanner(System.in);
    private List<String> data = new ArrayList<>();
    private List<String> stepsToCreateAnAccount = List.of( "", "Nome: ", "Email: ", "Senha: ", "Endereço: ");

    private String loginOrCreateAccountMenu = """
            ****** Por favor faça login ou crie uma conta ****** 
            1 - Login
            2 - Criar conta
            """;

    private String menuStore = """
            ========= Escolha a Categoria que desejar =========
            
            1 - Eletronicos
            2 - Joias
            3 - Masculino
            4 - Feminino
            
            """;


    public void displayMenu() throws IOException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        System.out.println(loginOrCreateAccountMenu);
        var option = reader.nextInt();

        switch (option) {
            case 1:
                System.out.println("Digite seu email: ");
                var email = reader.next();
                if(login(email)) {
                    openStore(UserService.getUser());
                }
                break;
            case 2:
                for (int i = 0; i <= 4; i++) {
                    System.out.println(stepsToCreateAnAccount.get(i));
                    data.add(reader.nextLine());
                }
                var user = new User(data.get(1), data.get(2), data.get(3), data.get(4));
                createAccount(user);
                openStore(UserService.getUser());
                break;
        }



    }

    private void openStore(UserDto userDto) {
        var option = 0;
        System.out.println("========" + " Bem Vindo " + userDto.name() + " ========" + '\n');
        if(userDto.favoriteList() == null) {
            System.out.println(menuStore);
            option = reader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Produtos Disponíveis");
                    System.out.println(productbyCategory("electronics"));
                    break;
                case 2:
                    System.out.println(productbyCategory("jewelery"));
                    break;
                case 3:
                    System.out.println(productbyCategory("men's clothing"));
                    break;
                case 4:
                    System.out.println(productbyCategory("women's clothing"));
                    break;
            }



        } else {
            System.out.println( userDto.name() + " ==== Aqui estão seus intens favoritos  ==== ");
            userDto.favoriteList().stream()
                    .map(Product::new)
                    .forEach(System.out::println);
            ;
        }
    }

    private void createAccount(User user) throws IOException {
        UserService.create(user);
    }

    private List<ProductDto> getAllProducts() {
        String json = RequestFromApi.request();
        return GetData.transformsData(json, ProductDto.class);
    }

    private List<Product> formattedProducts() {
        return getAllProducts().stream()
                .map(Product::new)
                .collect(Collectors.toList());
    }

    private boolean login(String email) throws IOException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return isExist(email);
    }

    private List<Product> productbyCategory(String category) {
        return formattedProducts().stream()
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
