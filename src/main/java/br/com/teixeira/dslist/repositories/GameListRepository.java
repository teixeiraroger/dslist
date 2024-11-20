package br.com.teixeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.teixeira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
