package br.com.teixeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.teixeira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
