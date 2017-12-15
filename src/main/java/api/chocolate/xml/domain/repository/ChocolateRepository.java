package api.chocolate.xml.domain.repository;

import org.springframework.data.repository.CrudRepository;

import api.chocolate.xml.domain.Chocolate;

public interface ChocolateRepository extends CrudRepository<Chocolate, Long> {

}
