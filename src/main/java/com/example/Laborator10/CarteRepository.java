package com.example.Laborator10;

import com.example.Laborator10.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface CarteRepository extends JpaRepository<Carte, String> {
    Carte findByIsbn(String isbn);

    void deleteByIsbn(String isbn);

    List<Carte> findByAutor(String autor);
}
