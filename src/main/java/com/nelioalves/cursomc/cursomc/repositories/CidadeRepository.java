package com.nelioalves.cursomc.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.cursomc.domain.Cidade;

/*@Repository indica que será uma interface de acesso a base de dados.
 * <Classe de Retorno, Tipo do parâmetro que fará a busca>
 * Esta interface está sendo utilizada pela classe categoriaService. 
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {

}