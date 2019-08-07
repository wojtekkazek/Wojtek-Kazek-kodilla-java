package com.kodilla.spring.library;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public final class LibrarySecond {
    private final List<String> books = new ArrayList<>();
    private LibraryDbControllerSecond libraryDbController;

    public LibrarySecond(final LibraryDbControllerSecond libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public LibrarySecond() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}