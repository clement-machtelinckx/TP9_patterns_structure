package tp9.adapter;

import tp9.Book;

/*
    Cette classe ne doit pas être modifiée. Il s'agit du code legacy de l'ancien système de récupération de livres.
    Pour plus de simplicité, on considère ainsi que getBook renvoie une nouvelle instance de Book
    en affectant simplement le titre à cette instance et avec un prix fixe (10€).
    Imaginez que dans la vraie vie, cette méthode s'appuierait certainement sur une récupération
    d'informations en base de données.
 */

/**
 *
 */
public class OldBookStore {
    // ne rien modifier dans cette classe
    public Book getBook(String title) {
        return new Book(title, 10);
    }
}