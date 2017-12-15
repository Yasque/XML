package api.chocolate.xml.service;

import java.util.List;

import api.chocolate.xml.domain.Chocolate;

public interface ChocolateService {

	List<Chocolate> obtenerTodas();

	void insertarChocolate(Chocolate chocolate);

}
