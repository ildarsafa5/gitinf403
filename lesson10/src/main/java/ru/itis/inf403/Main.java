package ru.itis.inf403;

import ru.itis.inf403.model.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        User admin = new User("-gigachat@12464_46.4464","12208888", Role.ADMIN);
        User user = new User("_nekto@477_","qwerty123",Role.USER);
        User[] data = new User[2];
        data[0] = admin;
        data[1] = user;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String login = sc.nextLine();
                if (login.equals("exit")) {
                    break;
                }
                String password = sc.nextLine();
                Role role1 = userCheck(login,password,data);
                if (role1 == null) {
                    throw new WrongPasswordLogin();
                }
                if (role1 == Role.ADMIN) {
                    System.out.println("Menu Admin");
                    System.out.println("1. File");
                    System.out.println("2. Create new user");
                    System.out.println("3. exit");
                    break;
                } else if (role1 == Role.USER) {
                    System.out.println("Menu User");
                    System.out.println("1. File");
                    System.out.println("2. Get play list");
                    System.out.println("3. exit");
                    break;
                }

            } catch(WrongLoginException e) {
                System.out.println("Логин должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
            } catch(WrongPasswordException e) {
                System.out.println("Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
            } catch(WrongPasswordLogin e) {
                System.out.println("Введён неверный логин или пароль");
            }
        }

    }

    public static Role userCheck(String login, String password,User[] data) throws WrongPasswordException,WrongLoginException {

        Pattern patternlogin = Pattern.compile("^(?=.{20,}$)[a-zA-Z0-9@._-]+$");
        Pattern patternpassword = Pattern.compile("^(?=.{8,}$)[a-zA-Z0-9{}\\[\\]();.,;&?!_+\\-]+$");
        Matcher loginmatcher = patternlogin.matcher(login);
        Matcher passwordmatcher = patternpassword.matcher(password);
        if (!passwordmatcher.find()) {
            throw new WrongPasswordException();
        }
        if (!loginmatcher.find()) {
            throw new WrongLoginException();
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i].getLogin().equals(login) && data[i].getPassword().equals(password)) {
                return data[i].getRole();
            }
        }
        return null;
    }
}
